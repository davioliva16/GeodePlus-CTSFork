package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.yeoxuhang.geodeplus.GeodePlus;

import java.util.Map;
import java.util.Optional;

public class GeodePlusTrimMaterialsRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = registryKey("wrappist");

    public static void nextUpdate(BootstapContext<TrimMaterial> bootstapContext) {
        register(bootstapContext, WRAPPIST, GeodePlusItemsRegistry.WRAPPIST_SHARD.get(), Style.EMPTY.withColor(6201294), 0.1F);
    }






    public static Optional<Holder.Reference<TrimMaterial>> getFromIngredient(RegistryAccess registryAccess, ItemStack itemStack) {
        return registryAccess.registryOrThrow(Registries.TRIM_MATERIAL).holders().filter((reference) -> {
            return itemStack.is(((TrimMaterial)reference.value()).ingredient());
        }).findFirst();
    }

    private static void register(BootstapContext<TrimMaterial> bootstapContext, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f) {
        register(bootstapContext, resourceKey, item, style, f, Map.of());
    }

    private static void register(BootstapContext<TrimMaterial> bootstapContext, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f, Map<ArmorMaterials, String> map) {
        TrimMaterial trimMaterial = TrimMaterial.create(resourceKey.location().getPath(), item, f, Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style), map);
        bootstapContext.register(resourceKey, trimMaterial);
    }

    private static ResourceKey<TrimMaterial> registryKey(String string) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, new ResourceLocation(GeodePlus.MOD_ID ,string));
    }
    public static void initialize() {};
}
