package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.yeoxuhang.geodeplus.client.GeodePlusClient;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlockEntityRegistry;

public class GeodePlusFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeodePlusClient.initClient();
        BlockEntityRendererRegistry.register(GeodePlusBlockEntityRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
    }
}
