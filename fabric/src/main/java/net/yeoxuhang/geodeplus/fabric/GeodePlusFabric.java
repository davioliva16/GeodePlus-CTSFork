package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.stream.Stream;

public class GeodePlusFabric implements ModInitializer {
    private static final CreativeModeTab TAB = FabricItemGroup.builder(new ResourceLocation(GeodePlus.MOD_ID, "tab"))
            .icon(() -> new ItemStack(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get())).build();
    @Override
    public void onInitialize() {
        GeodePlus.init();
        registerCreativeTab();
        //new GeodePlusGeodeBiomeModifier().biomeModificationHelper();
    }
    private void registerCreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(TAB).register(content -> content.acceptAll(Stream.of(
                GeodePlusBlocksRegistry.BUDDING_CELESTINE,
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER_BLOCK,
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD,
                GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD,
                GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD,
                GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD,

                GeodePlusBlocksRegistry.BUDDING_PRISMARINE,
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK,
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD,
                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD,
                GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD,

                GeodePlusBlocksRegistry.BUDDING_LAPIS,
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS,
                GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS,
                GeodePlusBlocksRegistry.LAPIS_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD,
                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD,
                GeodePlusBlocksRegistry.SMALL_LAPIS_BUD,

                GeodePlusBlocksRegistry.BUDDING_REDSTONE,
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE,
                GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE,
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL,
                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD,
                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD,
                GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD,

                GeodePlusBlocksRegistry.BUDDING_EMERALD,
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD,
                GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD,
                GeodePlusBlocksRegistry.EMERALD_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD,
                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD,
                GeodePlusBlocksRegistry.SMALL_EMERALD_BUD,

                GeodePlusBlocksRegistry.BUDDING_DIAMOND,
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND,
                GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND,
                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL,
                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD,
                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD,
                GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD,

                GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ,
                GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ,
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ,
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK,
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL,
                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD,
                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD,
                GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD,

                GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET,
                GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET,
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET,
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK,
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD,
                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD,
                GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD,

                GeodePlusBlocksRegistry.BUDDING_GLOWSTONE,
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE,
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE,
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK,
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD,
                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD,
                GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD,

                GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS,
                GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS,
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD,

                GeodePlusBlocksRegistry.SMOOTH_END_STONE,
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS,
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB,
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL,

                GeodePlusBlocksRegistry.GALCITE,

                GeodePlusBlocksRegistry.WRAPPIST_BLOCK,
                GeodePlusBlocksRegistry.BUDDING_WRAPPIST,
                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER,
                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD,
                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD,
                GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD,

                GeodePlusBlocksRegistry.BUDDING_ECHO,
                GeodePlusBlocksRegistry.ECHO_CRYSTAL,
                GeodePlusBlocksRegistry.LARGE_ECHO_BUD,
                GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD,
                GeodePlusBlocksRegistry.SMALL_ECHO_BUD,

                GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL,

                GeodePlusItemsRegistry.WRAPPIST_SHARD,
                GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN
        ).map(item -> item.get().asItem().getDefaultInstance()).toList()));
    }
}