package net.yeoxuhang.geodeplus;

import com.kyanite.paragon.api.ConfigManager;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.*;

public class GeodePlus {

    public static final String MOD_ID = "geode_plus";
    public static void init() {
        GeodePlusTrimMaterialsAndPatternsRegistry.init();
        GeodePlusItemsRegistry.init();
        GeodePlusBlocksRegistry.init();
        GeodePlusBlockEntityRegistry.init();
        GeodePlusFeatureRegistry.init();
        GeodePlusPlacedFeatureRegistry.init();
        GeodePlusConfiguredFeatureRegistry.init();
        ConfigManager.register(GeodePlus.MOD_ID ,new GeodePlusCommonConfigs());
    }
}