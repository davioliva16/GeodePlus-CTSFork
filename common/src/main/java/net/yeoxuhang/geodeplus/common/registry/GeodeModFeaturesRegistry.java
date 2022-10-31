package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.common.world.feature.CrystalSpikeFeature;
import net.yeoxuhang.geodeplus.common.world.feature.EchoCrystalSpikeFeature;
import net.yeoxuhang.geodeplus.common.world.feature.WrappistCrystalSpikeFeature;
import net.yeoxuhang.geodeplus.common.world.feature.config.GeodeCrystalSpikeConfig;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;

import java.util.function.Supplier;

public class GeodeModFeaturesRegistry {
    public static final Supplier<CrystalSpikeFeature> CRYSTAL_SPIKE = RegistryHelper.registerFeature("crystal_spike",
            () -> new CrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<EchoCrystalSpikeFeature> ECHO_CRYSTAL_SPIKE = RegistryHelper.registerFeature("echo_crystal_spike",
            () -> new EchoCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<WrappistCrystalSpikeFeature> WRAPPIST_CRYSTAL_SPIKE = RegistryHelper.registerFeature("wrappist_crystal_spike",
            () -> new WrappistCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static void initialize() {};
}
