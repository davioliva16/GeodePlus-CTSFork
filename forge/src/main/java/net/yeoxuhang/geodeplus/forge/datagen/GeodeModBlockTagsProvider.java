package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;

public class GeodeModBlockTagsProvider extends BlockTagsProvider {
    public GeodeModBlockTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodeModBlocksRegistry.GALCITE.get(),
                GeodeModBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodeModBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_ECHO.get(),
                GeodeModBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodeModBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodeModBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodeModBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_PRISMARINE_BUD.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                GeodeModBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get(),
                GeodeModBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get(),
                GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_LAPIS.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodeModBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodeModBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodeModBlocksRegistry.GALCITE.get(),
                GeodeModBlocksRegistry.BUDDING_ECHO.get(),
                GeodeModBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodeModBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(),
                GeodeModBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodeModBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodeModBlocksRegistry.SMALL_PRISMARINE_BUD.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                GeodeModBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodeModBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodeModBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodeModBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodeModBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodeModBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodeModBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get()
        );
        this.tag(GeodeModTagsRegistry.Blocks.CAN_LARGE_ECHO_CRYSTAL_PLACE).add(Blocks.SCULK,
                Blocks.STONE,
                Blocks.DEEPSLATE);

        this.tag(GeodeModTagsRegistry.Blocks.CAN_LARGE_PRISMARINE_CRYSTAL_PLACE).add(Blocks.SAND,
                Blocks.STONE,
                Blocks.GRAVEL,
                Blocks.CLAY,
                Blocks.SANDSTONE);

        this.tag(GeodeModTagsRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE).add(Blocks.END_STONE);

        this.tag(GeodeModTagsRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON).add(Blocks.AIR,
                Blocks.CAVE_AIR,
                Blocks.VOID_AIR);

        this.tag(BlockTags.WALLS).add(
                GeodeModBlocksRegistry.SMOOTH_END_STONE_WALL.get()
        );
    }
}
