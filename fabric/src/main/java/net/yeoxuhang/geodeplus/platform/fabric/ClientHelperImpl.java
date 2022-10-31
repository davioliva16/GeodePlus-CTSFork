package net.yeoxuhang.geodeplus.platform.fabric;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ClientHelperImpl {

    public static ModelLayerLocation registerModelLayer(ModelLayerLocation layerLocation, Supplier<LayerDefinition> layerDefinition) {
        EntityModelLayerRegistry.registerModelLayer(layerLocation, layerDefinition::get);
        return layerLocation;
    }

    public static <T extends Block> void putRenderLayer(T block, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, renderType);
    }
}