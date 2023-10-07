package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.yeoxuhang.geodeplus.common.world.feature.*;
import net.yeoxuhang.geodeplus.common.world.feature.config.GeodeCrystalSpikeConfig;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;

import java.util.function.Supplier;

public class GeodePlusFeatureRegistry {

    public static void bootstrap(BootstapContext<Registry<Feature>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        //Holder<ConfiguredFeature<?, ?>> holder16 = holderGetter.getOrThrow(GeodePlusConfiguredFeatureRegistry.ECHO_GEODE);
        //register(context, ECHO_GEODE, holder16, new PlacementModifier[]{rarityEchoGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter()});
    }
    public static final Supplier<CrystalSpikeFeature> CRYSTAL_SPIKE = RegistryHelper.registerFeature("crystal_spike",
            () -> new CrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<OceanCrystalSpikeFeature> OCEAN_CRYSTAL_SPIKE = RegistryHelper.registerFeature("ocean_crystal_spike",
            () -> new OceanCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<EchoCrystalSpikeFeature> ECHO_CRYSTAL_SPIKE = RegistryHelper.registerFeature("echo_crystal_spike",
            () -> new EchoCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<WrappistCrystalSpikeFeature> WRAPPIST_CRYSTAL_SPIKE = RegistryHelper.registerFeature("wrappist_crystal_spike",
            () -> new WrappistCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<OceanGeodeFeature> OCEAN_GEODE = RegistryHelper.registerFeature("ocean_geode",
            () -> new OceanGeodeFeature(GeodeConfiguration.CODEC));

    public static void initialize() {};
}
