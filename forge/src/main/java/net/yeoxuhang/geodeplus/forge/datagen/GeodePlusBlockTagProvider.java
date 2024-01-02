package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GeodePlusBlockTagProvider extends BlockTagsProvider {

    public GeodePlusBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodePlusBlocksRegistry.GALCITE.get(),
                GeodePlusBlocksRegistry.GALCITE_SLAB.get(),
                GeodePlusBlocksRegistry.GALCITE_STAIRS.get(),
                GeodePlusBlocksRegistry.GALCITE_WALL.get(),
                GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_ECHO.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_CELESTITE.get(),
                GeodePlusBlocksRegistry.CELESTITE_BLOCK.get(),
                GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get(),

                GeodePlusBlocksRegistry.WRAPPIST_GLASS.get(),
                GeodePlusBlocksRegistry.CELESTITE_GLASS.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),

                GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get(),

                GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(),

                GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodePlusBlocksRegistry.GALCITE.get(),
                GeodePlusBlocksRegistry.GALCITE_SLAB.get(),
                GeodePlusBlocksRegistry.GALCITE_STAIRS.get(),
                GeodePlusBlocksRegistry.GALCITE_WALL.get(),

                GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(),

                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(),

                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_ECHO.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_CELESTITE.get(),
                GeodePlusBlocksRegistry.CELESTITE_BLOCK.get(),
                GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get(),

                GeodePlusBlocksRegistry.WRAPPIST_GLASS.get(),
                GeodePlusBlocksRegistry.CELESTITE_GLASS.get(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get()
        );
        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_ECHO_CRYSTAL_PLACE).add(Blocks.SCULK,
                Blocks.STONE,
                Blocks.DEEPSLATE);

        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_PRISMARINE_CRYSTAL_PLACE).add(Blocks.SAND,
                Blocks.STONE,
                Blocks.GRAVEL,
                Blocks.CLAY,
                Blocks.SANDSTONE);

        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE).add(Blocks.END_STONE);

        this.tag(GeodePlusTagRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON).add(Blocks.AIR,
                Blocks.CAVE_AIR,
                Blocks.VOID_AIR);

        this.tag(BlockTags.WALLS).add(
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodePlusBlocksRegistry.GALCITE_WALL.get()
        );
        this.tag(GeodePlusTagRegistry.Blocks.GEODE_INVALID_BLOCKS).add(
                Blocks.BEDROCK,
                Blocks.ICE,
                Blocks.BLUE_ICE,
                Blocks.PACKED_ICE,
                Blocks.LAVA
        );
        this.tag(GeodePlusTagRegistry.Blocks.GEODES_CANNOT_REPLACE).add(Blocks.BEDROCK, Blocks.SPAWNER, Blocks.CHEST, Blocks.END_PORTAL_FRAME, Blocks.REINFORCED_DEEPSLATE).addTags(BlockTags.STONE_BRICKS);
        this.tag(GeodePlusTagRegistry.Blocks.BUDS)
                .add(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get())
                .add(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get())
                .add(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get())
                .add(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get());
        this.tag(GeodePlusTagRegistry.Blocks.CLUSTERS)
                .add(GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get())
                .add(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get())
                .add(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get())
                .add(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get())
                .add(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get())
                .add(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get())
                .add(GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get())
                .add(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get())
                .add(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get())
                .add(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get())
                .add(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get());
        this.tag(GeodePlusTagRegistry.Blocks.BUDDING_BLOCKS)
                .add(GeodePlusBlocksRegistry.BUDDING_CELESTITE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ.get())
                .add(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get())
                .add(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get())
                .add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get())
                .add(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get())
                .add(GeodePlusBlocksRegistry.BUDDING_EMERALD.get())
                .add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get())
                .add(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get())
                .add(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get())
                .add(GeodePlusBlocksRegistry.BUDDING_LAPIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get())
                .add(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get())
                .add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get())
                .add(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get())
                .add(GeodePlusBlocksRegistry.BUDDING_ECHO.get())
                .add(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
    }
}

