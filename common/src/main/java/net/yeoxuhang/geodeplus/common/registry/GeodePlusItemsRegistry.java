package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.world.item.SmithingTemplateItem;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class GeodePlusItemsRegistry {
    public static final Supplier<Item> PINK_TOPAZ = RegistryHelper.registerItem("pink_topaz",
            () -> new Item(new Item.Properties()));
    public static final Supplier<Item> CELESTITE_SHARD = RegistryHelper.registerItem("celestite_shard",
            () -> new Item(new Item.Properties()));
    public static final Supplier<Item> WRAPPIST_SHARD = RegistryHelper.registerItem("wrappist_shard",
            () -> new Item(new Item.Properties()));

    public static final Supplier<Item> WRAP_ARMOR_TRIM_SMITHING_TEMPLATE = RegistryHelper.registerItem("wrap_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(GeodePlusTrimMaterialsAndPatternsRegistry.WRAP));
    public static final Supplier<Item> CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE = RegistryHelper.registerItem("celeste_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(GeodePlusTrimMaterialsAndPatternsRegistry.CELESTE));
    public static final Supplier<Item> HEART_ARMOR_TRIM_SMITHING_TEMPLATE = RegistryHelper.registerItem("heart_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(GeodePlusTrimMaterialsAndPatternsRegistry.HEART));

    /*public static final Supplier<WrappistGoatHornItem> WRAPPIST_GOAT_HORN = RegistryHelper.registerItem("wrappist_goat_horn",
            () -> new WrappistGoatHornItem(new Item.Properties().stacksTo(1)));*/

    public static void initialize() {};
}
