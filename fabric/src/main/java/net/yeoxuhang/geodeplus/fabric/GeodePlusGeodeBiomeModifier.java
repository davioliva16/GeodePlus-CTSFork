package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusPlacedFeatureRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;

import java.util.Locale;

public class GeodePlusGeodeBiomeModifier {


    public void biomeModificationHelper() {
        var modifications = BiomeModifications.create(new ResourceLocation(GeodePlus.MOD_ID, "biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_GEODE) && GeodePlusCommonConfigs.SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("prismarine_geode"));
            }
            //Stone
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("diamond_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("emerald_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("lapis_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("redstone_geode"));
            }
            //Deepslate
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_diamond_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_emerald_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_lapis_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_redstone_geode"));
            }
            //Sculk
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_diamond_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_emerald_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_lapis_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_redstone_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_geode"));
            }
            //Netherrack
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ancient_debris_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("gold_nugget_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_geode"));
            }
            //Basalt
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_ancient_debris_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_glowstone_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_gold_nugget_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_quartz_geode"));
            }
            //Blackstone
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_ancient_debris_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_glowstone_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_gold_nugget_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_quartz_geode"));
            }
            //End
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("wrappist_geode"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_CELESTITE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_CELESTITE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("celestite_geode"));
            }
            /*if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_PINK_TOPAZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("pink_topaz_geode"));
            }*/
            //Crystals
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, getPlacedFeatureKey("prismarine_crystal_spike"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_crystal_spike_floor"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_crystal_spike_floor"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_crystal_spike_floor"));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, getPlacedFeatureKey("wrappist_crystal_spike"));
            }
        });
    }
    private ResourceKey<PlacedFeature> getPlacedFeatureKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, key));
    }
}

