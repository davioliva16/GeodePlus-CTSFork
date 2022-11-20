package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;
import java.util.function.Supplier;

public class GeodeModPlacedFeaturesRegistry {
    public static final Supplier<PlacedFeature> PRISMARINE_GEODE = RegistryHelper.registerPlacedFeature("prismarine_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.PRISMARINE_GEODE, List.of(rarityOceanGeode(), inSquarePlacement(), placementOceanModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.QUARTZ_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BASALT_QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("basalt_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_QUARTZ_GEODE, List.of(rarityBasaltGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("blackstone_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BLACKSTONE_QUARTZ_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> WRAPPIST_GEODE = RegistryHelper.registerPlacedFeature("wrappist_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_GEODE, List.of(rarityEndGeode(), inSquarePlacement(), placementEndModifier(), biomeFilter())));


    public static final Supplier<PlacedFeature> GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ANCIENT_DEBRIS_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BASALT_ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("basalt_ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_ANCIENT_DEBRIS_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BLACKSTONE_ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("blackstone_ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BASALT_GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("basalt_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_GLOWSTONE_GEODE, List.of(rarityBasaltGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("blackstone_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BLACKSTONE_GLOWSTONE_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GOLD_NUGGET_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BASALT_GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("basalt_gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BASALT_GOLD_NUGGET_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> BLACKSTONE_GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("blackstone_gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.BLACKSTONE_GOLD_NUGGET_GEODE, List.of(rarityNetherGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_GEODE = RegistryHelper.registerPlacedFeature("echo_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_GEODE, List.of(rarityDeepDarkGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> LAPIS_GEODE = RegistryHelper.registerPlacedFeature("lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> EMERALD_GEODE = RegistryHelper.registerPlacedFeature("emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementRareModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementRareModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_LAPIS_GEODE = RegistryHelper.registerPlacedFeature("deepslate_lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.DEEPSLATE_LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("deepslate_redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.DEEPSLATE_REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_EMERALD_GEODE = RegistryHelper.registerPlacedFeature("deepslate_emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.DEEPSLATE_EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("deepslate_diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.DEEPSLATE_DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_LAPIS_GEODE = RegistryHelper.registerPlacedFeature("sculk_lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.SCULK_LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("sculk_redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.SCULK_REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_EMERALD_GEODE = RegistryHelper.registerPlacedFeature("sculk_emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.SCULK_EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("sculk_diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.SCULK_DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("quartz_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("quartz_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("glowstone_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("glowstone_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("echo_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("echo_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("wrappist_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("wrappist_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> PRISMARINE_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("prismarine_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodeModConfiguredFeaturesRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementOceanModifier(), biomeFilter())));

    private static RarityFilter rarityOceanGeode() {
        return RarityFilter.onAverageOnceEvery(32);
    }
    private static RarityFilter rarityNetherGeode() {
        return RarityFilter.onAverageOnceEvery(32);
    }

    private static CountPlacement placementCrystal() {
        return CountPlacement.of(20);
    }

    private static RarityFilter rarityBasaltGeode() {
        return RarityFilter.onAverageOnceEvery(32);
    }

    private static RarityFilter rarityEndGeode() {
        return RarityFilter.onAverageOnceEvery(48);
    }
    private static RarityFilter rarityDeepDarkGeode() {
        return RarityFilter.onAverageOnceEvery(16);
    }

    private static RarityFilter rarityOreGeode() {
        return RarityFilter.onAverageOnceEvery(48);
    }

    private static RarityFilter rarityRareOreGeode() {
        return RarityFilter.onAverageOnceEvery(128);
    }

    private static InSquarePlacement inSquarePlacement() {
        return InSquarePlacement.spread();
    }

    private static PlacementModifier placementOceanModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(60));
    }
    private static PlacementModifier placementNetherModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }
    private static PlacementModifier placementNetherCrystalModifier() {
        return PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT;
    }

    private static PlacementModifier placementNetherBasaltModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }

    private static PlacementModifier placementDeepDarkModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementOreModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(60), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementDeepOreModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(0));
    }

    private static PlacementModifier placementRareModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(40));
    }
    private static PlacementModifier placementEndModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(32));
    }

    private static BiomeFilter biomeFilter() {
        return BiomeFilter.biome();
    }

    public static void initialize() {};
}
