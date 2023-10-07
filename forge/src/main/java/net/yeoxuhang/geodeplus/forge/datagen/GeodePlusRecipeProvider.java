package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeodePlusRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public GeodePlusRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> save) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GUNPOWDER, 4).requires(GeodePlusItemsRegistry.CELESTITE_SHARD.get()).unlockedBy("has_celestite", has(GeodePlusItemsRegistry.CELESTITE_SHARD.get())).save(save);
        crystalsFromCrystalsBlocks(save, GeodePlusItemsRegistry.WRAPPIST_SHARD.get(), GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, GeodePlusItemsRegistry.PINK_TOPAZ.get(), GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, GeodePlusItemsRegistry.CELESTITE_SHARD.get(), GeodePlusBlocksRegistry.CELESTITE_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.DIAMOND, GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.EMERALD, GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.LAPIS_LAZULI, GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.REDSTONE, GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.GLOWSTONE_DUST, GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.PRISMARINE_SHARD, GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.QUARTZ, GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.NETHERITE_SCRAP, GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.GOLD_NUGGET, GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.ECHO_SHARD, GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.AMETHYST_SHARD, Blocks.AMETHYST_BLOCK, 4);
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get(), GeodePlusItemsRegistry.PINK_TOPAZ.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.CELESTITE_BLOCK.get(), GeodePlusItemsRegistry.CELESTITE_SHARD.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get(), GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.EMERALD_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.LAPIS_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get(), GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK.get(), GeodePlusBlocksRegistry.ECHO_CRYSTAL.get());

        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(), GeodePlusItemsRegistry.WRAPPIST_SHARD.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(), GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(), GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get());
        wall(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), Ingredient.of(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).save(save);
        stairBuilder(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), Ingredient.of(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).save(save);
        wall(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GALCITE_WALL.get(), GeodePlusBlocksRegistry.GALCITE.get());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GALCITE_SLAB.get(), Ingredient.of(GeodePlusBlocksRegistry.GALCITE.get())).unlockedBy("has_galcite", has(GeodePlusBlocksRegistry.GALCITE.get())).save(save);
        stairBuilder(GeodePlusBlocksRegistry.GALCITE_STAIRS.get(), Ingredient.of(GeodePlusBlocksRegistry.GALCITE.get())).unlockedBy("has_galcite", has(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).save(save);

        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(), 2);
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GALCITE_STAIRS.get(), GeodePlusBlocksRegistry.GALCITE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GALCITE_SLAB.get(), GeodePlusBlocksRegistry.GALCITE.get(), 2);
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, GeodePlusBlocksRegistry.GALCITE_WALL.get(), GeodePlusBlocksRegistry.GALCITE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS ,GeodePlusBlocksRegistry.SMOOTH_END_STONE.get().asItem().asItem(), 0.1F, 200).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(save);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get()).define('#', Blocks.END_STONE_BRICKS).define('O', Items.PRISMARINE_SHARD).define('W', GeodePlusItemsRegistry.WRAPPIST_SHARD.get()).pattern("W W").pattern("O#O").unlockedBy("has_wrappist_shard", has(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())).save(save);

        copySmithingTemplate(save, GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(), GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get());
        copySmithingTemplate(save, GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(), GeodePlusBlocksRegistry.CELESTITE_BLOCK.get());
        copySmithingTemplate(save, GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get(), GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get());

        smithingTrims().forEach((arg, arg2) -> {
            trimSmithing(save, arg, arg2);
        });
    }

    protected static void crystalsFromCrystalsBlocks(Consumer<FinishedRecipe> consumer, ItemLike arg, ItemLike arg2, int i) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, arg, i).requires(arg2).group("crystals").unlockedBy("has_crystal_block", has(arg2)).save(consumer);
    }

    public static Map<Item, ResourceLocation> smithingTrims() {
        return (Map) Stream.of(GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(), GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(), GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get()).collect(Collectors.toMap(Function.identity(), (arg) -> {
            return new ResourceLocation(getItemName(arg) + "_smithing_trim");
        }));
    }
}
