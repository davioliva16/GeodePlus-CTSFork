package net.yeoxuhang.geodeplus.client.model.layer;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.model.DeepslateLampBlockEntityModel;
import net.yeoxuhang.geodeplus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geodeplus.platform.ClientHelper;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class GeodePlusModelLayersRegistry {
    public static final ModelLayerLocation WRAPPIST_PEDESTAL = register("wrappist_pedestal", "main", WrappistPedestalBlockEntityModel::createBodyLayer);
    public static final ModelLayerLocation DEEPSLATE_LAMP = register("deepslate_lamp", "main", DeepslateLampBlockEntityModel::createBodyLayer);

    private static ModelLayerLocation register(String model, String layer, Supplier<LayerDefinition> createBodyLayer) {
        return ClientHelper.registerModelLayer(new ModelLayerLocation(new ResourceLocation(GeodePlus.MOD_ID, model), layer), createBodyLayer);
    }
    public static void initialize() {};
}
