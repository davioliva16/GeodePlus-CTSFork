package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.world.feature.config.GeodeCrystalSpikeConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;

public class GeodePlusConfiguredFeatureRegistry {
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_GEODE = registerKey("prismarine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_GEODE = registerKey("wrappist_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_GEODE = registerKey("echo_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_SPIKE = registerKey("crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_SPIKE_FLOOR = registerKey("crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE = registerKey("glowstone_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = registerKey("glowstone_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE = registerKey("echo_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE_FLOOR = registerKey("echo_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_CRYSTAL_SPIKE = registerKey("prismarine_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_CRYSTAL_SPIKE = registerKey("wrappist_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DEBRIS_GEODE = registerKey("ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_ANCIENT_DEBRIS_GEODE = registerKey("basalt_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_ANCIENT_DEBRIS_GEODE = registerKey("blackstone_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_GEODE = registerKey("glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GLOWSTONE_GEODE = registerKey("basalt_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GLOWSTONE_GEODE = registerKey("blackstone_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_NUGGET_GEODE = registerKey("gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GOLD_NUGGET_GEODE = registerKey("basalt_gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GOLD_NUGGET_GEODE = registerKey("blackstone_gold_nugget_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE = registerKey("quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_QUARTZ_GEODE = registerKey("basalt_quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_QUARTZ_GEODE = registerKey("blackstone_quartz_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_GEODE = registerKey("diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_DIAMOND_GEODE = registerKey("deepslate_diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_DIAMOND_GEODE = registerKey("sculk_diamond_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_GEODE = registerKey("emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_EMERALD_GEODE = registerKey("deepslate_emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_EMERALD_GEODE = registerKey("sculk_emerald_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_GEODE = registerKey("lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_LAPIS_GEODE = registerKey("deepslate_lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_LAPIS_GEODE = registerKey("sculk_lapis_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_GEODE = registerKey("redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_REDSTONE_GEODE = registerKey("deepslate_redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_REDSTONE_GEODE = registerKey("sculk_redstone_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CELESTITE_GEODE = registerKey("celestite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_TOPAZ_GEODE = registerKey("pink_topaz_geode");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, CRYSTAL_SPIKE, GeodePlusFeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), (GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, CRYSTAL_SPIKE_FLOOR, GeodePlusFeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), (GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, GLOWSTONE_CRYSTAL_SPIKE, GeodePlusFeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get().defaultBlockState(), (GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, GLOWSTONE_CRYSTAL_SPIKE_FLOOR, GeodePlusFeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get().defaultBlockState(), (GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, ECHO_CRYSTAL_SPIKE, GeodePlusFeatureRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((Blocks.SCULK).defaultBlockState(), (GeodePlusBlocksRegistry.ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, ECHO_CRYSTAL_SPIKE_FLOOR, GeodePlusFeatureRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((Blocks.SCULK).defaultBlockState(), (GeodePlusBlocksRegistry.ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, WRAPPIST_CRYSTAL_SPIKE, GeodePlusFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get()).defaultBlockState(), (GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, PRISMARINE_CRYSTAL_SPIKE, GeodePlusFeatureRegistry.OCEAN_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get().defaultBlockState(), (GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, ANCIENT_DEBRIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_ANCIENT_DEBRIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_ANCIENT_DEBRIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, GLOWSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_GLOWSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_GLOWSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, GOLD_NUGGET_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_GOLD_NUGGET_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_GOLD_NUGGET_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, QUARTZ_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_QUARTZ_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_QUARTZ_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get()),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        BlockStateProvider.simple(Blocks.NETHERRACK),
                        List.of(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, ECHO_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(Blocks.SCULK),
                BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_ECHO.get()),
                BlockStateProvider.simple(Blocks.SCULK),
                BlockStateProvider.simple(Blocks.SCULK),
                List.of(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get().defaultBlockState(),
                        GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get().defaultBlockState(),
                        GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get().defaultBlockState(),
                        GeodePlusBlocksRegistry.ECHO_CRYSTAL.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE ,
                BlockTags.GEODE_INVALID_BLOCKS) ,
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, WRAPPIST_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get()),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get()),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.GALCITE.get()),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get()),
                        List.of(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PRISMARINE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.WATER),
                        BlockStateProvider.simple(Blocks.PRISMARINE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get()),
                        BlockStateProvider.simple(Blocks.PRISMARINE),
                        BlockStateProvider.simple(Blocks.PRISMARINE),
                        List.of(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DIAMOND_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get()),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(Blocks.STONE),
                        List.of(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_DIAMOND_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get()),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        List.of(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_DIAMOND_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get()),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(Blocks.SCULK),
                        List.of(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, EMERALD_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_EMERALD.get()),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(Blocks.STONE),
                        List.of(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_EMERALD_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get()),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        List.of(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_EMERALD_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get()),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(Blocks.SCULK),
                        List.of(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, LAPIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_LAPIS.get()),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(Blocks.STONE),
                        List.of(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_LAPIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get()),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        List.of(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_LAPIS_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get()),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(Blocks.SCULK),
                        List.of(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, REDSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get()),
                        BlockStateProvider.simple(Blocks.STONE),
                        BlockStateProvider.simple(Blocks.STONE),
                        List.of(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_REDSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get()),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        List.of(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_REDSTONE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get()),
                        BlockStateProvider.simple(Blocks.SCULK),
                        BlockStateProvider.simple(Blocks.SCULK),
                        List.of(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, CELESTITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.CELESTITE_BLOCK.get()),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_CELESTITE.get()),
                        BlockStateProvider.simple(Blocks.CALCITE),
                        BlockStateProvider.simple(Blocks.MUD),
                        List.of(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, GeodePlusTagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PINK_TOPAZ_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get()),
                        BlockStateProvider.simple(GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ.get()),
                        BlockStateProvider.simple(Blocks.CALCITE),
                        BlockStateProvider.simple(Blocks.MUD),
                        List.of(GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void initialize() {};
}