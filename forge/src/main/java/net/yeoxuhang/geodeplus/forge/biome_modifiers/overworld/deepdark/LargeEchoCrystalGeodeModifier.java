package net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepdark;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;


public class LargeEchoCrystalGeodeModifier implements BiomeModifier {
    private final HolderSet<PlacedFeature> features;

    public LargeEchoCrystalGeodeModifier(HolderSet<PlacedFeature> features) {
        this.features = features;
    }
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_CRYSTAL) && !biome.is(GeodePlusTagRegistry.Biomes.BLACKLIST_BIOMES) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()) {
            this.features.forEach((holder) -> {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, holder);
            });
        }
    }
    @Override
    public Codec<? extends BiomeModifier> codec() {
        return LargeEchoCrystalGeodeModifier.makeCodec();
    }

    public static Codec<LargeEchoCrystalGeodeModifier> makeCodec() {
        return RecordCodecBuilder.create((config) -> {
            return config.group(PlacedFeature.LIST_CODEC.fieldOf("feature").forGetter((otherConfig) -> {
                return otherConfig.features;
            })).apply(config, LargeEchoCrystalGeodeModifier::new);
        });
    }
}