package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.yeoxuhang.geodeplus.GeodePlus;

import java.util.Map;

public class GeodePlusTrimMaterialsAndPatternsRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = createTrimMaterial("wrappist");
    public static final ResourceKey<TrimMaterial> CELESTITE = createTrimMaterial("celestite");
    public static final ResourceKey<TrimMaterial> PINK_TOPAZ = createTrimMaterial("pink_topaz");
    public static final ResourceKey<TrimPattern> WRAP = createTrimPattern("wrap");
    public static final ResourceKey<TrimPattern> CELESTE = createTrimPattern("celeste");
    public static final ResourceKey<TrimPattern> HEART = createTrimPattern("heart");

    public static void createMaterials(BootstapContext<TrimMaterial> bootstapContext) {
        createMaterial(bootstapContext, WRAPPIST, GeodePlusItemsRegistry.WRAPPIST_SHARD.get(), Style.EMPTY.withColor(6201294), 0.9F);
        createMaterial(bootstapContext, CELESTITE, GeodePlusItemsRegistry.CELESTITE_SHARD.get(), Style.EMPTY.withColor(11719671), 0.8F);
        createMaterial(bootstapContext, PINK_TOPAZ, GeodePlusItemsRegistry.PINK_TOPAZ.get(), Style.EMPTY.withColor(16496615), 0.1F);


    }
    public static void createPatterns(BootstapContext<TrimPattern> bootstapContext) {
        createPattern(bootstapContext, GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(), WRAP);
        createPattern(bootstapContext, GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(), CELESTE);
        createPattern(bootstapContext, GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get(), HEART);

    }

    private static void createMaterial(BootstapContext<TrimMaterial> bootstapContext, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f) {
        createMaterial(bootstapContext, resourceKey, item, style, f, Map.of());
    }

    private static void createMaterial(BootstapContext<TrimMaterial> bootstapContext, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f, Map<ArmorMaterials, String> map) {
        TrimMaterial trimMaterial = TrimMaterial.create(resourceKey.location().getPath(), item, f, Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style), map);
        bootstapContext.register(resourceKey, trimMaterial);
    }

    private static void createPattern(BootstapContext<TrimPattern> bootstapContext, Item item, ResourceKey<TrimPattern> resourceKey) {
        TrimPattern trimPattern = new TrimPattern(resourceKey.location(), BuiltInRegistries.ITEM.wrapAsHolder(item), Component.translatable(Util.makeDescriptionId("trim_pattern", resourceKey.location())));
        bootstapContext.register(resourceKey, trimPattern);
    }

    private static ResourceKey<TrimMaterial> createTrimMaterial(String string) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, new ResourceLocation(GeodePlus.MOD_ID, string));
    }
    private static ResourceKey<TrimPattern> createTrimPattern(String string) {
        return ResourceKey.create(Registries.TRIM_PATTERN, new ResourceLocation(GeodePlus.MOD_ID, string));
    }
    public static void initialize() {};
}
