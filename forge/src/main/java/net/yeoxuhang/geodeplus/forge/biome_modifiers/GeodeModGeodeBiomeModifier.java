package net.yeoxuhang.geodeplus.forge.biome_modifiers;

import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geodeplus.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodeModPlacedFeaturesRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodeModBiomeModifiersRegistry;


public class GeodeModGeodeBiomeModifier implements BiomeModifier {
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private static void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.PRISMARINE_GEODE.get()));
        }
        //Stone
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.EMERALD_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.LAPIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_STONE_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.REDSTONE_GEODE.get()));
        }
        //Deepslate
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.DEEPSLATE_DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.DEEPSLATE_EMERALD_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.DEEPSLATE_LAPIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.DEEPSLATE_REDSTONE_GEODE.get()));
        }
        //Sculk
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.SCULK_DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.SCULK_EMERALD_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.SCULK_LAPIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_SCULK_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.SCULK_REDSTONE_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ECHO_GEODE.get()));
        }
        //Netherrack
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.QUARTZ_GEODE.get()));
        }
        //Basalt
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BASALT_ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BASALT_GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BASALT_GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BASALT_QUARTZ_GEODE.get()));
        }
        //Blackstone
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BLACKSTONE_GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BLACKSTONE_GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.BLACKSTONE_QUARTZ_GEODE.get()));
        }
        //End
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE )&& GeodeModCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.WRAPPIST_GEODE.get()));
        }
        //Crystals
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Holder.direct(GeodeModPlacedFeaturesRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()){
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodeModCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
        }
    }


    @Override
    public Codec<? extends BiomeModifier> codec() {
        return GeodeModBiomeModifiersRegistry.GEODE_MODIFIER.get();
    }
}