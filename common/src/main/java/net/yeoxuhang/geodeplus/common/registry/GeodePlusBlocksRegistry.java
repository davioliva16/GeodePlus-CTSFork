package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.world.level.block.*;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.yeoxuhang.geodeplus.common.block.*;

import java.util.function.Supplier;

public class GeodePlusBlocksRegistry {

    public static final Supplier<Block> BUDDING_PRISMARINE = registerBlock("budding_prismarine",
            () -> new BuddingPrismarineBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> PRISMARINE_CLUSTER_BLOCK = registerBlock("prismarine_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.STONE)), GeodePlus.TAB);
    public static final Supplier<Block> PRISMARINE_CLUSTER = registerBlock("prismarine_cluster",
            () -> new PrismarineClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_PRISMARINE_BUD = registerBlock("large_prismarine_bud",
            () -> new PrismarineClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_PRISMARINE_BUD = registerBlock("medium_prismarine_bud",
            () -> new PrismarineClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_PRISMARINE_BUD = registerBlock("small_prismarine_bud",
            () -> new PrismarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_LAPIS = registerBlock("budding_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_DEEPSLATE_LAPIS = registerBlock("budding_deepslate_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_SCULK_LAPIS = registerBlock("budding_sculk_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> LAPIS_CLUSTER = registerBlock("lapis_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_LAPIS_BUD = registerBlock("large_lapis_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_LAPIS_BUD = registerBlock("medium_lapis_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_LAPIS_BUD = registerBlock("small_lapis_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_REDSTONE = registerBlock("budding_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_DEEPSLATE_REDSTONE = registerBlock("budding_deepslate_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_SCULK_REDSTONE = registerBlock("budding_sculk_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> REDSTONE_CRYSTAL = registerBlock("redstone_crystal",
            () -> new RedstoneOresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_REDSTONE_BUD = registerBlock("large_redstone_bud",
            () -> new RedstoneOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_REDSTONE_BUD = registerBlock("medium_redstone_bud",
            () -> new RedstoneOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_REDSTONE_BUD = registerBlock("small_redstone_bud",
            () -> new RedstoneOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_EMERALD = registerBlock("budding_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_DEEPSLATE_EMERALD = registerBlock("budding_deepslate_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_SCULK_EMERALD = registerBlock("budding_sculk_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> EMERALD_CLUSTER = registerBlock("emerald_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_DIAMOND = registerBlock("budding_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_DEEPSLATE_DIAMOND = registerBlock("budding_deepslate_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_SCULK_DIAMOND = registerBlock("budding_sculk_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> DIAMOND_CRYSTAL = registerBlock("diamond_crystal",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.STONE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud",
            () -> new OresClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud",
            () -> new OresClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.STONE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud",
            () -> new OresClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.STONE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_NETHER_QUARTZ = registerBlock("budding_nether_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BASALT_QUARTZ = registerBlock("budding_basalt_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.BASALT).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BLACKSTONE_QUARTZ = registerBlock("budding_blackstone_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> QUARTZ_CRYSTAL_BLOCK = registerBlock("quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), GeodePlus.TAB);
    public static final Supplier<Block> QUARTZ_CRYSTAL = registerBlock("quartz_crystal",
            () -> new QuartzCrystalBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.NETHER_ORE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud",
            () -> new QuartzCrystalBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud",
            () -> new QuartzCrystalBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud",
            () -> new QuartzCrystalBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.NETHER_ORE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_GOLD_NUGGET = registerBlock("budding_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BASALT_GOLD_NUGGET = registerBlock("budding_basalt_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BLACKSTONE_GOLD_NUGGET = registerBlock("budding_blackstone_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> GOLD_NUGGET_CLUSTER_BLOCK = registerBlock("gold_nugget_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.STONE)), GeodePlus.TAB);
    public static final Supplier<Block> GOLD_NUGGET_CLUSTER = registerBlock("gold_nugget_cluster",
            () -> new NetherGoldClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.NETHER_GOLD_ORE).strength(3F).lightLevel( (p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_GOLD_NUGGET_BUD = registerBlock("large_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_GOLD_NUGGET_BUD = registerBlock("medium_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_GOLD_NUGGET_BUD = registerBlock("small_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.NETHER_GOLD_ORE)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_GLOWSTONE = registerBlock("budding_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BASALT_GLOWSTONE = registerBlock("budding_basalt_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BLACKSTONE_GLOWSTONE = registerBlock("budding_blackstone_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);

    public static final Supplier<Block> GLOWSTONE_CLUSTER_BLOCK = registerBlock("glowstone_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.GLASS)), GeodePlus.TAB);
    public static final Supplier<Block> GLOWSTONE_CLUSTER = registerBlock("glowstone_cluster",
            () -> new GlowstoneClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.GLASS).strength(3F).lightLevel( (p_60929_) ->{
                return 15;
            } )), GeodePlus.TAB);

    public static final Supplier<Block> LARGE_GLOWSTONE_BUD = registerBlock("large_glowstone_bud",
            () -> new GlowstoneClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 5;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_GLOWSTONE_BUD = registerBlock("medium_glowstone_bud",
            () -> new GlowstoneClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 3;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_GLOWSTONE_BUD = registerBlock("small_glowstone_bud",
            () -> new GlowstoneClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.GLASS).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_ANCIENT_DEBRIS = registerBlock("budding_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BASALT_ANCIENT_DEBRIS = registerBlock("budding_basalt_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = registerBlock("budding_blackstone_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> {
                return 10;
            })), GeodePlus.TAB);
    public static final Supplier<Block> ANCIENT_DEBRIS_CLUSTER = registerBlock("ancient_debris_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.ANCIENT_DEBRIS).strength(10F).lightLevel((p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);

    public static final Supplier<Block> LARGE_ANCIENT_DEBRIS_BUD = registerBlock("large_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(5, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> {
                return 5;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_ANCIENT_DEBRIS_BUD = registerBlock("medium_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(4, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> {
                return 3;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_ANCIENT_DEBRIS_BUD = registerBlock("small_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(3, 4, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);

    public static final Supplier<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.BASALT)), GeodePlus.TAB);
    public static final Supplier<Block> SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            () -> new StairBlock(SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())), GeodePlus.TAB);
    public static final Supplier<Block> SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.BASALT)), GeodePlus.TAB);
    public static final Supplier<Block> SMOOTH_END_STONE_WALL = registerBlock("smooth_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())), GeodePlus.TAB);
    public static final Supplier<Block> GALCITE = registerBlock("galcite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f, 1200).sound(SoundType.CALCITE)), GeodePlus.TAB);
    public static final Supplier<Block> WRAPPIST_BLOCK = registerBlock("wrappist_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).sound(SoundType.AMETHYST)), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_WRAPPIST = registerBlock("budding_wrappist",
            () -> new BuddingWrappistBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), GeodePlus.TAB);
    public static final Supplier<Block> WRAPPIST_CLUSTER = registerBlock("wrappist_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(3F).lightLevel((p_60929_) ->{
                return 8;
            } )), GeodePlus.TAB);

    public static final Supplier<Block> LARGE_WRAPPIST_BUD = registerBlock("large_wrappist_bud",
            () -> new WrappistClusterBlock(5, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 6;
    })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_WRAPPIST_BUD = registerBlock("medium_wrappist_bud",
            () -> new WrappistClusterBlock(4, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 3;
    })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_WRAPPIST_BUD = registerBlock("small_wrappist_bud",
            () -> new WrappistClusterBlock(3, 4, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 2;
    })), GeodePlus.TAB);

    public static final Supplier<Block> BUDDING_ECHO = registerBlock("budding_echo",
            () -> new BuddingEchoBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(5F).sound(SoundType.SCULK).requiresCorrectToolForDrops()), GeodePlus.TAB);

    public static final Supplier<Block> ECHO_CRYSTAL = registerBlock("echo_crystal",
            () -> new EchoCrystalBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(4F).lightLevel((p_60929_) ->{
                return 3;
            })), GeodePlus.TAB);
    public static final Supplier<Block> LARGE_ECHO_BUD = registerBlock("large_echo_bud",
            () -> new EchoCrystalBlock(5, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> {
                return 2;
            })), GeodePlus.TAB);
    public static final Supplier<Block> MEDIUM_ECHO_BUD = registerBlock("medium_echo_bud",
            () -> new EchoCrystalBlock(4, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> {
                return 1;
            })), GeodePlus.TAB);
    public static final Supplier<Block> SMALL_ECHO_BUD = registerBlock("small_echo_bud",
            () -> new EchoCrystalBlock(3, 4, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST)), GeodePlus.TAB);

    public static final Supplier<Block> WRAPPIST_PEDESTAL = registerBlock("wrappist_pedestal",
            () -> new WrappistPedestalBlock(BlockBehaviour.Properties.copy(WRAPPIST_BLOCK.get()).noOcclusion().lightLevel((p_60929_) -> {
                return 8;
            })), GeodePlus.TAB);

    private static <T extends Block> Supplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return RegistryHelper.registerBlock(name, block);
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        Supplier<T> toReturn = RegistryHelper.registerBlock(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block,
                                                                            CreativeModeTab tab) {
        return RegistryHelper.registerItem(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void initialize() {};
}
