package net.yeoxuhang.geodeplus.client;

import net.minecraft.client.renderer.RenderType;
import net.yeoxuhang.geodeplus.client.model.layer.GeodeModModelLayers;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geodeplus.platform.ClientHelper;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2022
 */
public class GeodeClient {

	public static void initClient() {
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LAPIS_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.EMERALD_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get(), RenderType.cutout());
		//Quartz Crystal
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		//Glowstone Cluster
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.ECHO_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.PRISMARINE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.LARGE_PRISMARINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.SMALL_PRISMARINE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get(), RenderType.cutout());
	}
}
