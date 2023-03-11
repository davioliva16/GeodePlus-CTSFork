package net.yeoxuhang.geodeplus.forge.registry;

import com.mojang.serialization.Codec;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.end.LargeWrappistCrystalGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.end.WrappistGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.LargeGlowstoneCrystalModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.LargeQuartzCrystalGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.basalt.BasaltAncientDebrisGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.basalt.BasaltGlowstoneGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.basalt.BasaltGoldNuggetGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.basalt.BasaltQuartzModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.blackstone.BlackstoneAncientDebrisGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.blackstone.BlackstoneGlowstoneGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.blackstone.BlackstoneGoldNuggetGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.blackstone.BlackstoneQuartzGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.netherrack.AncientDebrisGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.netherrack.GlowstoneGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.netherrack.GoldNuggetGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.nether.netherrack.QuartzGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.*;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepdark.*;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepslate.DeepslateDiamondGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepslate.DeepslateEmeraldGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepslate.DeepslateLapisGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.deepslate.DeepslateRedstoneGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.stone.DiamondGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.stone.EmeraldGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.stone.LapisGeodeModifier;
import net.yeoxuhang.geodeplus.forge.biome_modifiers.overworld.stone.RedstoneGeodeModifier;

public class GeodePlusBiomeModifierRegistry {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, GeodePlus.MOD_ID);

    public static RegistryObject<Codec<PrismarineGeodeModifier>> prismarineGeode = BIOME_MODIFIERS.register("prismarine_geode", PrismarineGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DiamondGeodeModifier>> diamondGeode = BIOME_MODIFIERS.register("diamond_geode", DiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<EmeraldGeodeModifier>> emeraldGeode = BIOME_MODIFIERS.register("emerald_geode", EmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<LapisGeodeModifier>> lapisGeode = BIOME_MODIFIERS.register("lapis_geode", LapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<RedstoneGeodeModifier>> redstoneGeode = BIOME_MODIFIERS.register("redstone_geode", RedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateDiamondGeodeModifier>> deepslateDiamondGeode = BIOME_MODIFIERS.register("deepslate_diamond_geode", DeepslateDiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateEmeraldGeodeModifier>> deepslateEmeraldGeode = BIOME_MODIFIERS.register("deepslate_emerald_geode", DeepslateEmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateLapisGeodeModifier>> deepslateLapisGeode = BIOME_MODIFIERS.register("deepslate_lapis_geode", DeepslateLapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateRedstoneGeodeModifier>> deepslateRedstoneGeode = BIOME_MODIFIERS.register("deepslate_redstone_geode", DeepslateRedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkDiamondGeodeModifier>> sculkDiamondGeode = BIOME_MODIFIERS.register("sculk_diamond_geode", SculkDiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkEmeraldGeodeModifier>> sculkEmeraldGeode = BIOME_MODIFIERS.register("sculk_emerald_geode", SculkEmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkLapisGeodeModifier>> sculkLapisGeode = BIOME_MODIFIERS.register("sculk_lapis_geode", SculkLapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkRedstoneGeodeModifier>> sculkRedstoneGeode = BIOME_MODIFIERS.register("sculk_redstone_geode", SculkRedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<EchoGeodeModifier>> echoGeode = BIOME_MODIFIERS.register("echo_geode", EchoGeodeModifier::makeCodec);
    public static RegistryObject<Codec<AncientDebrisGeodeModifier>> ancientDebrisGeode = BIOME_MODIFIERS.register("ancient_debris_geode", AncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<GlowstoneGeodeModifier>> glowstoneGeode = BIOME_MODIFIERS.register("glowstone_geode", GlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<GoldNuggetGeodeModifier>> goldNuggetGeode = BIOME_MODIFIERS.register("gold_nugget_geode", GoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<QuartzGeodeModifier>> quartzGeode = BIOME_MODIFIERS.register("quartz_geode", QuartzGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltAncientDebrisGeodeModifier>> basaltAncientDebrisGeode = BIOME_MODIFIERS.register("basalt_ancient_debris_geode", BasaltAncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltGlowstoneGeodeModifier>> basaltGlowstoneGeode = BIOME_MODIFIERS.register("basalt_glowstone_geode", BasaltGlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltGoldNuggetGeodeModifier>> basaltGoldNuggetGeode = BIOME_MODIFIERS.register("basalt_gold_nugget_geode", BasaltGoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltQuartzModifier>> basaltQuartzGeode = BIOME_MODIFIERS.register("basalt_quartz_geode", BasaltQuartzModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneAncientDebrisGeodeModifier>> blackstoneAncientDebrisGeode = BIOME_MODIFIERS.register("blackstone_ancient_debris_geode", BlackstoneAncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneGlowstoneGeodeModifier>> blackstoneGlowstoneGeode = BIOME_MODIFIERS.register("blackstone_glowstone_geode", BlackstoneGlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneGoldNuggetGeodeModifier>> blackstoneGoldNuggetGeode = BIOME_MODIFIERS.register("blackstone_gold_nugget_geode", BlackstoneGoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneQuartzGeodeModifier>> blackstoneQuartzGeode = BIOME_MODIFIERS.register("blackstone_quartz_geode", BlackstoneQuartzGeodeModifier::makeCodec);
    public static RegistryObject<Codec<WrappistGeodeModifier>> wrappistGeode = BIOME_MODIFIERS.register("wrappist_geode", WrappistGeodeModifier::makeCodec);
    public static RegistryObject<Codec<LargeEchoCrystalGeodeModifier>> echoCrystalSpike = BIOME_MODIFIERS.register("echo_crystal_spike", LargeEchoCrystalGeodeModifier::makeCodec);
    public static RegistryObject<Codec<LargePrismarineCrystalModifier>> prismarineCrystalSpike = BIOME_MODIFIERS.register("prismarine_crystal_spike", LargePrismarineCrystalModifier::makeCodec);

    public static RegistryObject<Codec<LargeQuartzCrystalGeodeModifier>> quartzCrystalSpike = BIOME_MODIFIERS.register("quartz_crystal_spike", LargeQuartzCrystalGeodeModifier::makeCodec);
    public static RegistryObject<Codec<LargeGlowstoneCrystalModifier>> glowstoneCrystalSpike = BIOME_MODIFIERS.register("glowstone_crystal_spike", LargeGlowstoneCrystalModifier::makeCodec);
    public static RegistryObject<Codec<LargeWrappistCrystalGeodeModifier>> wrppistCrystalSpike = BIOME_MODIFIERS.register("wrappist_crystal_spike", LargeWrappistCrystalGeodeModifier::makeCodec);
    public static RegistryObject<Codec<CelestiteGeodeModifier>> celestiteGeode = BIOME_MODIFIERS.register("celestite_geode", CelestiteGeodeModifier::makeCodec);
    public static RegistryObject<Codec<PinkTopazGeodeModifier>> pinkTopazGeode = BIOME_MODIFIERS.register("pink_topaz_geode", PinkTopazGeodeModifier::makeCodec);

    public static void register(IEventBus eventBus) {
        BIOME_MODIFIERS.register(eventBus);
    }
}