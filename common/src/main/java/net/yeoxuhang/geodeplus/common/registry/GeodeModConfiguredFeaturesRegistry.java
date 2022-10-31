package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.world.feature.config.GeodeCrystalSpikeConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
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

public class GeodeModConfiguredFeaturesRegistry {
    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> CRYSTAL_SPIKE =
            registerConfiguredFeature("crystal_spike", GeodeModFeaturesRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), ((Block)GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> CRYSTAL_SPIKE_FLOOR =
            registerConfiguredFeature("crystal_spike_floor", GeodeModFeaturesRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), ((Block)GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));


    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> GLOWSTONE_CRYSTAL_SPIKE =
            registerConfiguredFeature("glowstone_crystal_spike", GeodeModFeaturesRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)Blocks.GLOWSTONE).defaultBlockState(), ((Block)GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> GLOWSTONE_CRYSTAL_SPIKE_FLOOR =
            registerConfiguredFeature("glowstone_crystal_spike_floor", GeodeModFeaturesRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)Blocks.GLOWSTONE).defaultBlockState(), ((Block)GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));

    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> ECHO_CRYSTAL_SPIKE =
            registerConfiguredFeature("echo_crystal_spike", GeodeModFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)Blocks.SCULK).defaultBlockState(), ((Block)GeodeModBlocksRegistry.ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> ECHO_CRYSTAL_SPIKE_FLOOR =
            registerConfiguredFeature("echo_crystal_spike_floor", GeodeModFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(((Block)Blocks.SCULK).defaultBlockState(), ((Block)GeodeModBlocksRegistry.ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));

    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> WRAPPIST_CRYSTAL_SPIKE =
            registerConfiguredFeature("wrappist_crystal_spike", GeodeModFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((GeodeModBlocksRegistry.WRAPPIST_BLOCK.get()).defaultBlockState(), ((Block)GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
    public static final Holder<ConfiguredFeature<GeodeCrystalSpikeConfig, ?>> WRAPPIST_CRYSTAL_SPIKE_FLOOR =
            registerConfiguredFeature("wrappist_crystal_spike_floor", GeodeModFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((GeodeModBlocksRegistry.WRAPPIST_BLOCK.get()).defaultBlockState(), ((Block)GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> GLOWSTONE_GEODE =
            FeatureUtils.register("glowstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(Blocks.NETHERRACK),
                            BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get()),
                            BlockStateProvider.simple(Blocks.NETHERRACK),
                            BlockStateProvider.simple(Blocks.NETHERRACK),
                            List.of(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                    GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                    GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                    GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> GOLD_NUGGET_GEODE =
            FeatureUtils.register("gold_nugget_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get()),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    List.of(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> WRAPPIST_GEODE =
            FeatureUtils.register("wrappist_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.WRAPPIST_BLOCK.get()),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_WRAPPIST.get()),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.GALCITE.get()),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.SMOOTH_END_STONE.get()),
                                    List.of(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));;

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> BASALT_GLOWSTONE_GEODE =
            FeatureUtils.register("basalt_glowstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get()),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    List.of(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));;


    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> BLACKSTONE_GLOWSTONE_GEODE =
            FeatureUtils.register("blackstone_glowstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get()),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    List.of(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));;

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> QUARTZ_GEODE =
            FeatureUtils.register("quartz_geode", Feature.GEODE ,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get()),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    List.of(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE ,
                                    BlockTags.GEODE_INVALID_BLOCKS) ,
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> BASALT_QUARTZ_GEODE =
            FeatureUtils.register("basalt_quartz_geode",
                    Feature.GEODE , new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get()),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    BlockStateProvider.simple(Blocks.NETHERRACK),
                                    List.of(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE ,
                                    BlockTags.GEODE_INVALID_BLOCKS) ,
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> BLACKSTONE_QUARTZ_GEODE =
            FeatureUtils.register("blackstone_quartz_geode",
                    Feature.GEODE , new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get()),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    BlockStateProvider.simple(Blocks.BLACKSTONE),
                                    List.of(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE ,
                                    BlockTags.GEODE_INVALID_BLOCKS) ,
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> ECHO_GEODE =
            FeatureUtils.register("echo_geode", Feature.GEODE ,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_ECHO.get()),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    List.of(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_ECHO_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.ECHO_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE ,
                                    BlockTags.GEODE_INVALID_BLOCKS) ,
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> LAPIS_GEODE =
            FeatureUtils.register("lapis_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_LAPIS.get()),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    List.of(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> REDSTONE_GEODE =
            FeatureUtils.register("redstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_REDSTONE.get()),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    List.of(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> EMERALD_GEODE =
            FeatureUtils.register("emerald_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_EMERALD.get()),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    List.of(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> DIAMOND_GEODE =
            FeatureUtils.register("diamond_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_DIAMOND.get()),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    BlockStateProvider.simple(Blocks.STONE),
                                    List.of(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> DEEPSLATE_LAPIS_GEODE =
            FeatureUtils.register("deepslate_lapis_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get()),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    List.of(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> DEEPSLATE_REDSTONE_GEODE =
            FeatureUtils.register("deepslate_redstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get()),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    List.of(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> DEEPSLATE_EMERALD_GEODE =
            FeatureUtils.register("deepslate_emerald_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get()),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    List.of(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> DEEPSLATE_DIAMOND_GEODE =
            FeatureUtils.register("deepslate_diamond_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get()),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    BlockStateProvider.simple(Blocks.DEEPSLATE),
                                    List.of(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SCULK_LAPIS_GEODE =
            FeatureUtils.register("sculk_lapis_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_SCULK_LAPIS.get()),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    List.of(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LAPIS_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SCULK_REDSTONE_GEODE =
            FeatureUtils.register("sculk_redstone_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_SCULK_REDSTONE.get()),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    List.of(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SCULK_EMERALD_GEODE =
            FeatureUtils.register("sculk_emerald_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_SCULK_EMERALD.get()),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    List.of(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.EMERALD_CLUSTER.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SCULK_DIAMOND_GEODE =
            FeatureUtils.register("sculk_diamond_geode", Feature.GEODE,
                    new GeodeConfiguration(
                            new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(GeodeModBlocksRegistry.BUDDING_SCULK_DIAMOND.get()),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    BlockStateProvider.simple(Blocks.SCULK),
                                    List.of(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                            GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get().defaultBlockState()),
                                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));


    public static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> registerConfiguredFeature(String name, F feature, FC featureConfiguration) {
        ResourceLocation resourceLocation = new ResourceLocation(GeodePlus.MOD_ID, name);
        if (BuiltinRegistries.CONFIGURED_FEATURE.keySet().contains(resourceLocation)) {
            throw new IllegalStateException("Placed Feature ID: \"" + resourceLocation + "\" already exists in the Placed Features registry!");
        } else {
            return BuiltinRegistries.registerExact(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation.toString(), new ConfiguredFeature(feature, featureConfiguration));
        }
    }

    public static void initialize() {};
}
