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
import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;
import net.yeoxuhang.geodeplus.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodeModPlacedFeaturesRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;

public class GeodePlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GeodePlus.init();
        new GeodeModGeodeBiomeModifier().biomeModificationHelper();
    }
}