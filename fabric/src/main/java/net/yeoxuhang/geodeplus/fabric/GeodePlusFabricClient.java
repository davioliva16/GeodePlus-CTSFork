package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlockEntitiesRegistry;

public class GeodePlusFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeodePlus.initClient();
        BlockEntityRendererRegistry.register(GeodeModBlockEntitiesRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
    }
}
