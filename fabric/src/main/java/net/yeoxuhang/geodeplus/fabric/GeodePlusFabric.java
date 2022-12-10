package net.yeoxuhang.geodeplus.fabric;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;

public class GeodePlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GeodePlus.init();
        new GeodeModGeodeBiomeModifier().biomeModificationHelper();
    }
}