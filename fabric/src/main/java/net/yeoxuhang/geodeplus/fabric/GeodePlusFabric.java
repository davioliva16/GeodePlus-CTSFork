package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.stream.Stream;

public class GeodePlusFabric implements ModInitializer {
    private static final ResourceKey<CreativeModeTab> TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GeodePlus.MOD_ID, "tab"));
    @Override
    public void onInitialize() {
        GeodePlus.init();
        registerCreativeTab();
        registerBrewingRecipes();
        new GeodePlusGeodeBiomeModifier().init();
    }

    public static void registerBrewingRecipes(){
        PotionBrewing.addMix(Potions.WATER, GeodePlusItemsRegistry.WRAPPIST_SHARD.get(), Potions.SLOW_FALLING);
        PotionBrewing.addMix(Potions.WATER, GeodePlusItemsRegistry.CELESTITE_SHARD.get(), Potions.STRONG_HEALING);
        PotionBrewing.addMix(Potions.WATER, GeodePlusItemsRegistry.PINK_TOPAZ.get(), Potions.LUCK);
    }
    private void registerCreativeTab() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB, FabricItemGroup.builder().icon(() -> new ItemStack(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())) // icon
                .title(Component.translatable("itemGroup." + GeodePlus.MOD_ID))
                .displayItems((parameters, output) -> {
                    output.acceptAll(Stream.of(
                            GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE,
                            GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE,
                            GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE,
                            GeodePlusItemsRegistry.WRAPPIST_SHARD,
                            GeodePlusItemsRegistry.CELESTITE_SHARD,
                            GeodePlusItemsRegistry.PINK_TOPAZ,
                            //GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN,
                            GeodePlusBlocksRegistry.WRAPPIST_GLASS,
                            GeodePlusBlocksRegistry.CELESTITE_GLASS,
                            GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS,

                            GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL,

                            GeodePlusBlocksRegistry.WRAPPIST_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_WRAPPIST,
                            GeodePlusBlocksRegistry.WRAPPIST_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD,
                            GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD,

                            GeodePlusBlocksRegistry.CELESTITE_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_CELESTITE,
                            GeodePlusBlocksRegistry.CELESTITE_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD,
                            GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD,

                            GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ,
                            GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL,
                            GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD,
                            GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD,

                            GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_PRISMARINE,
                            GeodePlusBlocksRegistry.PRISMARINE_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD,
                            GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD,

                            GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_LAPIS,
                            GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS,
                            GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS,
                            GeodePlusBlocksRegistry.LAPIS_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_LAPIS_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD,
                            GeodePlusBlocksRegistry.SMALL_LAPIS_BUD,

                            GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_REDSTONE,
                            GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE,
                            GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE,
                            GeodePlusBlocksRegistry.REDSTONE_CRYSTAL,
                            GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD,
                            GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD,

                            GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_EMERALD,
                            GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD,
                            GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD,
                            GeodePlusBlocksRegistry.EMERALD_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_EMERALD_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD,
                            GeodePlusBlocksRegistry.SMALL_EMERALD_BUD,

                            GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_DIAMOND,
                            GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND,
                            GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND,
                            GeodePlusBlocksRegistry.DIAMOND_CRYSTAL,
                            GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD,
                            GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD,

                            GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ,
                            GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ,
                            GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ,
                            GeodePlusBlocksRegistry.QUARTZ_CRYSTAL,
                            GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD,
                            GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD,

                            GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET,
                            GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET,
                            GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET,
                            GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD,
                            GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD,

                            GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_GLOWSTONE,
                            GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE,
                            GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE,
                            GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD,
                            GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD,

                            GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS,
                            GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                            GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS,
                            GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER,
                            GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                            GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD,

                            GeodePlusBlocksRegistry.SMOOTH_END_STONE,
                            GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS,
                            GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB,
                            GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL,

                            GeodePlusBlocksRegistry.GALCITE,
                            GeodePlusBlocksRegistry.GALCITE_STAIRS,
                            GeodePlusBlocksRegistry.GALCITE_SLAB,
                            GeodePlusBlocksRegistry.GALCITE_WALL,

                            GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK,
                            GeodePlusBlocksRegistry.BUDDING_ECHO,
                            GeodePlusBlocksRegistry.ECHO_CRYSTAL,
                            GeodePlusBlocksRegistry.LARGE_ECHO_BUD,
                            GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD,
                            GeodePlusBlocksRegistry.SMALL_ECHO_BUD
                    ).map(sup -> sup.get().asItem().getDefaultInstance()).toList());
                }).build());
    }
}