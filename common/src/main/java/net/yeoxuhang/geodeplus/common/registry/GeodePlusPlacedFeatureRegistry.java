package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GeodePlusPlacedFeatureRegistry {
    public static final ResourceKey<PlacedFeature> PRISMARINE_GEODE = createKey("prismarine_geode");
    public static final ResourceKey<PlacedFeature> WRAPPIST_GEODE = createKey("wrappist_geode");
    public static final ResourceKey<PlacedFeature> ECHO_GEODE = createKey("echo_geode");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = createKey("quartz_crystal_spike");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = createKey("quartz_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = createKey("glowstone_crystal_spike");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = createKey("glowstone_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE = createKey("echo_crystal_spike");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = createKey("echo_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> PRISMARINE_CRYSTAL_SPIKE = createKey("prismarine_crystal_spike");
    public static final ResourceKey<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = createKey("wrappist_crystal_spike");
    public static final ResourceKey<PlacedFeature> ANCIENT_DEBRIS_GEODE = createKey("ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BASALT_ANCIENT_DEBRIS_GEODE = createKey("basalt_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_ANCIENT_DEBRIS_GEODE = createKey("blackstone_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_GEODE = createKey("glowstone_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GLOWSTONE_GEODE = createKey("basalt_glowstone_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = createKey("blackstone_glowstone_geode");
    public static final ResourceKey<PlacedFeature> GOLD_NUGGET_GEODE = createKey("gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GOLD_NUGGET_GEODE = createKey("basalt_gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GOLD_NUGGET_GEODE = createKey("blackstone_gold_nugget_geode");

    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE = createKey("quartz_geode");
    public static final ResourceKey<PlacedFeature> BASALT_QUARTZ_GEODE = createKey("basalt_quartz_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = createKey("blackstone_quartz_geode");

    public static final ResourceKey<PlacedFeature> DIAMOND_GEODE = createKey("diamond_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_DIAMOND_GEODE = createKey("deepslate_diamond_geode");
    public static final ResourceKey<PlacedFeature> SCULK_DIAMOND_GEODE = createKey("sculk_diamond_geode");

    public static final ResourceKey<PlacedFeature> EMERALD_GEODE = createKey("emerald_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_EMERALD_GEODE = createKey("deepslate_emerald_geode");
    public static final ResourceKey<PlacedFeature> SCULK_EMERALD_GEODE = createKey("sculk_emerald_geode");

    public static final ResourceKey<PlacedFeature> LAPIS_GEODE = createKey("lapis_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_LAPIS_GEODE = createKey("deepslate_lapis_geode");
    public static final ResourceKey<PlacedFeature> SCULK_LAPIS_GEODE = createKey("sculk_lapis_geode");

    public static final ResourceKey<PlacedFeature> REDSTONE_GEODE = createKey("redstone_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_REDSTONE_GEODE = createKey("deepslate_redstone_geode");
    public static final ResourceKey<PlacedFeature> SCULK_REDSTONE_GEODE = createKey("sculk_redstone_geode");

    public static final ResourceKey<PlacedFeature> CELESTITE_GEODE = createKey("celestite_geode");
    public static final ResourceKey<PlacedFeature> PINK_TOPAZ_GEODE = createKey("pink_topaz_geode");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.PRISMARINE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder2 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.WRAPPIST_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder3 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.ECHO_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder4 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.DIAMOND_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder5 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.DEEPSLATE_DIAMOND_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder6 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.SCULK_DIAMOND_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder7 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.EMERALD_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder8 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.DEEPSLATE_EMERALD_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder9 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.SCULK_EMERALD_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder10 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.LAPIS_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder11 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.DEEPSLATE_LAPIS_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder12 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.SCULK_LAPIS_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder13 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.REDSTONE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder14 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.DEEPSLATE_REDSTONE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder15 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.SCULK_REDSTONE_GEODE);

        //Nether
        Holder.Reference<ConfiguredFeature<?, ?>> holder16 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.ANCIENT_DEBRIS_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder17 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder18 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder19 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.GOLD_NUGGET_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder20 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BASALT_GOLD_NUGGET_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder21 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder22 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.GLOWSTONE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder23 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BASALT_GLOWSTONE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder24 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder25 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.QUARTZ_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder26 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BASALT_QUARTZ_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder27 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.BLACKSTONE_QUARTZ_GEODE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder28 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.CRYSTAL_SPIKE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder29 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.CRYSTAL_SPIKE_FLOOR);
        Holder.Reference<ConfiguredFeature<?, ?>> holder30 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder31 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR);
        Holder.Reference<ConfiguredFeature<?, ?>> holder32 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder33 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR);
        Holder.Reference<ConfiguredFeature<?, ?>> holder34 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder35 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE);

        Holder.Reference<ConfiguredFeature<?, ?>> holder36 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.CELESTITE_GEODE);
        Holder.Reference<ConfiguredFeature<?, ?>> holder37 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.PINK_TOPAZ_GEODE);

        register(context, PRISMARINE_GEODE, holder, rarityPrismarineGeode(), inSquarePlacement(), placementPrismarineModifier(), biomeFilter());
        register(context, WRAPPIST_GEODE, holder2, rarityEndWrappistGeode(), inSquarePlacement(), placementEndModifier(), biomeFilter());
        register(context, ECHO_GEODE, holder3, rarityEchoGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter());

        register(context, DIAMOND_GEODE, holder4, rarityRareOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter());
        register(context, DEEPSLATE_DIAMOND_GEODE, holder5, rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());
        register(context, SCULK_DIAMOND_GEODE, holder6, rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());

        register(context, EMERALD_GEODE, holder7, rarityRareOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter());
        register(context, DEEPSLATE_EMERALD_GEODE, holder8, rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());
        register(context, SCULK_EMERALD_GEODE, holder9, rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());

        register(context, LAPIS_GEODE, holder10, rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter());
        register(context, DEEPSLATE_LAPIS_GEODE, holder11, rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());
        register(context, SCULK_LAPIS_GEODE, holder12, rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());

        register(context, REDSTONE_GEODE, holder13, rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter());
        register(context, DEEPSLATE_REDSTONE_GEODE, holder14, rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());
        register(context, SCULK_REDSTONE_GEODE, holder15, rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter());

        register(context, ANCIENT_DEBRIS_GEODE, holder16, rarityNetherAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BASALT_ANCIENT_DEBRIS_GEODE, holder17, rarityBasaltAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BLACKSTONE_ANCIENT_DEBRIS_GEODE, holder18, rarityBlackstoneAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());

        register(context, GOLD_NUGGET_GEODE, holder19, rarityNetherGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BASALT_GOLD_NUGGET_GEODE, holder20, rarityBasaltGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BLACKSTONE_GOLD_NUGGET_GEODE, holder21, rarityBlackstoneGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());

        register(context, GLOWSTONE_GEODE, holder22, rarityNetherGlowstoneGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BASALT_GLOWSTONE_GEODE, holder23, rarityBasaltGlowstoneGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BLACKSTONE_GLOWSTONE_GEODE, holder24, rarityBlackstoneGlowstoneGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());

        register(context, QUARTZ_GEODE, holder25, rarityNetherQuartzGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BASALT_QUARTZ_GEODE, holder26, rarityBasaltQuartzGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());
        register(context, BLACKSTONE_QUARTZ_GEODE, holder27, rarityBlackstoneQuartzGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter());

        register(context, QUARTZ_CRYSTAL_SPIKE, holder28, placementCrystal(), inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter());
        register(context, QUARTZ_CRYSTAL_SPIKE_FLOOR, holder29, placementCrystal(), inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter());
        register(context, GLOWSTONE_CRYSTAL_SPIKE, holder30, placementCrystal(), inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter());
        register(context, GLOWSTONE_CRYSTAL_SPIKE_FLOOR, holder31, placementCrystal(), inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter());
        register(context, ECHO_CRYSTAL_SPIKE, holder32, placementCrystal(), inSquarePlacement(), placementEchoCrystalModifier(), biomeFilter());
        register(context, ECHO_CRYSTAL_SPIKE_FLOOR, holder33, placementCrystal(), inSquarePlacement(), placementEchoCrystalModifier(), biomeFilter());
        register(context, WRAPPIST_CRYSTAL_SPIKE, holder34, placementEndCrystal(), inSquarePlacement(), placementEndModifier(), biomeFilter());
        register(context, PRISMARINE_CRYSTAL_SPIKE, holder35, rarityBlackstoneQuartzGeode(), inSquarePlacement(), placementPrismarineModifier(), biomeFilter());

        register(context, CELESTITE_GEODE, holder36, raritySwampGeode(), inSquarePlacement(), placementSwampModifier(), biomeFilter());
        register(context, PINK_TOPAZ_GEODE, holder37, rarityCherryBlossomGeode(), inSquarePlacement(), placementCherryBlossomModifier(), biomeFilter());
    }
    //Netherrack
    private static RarityFilter rarityNetherAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_DEBRIS_GEODE.get());}
    private static RarityFilter rarityNetherGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityNetherGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityNetherQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_QUARTZ_GEODE.get());}
    //Basalt
    private static RarityFilter rarityBasaltAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_DEBRIS_GEODE.get());}
    private static RarityFilter rarityBasaltGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityBasaltGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityBasaltQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_QUARTZ_GEODE.get());}
    //Blackstone
    private static RarityFilter rarityBlackstoneAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_DEBRIS_GEODE.get());}
    private static RarityFilter rarityBlackstoneGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityBlackstoneGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityBlackstoneQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_QUARTZ_GEODE.get());}
    private static CountPlacement placementCrystal() {
        return CountPlacement.of(20);
    }

    private static CountPlacement placementEndCrystal() {
        return CountPlacement.of(5);
    }
    private static RarityFilter rarityEndWrappistGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_END_WRAPPIST_GEODE.get());
    }
    private static RarityFilter rarityEchoGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_ECHO_GEODE.get());
    }

    private static RarityFilter rarityPrismarineGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_DEEP_OCEAN_PRISMARINE_GEODE.get());
    }

    private static RarityFilter rarityOreGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_ORES_GEODE.get());
    }

    private static RarityFilter rarityRareOreGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_RARE_ORES_GEODE.get());
    }
    private static RarityFilter raritySwampGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_SWAMP_GEODE.get());
    }
    private static RarityFilter rarityCherryBlossomGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_PINK_TOPAZ_GEODE.get());
    }
    private static InSquarePlacement inSquarePlacement() {
        return InSquarePlacement.spread();
    }

    private static PlacementModifier placementPrismarineModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(60));
    }
    private static PlacementModifier placementNetherModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }
    private static PlacementModifier placementNetherCrystalModifier() {
        return PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT;
    }

    private static PlacementModifier placementEchoCrystalModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30));
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

    private static PlacementModifier placementSwampModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(50), VerticalAnchor.absolute(110));
    }

    private static PlacementModifier placementCherryBlossomModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(110));
    }

    private static BiomeFilter biomeFilter() {
        return BiomeFilter.biome();
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    public static void init() {}
}