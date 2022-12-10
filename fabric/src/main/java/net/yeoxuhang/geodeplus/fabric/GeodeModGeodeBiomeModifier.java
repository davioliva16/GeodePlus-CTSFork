package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yeoxuhang.geodeplus.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodeModPlacedFeaturesRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;

public class GeodeModGeodeBiomeModifier {

    public ResourceKey<PlacedFeature> getKey(PlacedFeature feature) {
        return BuiltinRegistries.PLACED_FEATURE.getResourceKey(feature).get();
    }
    public void biomeModificationHelper() {
        var modifications = BiomeModifications.create(new ResourceLocation("geode", "biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.PRISMARINE_GEODE.get()));
            }
            //Stone
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.EMERALD_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.LAPIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.REDSTONE_GEODE.get()));
            }
            //Deepslate
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_EMERALD_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_LAPIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_REDSTONE_GEODE.get()));
            }
            //Sculk
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_EMERALD_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_LAPIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_REDSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_GEODE.get()));
            }
            //Netherrack
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_GEODE.get()));
            }
            //Basalt
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_QUARTZ_GEODE.get()));
            }
            //Blackstone
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BLACKSTONE_GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BLACKSTONE_GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BLACKSTONE_QUARTZ_GEODE.get()));
            }
            //End
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.WRAPPIST_GEODE.get()));
            }
            //Crystals
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, getKey(GeodeModPlacedFeaturesRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
            }
        });
    }
}
