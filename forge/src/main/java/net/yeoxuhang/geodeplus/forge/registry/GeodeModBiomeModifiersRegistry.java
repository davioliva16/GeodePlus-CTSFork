package net.yeoxuhang.geodeplus.forge.registry;

import com.mojang.serialization.Codec;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.GeodeModGeodeBiomeModifier;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GeodeModBiomeModifiersRegistry {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, GeodePlus.MOD_ID);

    public static RegistryObject<Codec<GeodeModGeodeBiomeModifier>> GEODE_MODIFIER = BIOME_MODIFIERS.register("geode", () -> {
        return Codec.unit(GeodeModGeodeBiomeModifier::new);
    });

    public static void register(IEventBus eventBus) {
        BIOME_MODIFIERS.register(eventBus);
    }
}