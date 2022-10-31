package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.common.item.WrappistGoatHornItem;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class GeodeModItemsRegistry {
    public static final Supplier<Item> WRAPPIST_SHARD = RegistryHelper.registerItem("wrappist_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final Supplier<Item> WRAPPIST_GOAT_HORN = RegistryHelper.registerItem("wrappist_goat_horn",
            () -> new WrappistGoatHornItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

    public static void initialize() {};
}
