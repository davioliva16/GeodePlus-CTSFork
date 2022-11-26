package net.yeoxuhang.geodeplus.common.world.feature;

import net.yeoxuhang.geodeplus.common.registry.GeodeModPlacedFeaturesRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class GeodeModDefaultFeatures {
    public static void addEchoCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));
    }
    public static void addQuartzCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
    }
    public static void addGlowstoneCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));
    }
    public static void addWrappistCrystalSpike(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodeModPlacedFeaturesRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
    }
}
