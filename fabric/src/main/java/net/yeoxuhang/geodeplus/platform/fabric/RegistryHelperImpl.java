package net.yeoxuhang.geodeplus.platform.fabric;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;

import java.util.function.Supplier;

public class RegistryHelperImpl {
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        T registry = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(GeodePlus.MOD_ID, name), block.get());
        return () -> registry;
    }

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        T registry = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GeodePlus.MOD_ID, name), item.get());
        return () -> registry;
    }


    /*public static <T extends ConfiguredFeature<?, ?>> Supplier<T> registerConfiguredFeature(String name, Supplier<T> feature) {
        T registry = (T) Registry.register(BuiltInRegistries.CONFIGURED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name), feature.get());
        return () -> registry;
    }*/

    public static <T extends Feature<?>> Supplier<T> registerFeature(String name, Supplier<T> feature) {
        T registry = Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name), feature.get());
        return () -> registry;
    }


    /*public static <T extends PlacedFeature> Supplier<T> registerPlacedFeature(String name, Supplier<T> placedFeature) {
        T registry = (T) Registry.register(BuiltInRegistries.PLACED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name), placedFeature.get());
        return () -> registry;
    }*/

    /*public static <T extends CreativeModeTab> T registerCreativeModeTab(Supplier<ItemStack> icon) {
        return (T) FabricItemGroupBuilderImpl.build(new ResourceLocation(GeodePlus.MOD_ID, GeodePlus.MOD_ID), icon);
    }*/

    public static <T extends Enchantment> Supplier<T> registerEnchant(String name, Supplier<T> enchantment) {
        T registry = Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(GeodePlus.MOD_ID, name), enchantment.get());
        return () -> registry;
    }

    public static <T extends SoundEvent> Supplier<T> registerSound(String name, Supplier<T> sound) {
        T registry = Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(GeodePlus.MOD_ID, name), sound.get());
        return () -> registry;
    }

    public static <T extends PoiType> Supplier<T> registerPOI(String name, Supplier<T> portal) {
        T registry = Registry.register(BuiltInRegistries.POINT_OF_INTEREST_TYPE, new ResourceLocation(GeodePlus.MOD_ID, name), portal.get());
        return () -> registry;
    }
    public static <T extends TrimPattern> ResourceKey<TrimPattern> registerTrimPattern(String name, Supplier<T> portal) {
        ResourceKey<TrimPattern> registry = ResourceKey.create(Registries.TRIM_PATTERN, new ResourceLocation(GeodePlus.MOD_ID, name));
        return registry;
    }
}