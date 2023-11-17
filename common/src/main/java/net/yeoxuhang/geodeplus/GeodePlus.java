package net.yeoxuhang.geodeplus;

import com.kyanite.paragon.api.ConfigManager;
import net.minecraft.resources.ResourceLocation;
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
        //GeodePlusEntityRegistry.init();
        GeodePlusPlacedFeatureRegistry.init();
        GeodePlusConfiguredFeatureRegistry.init();
        ConfigManager.register(GeodePlus.MOD_ID ,new GeodePlusCommonConfigs());
    }

    public static ResourceLocation createID(String s){
        return new ResourceLocation(MOD_ID, s);
    }
}