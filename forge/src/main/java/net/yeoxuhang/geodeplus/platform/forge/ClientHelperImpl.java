package net.yeoxuhang.geodeplus.platform.forge;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ClientHelperImpl {
    public static ArrayList<Pair<ModelLayerLocation, Supplier<LayerDefinition>>> modelLayerLocations = new ArrayList<>();

    public static ModelLayerLocation registerModelLayer(ModelLayerLocation layerLocation, Supplier<LayerDefinition> layerDefinition) {
        modelLayerLocations.add(new Pair<>(layerLocation, layerDefinition));
        return layerLocation;
    }

    public static <T extends Block> void putRenderLayer(T block, RenderType renderType) {
        ItemBlockRenderTypes.setRenderLayer(block, renderType);
    }
}
