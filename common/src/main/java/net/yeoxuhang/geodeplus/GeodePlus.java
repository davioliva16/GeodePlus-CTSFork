package net.yeoxuhang.geodeplus;

import com.kyanite.paragon.api.ConfigRegistry;
import net.yeoxuhang.geodeplus.common.config.GeodeModCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.*;

public class GeodePlus {
    public static final String MOD_ID = "geode";

    public static void init() {

        GeodeModItemsRegistry.initialize();
        GeodeModBlocksRegistry.initialize();
        GeodeModBlockEntitiesRegistry.initialize();

//        GeodeModLootModifiersRegistry.initialize();

        GeodeModFeaturesRegistry.initialize();
        GeodeModPlacedFeaturesRegistry.initialize();
        ConfigRegistry.register(GeodePlus.MOD_ID , new GeodeModCommonConfigs());
    }

}