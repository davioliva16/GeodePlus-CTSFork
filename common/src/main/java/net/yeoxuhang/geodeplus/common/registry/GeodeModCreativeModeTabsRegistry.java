package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;

public class GeodeModCreativeModeTabsRegistry {
    public static final CreativeModeTab TAB = RegistryHelper.registerCreativeModeTab(() -> new ItemStack(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get()));
}
