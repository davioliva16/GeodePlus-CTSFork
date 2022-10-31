//package com.yeoxuhang.geodeplus.common.registry;
//
//import com.mojang.serialization.Codec;
//import net.minecraftforge.common.loot.IGlobalLootModifier;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import net.yeoxuhang.geode.GeodeMod;
//import net.yeoxuhang.geode.common.loot_modifier.WrappistGoatHornInEndCitiesModifier;
//
//public class GeodeModLootModifiersRegistry {
//    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
//            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, GeodePlus.MOD_ID);
//
//    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
//            LOOT_MODIFIER_SERIALIZERS.register("add_item", WrappistGoatHornInEndCitiesModifier.CODEC);
//
//
//    public static void register(IEventBus bus) {
//        LOOT_MODIFIER_SERIALIZERS.register(bus);
//    }
//} TODO: Impl