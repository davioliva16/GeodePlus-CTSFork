package net.yeoxuhang.geodeplus.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ClientHelper {
    @ExpectPlatform
    public static ModelLayerLocation registerModelLayer(ModelLayerLocation layerLocation, Supplier<LayerDefinition> createBodyLayer) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Block> void putRenderLayer(T block, RenderType renderType) {
        throw new AssertionError();
    }
}
