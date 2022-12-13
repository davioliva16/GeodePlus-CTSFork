package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.function.Consumer;

public class GeodePlusRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public GeodePlusRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> save) {

        ShapedRecipeBuilder.shaped(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get()).define('S', GeodePlusItemsRegistry.WRAPPIST_SHARD.get()).pattern("SS").pattern("SS").unlockedBy("has_wrappist_shard", has(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())).save(save);

        ShapedRecipeBuilder.shaped(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).define('F', GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get()).pattern("FF").pattern("FF").unlockedBy("has_quartz_crystal", has(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get())).save(save);
        wall(save, GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());
        slabBuilder(GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), Ingredient.of(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(ItemTags.STONE_BRICKS)).save(save);
        stairBuilder(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), Ingredient.of(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(ItemTags.STONE_BRICKS)).save(save);

        stonecutterResultFromBase(save, GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());
        stonecutterResultFromBase(save, GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(), 2);
        stonecutterResultFromBase(save, GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE), GeodePlusBlocksRegistry.SMOOTH_END_STONE.get().asItem().asItem(), 0.1F, 200).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(save);
        ShapedRecipeBuilder.shaped(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get()).define('#', Blocks.END_STONE_BRICKS).define('O', Items.PRISMARINE_SHARD).define('W', GeodePlusItemsRegistry.WRAPPIST_SHARD.get()).pattern("W W").pattern("O#O").unlockedBy("has_wrappist_shard", has(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())).save(save);

    }
}
