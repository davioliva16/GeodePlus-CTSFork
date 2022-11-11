package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;
import net.yeoxuhang.geodeplus.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodeModPlacedFeaturesRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class GeodePlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GeodePlus.init();
        biomeModificationHelper();
    }

    public ResourceKey<PlacedFeature> getKey(PlacedFeature feature) {
        return BuiltinRegistries.PLACED_FEATURE.getResourceKey(feature).get();
    }
    
    public void biomeModificationHelper() {
        var modifications = BiomeModifications.create(new ResourceLocation("geode", "biome_modifications"));
        
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_PRISMARINE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.PRISMARINE_GEODE.get()));
            }

            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE) && !biome.is(Biomes.DEEP_DARK) && GeodeModCommonConfigs.SHOULD_GENERATE_LAPIS_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.LAPIS_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_LAPIS_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE) && !biome.is(Biomes.DEEP_DARK) && GeodeModCommonConfigs.SHOULD_GENERATE_REDSTONE_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.REDSTONE_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_REDSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE) && !biome.is(Biomes.DEEP_DARK) && GeodeModCommonConfigs.SHOULD_GENERATE_EMERALD_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.EMERALD_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_EMERALD_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE) && !biome.is(Biomes.DEEP_DARK) && GeodeModCommonConfigs.SHOULD_GENERATE_DIAMOND_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DIAMOND_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.DEEPSLATE_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_LAPIS_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_REDSTONE_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_EMERALD_GEODE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.SCULK_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_QUARTZ_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.BASALT_GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE) && GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.WRAPPIST_GEODE.get()));
            }

            //Crystals
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL) || FabricLoader.getInstance().isModLoaded("deeperdarker") && GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_LARGE_CRYSTAL.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));

            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));

            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, getKey(GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_PRISMARINE_LARGE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodeModPlacedFeaturesRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR.get()));
            }
        });
    }
}