package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModItemsRegistry;

import java.util.function.Consumer;

public class GeodeModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public GeodeModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> save) {

        ShapedRecipeBuilder.shaped(GeodeModBlocksRegistry.WRAPPIST_BLOCK.get()).define('S', GeodeModItemsRegistry.WRAPPIST_SHARD.get()).pattern("SS").pattern("SS").unlockedBy("has_wrappist_shard", has(GeodeModItemsRegistry.WRAPPIST_SHARD.get())).save(save);

        ShapedRecipeBuilder.shaped(GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get()).define('F', GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get()).pattern("FF").pattern("FF").unlockedBy("has_quartz_crystal", has(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get())).save(save);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE), GeodeModBlocksRegistry.SMOOTH_END_STONE.get().asItem().asItem(), 0.1F, 200).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(save);
        ShapedRecipeBuilder.shaped(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get()).define('#', Blocks.STONE).define('O', Blocks.OAK_WOOD).define('W', GeodeModItemsRegistry.WRAPPIST_SHARD.get()).pattern("W W").pattern("O#O").unlockedBy("has_wrappist_shard", has(GeodeModItemsRegistry.WRAPPIST_SHARD.get())).save(save);

    }
}
