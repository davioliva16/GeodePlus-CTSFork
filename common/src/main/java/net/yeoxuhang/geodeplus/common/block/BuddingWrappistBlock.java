package net.yeoxuhang.geodeplus.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.Collections;
import java.util.List;

public class BuddingWrappistBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 10;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingWrappistBlock(Properties properties) {
        super(properties);
    }
    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(30) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(WrappistClusterBlock.FACING, direction).setValue(WrappistClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack budding = new ItemStack(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && GeodePlusCommonConfigs.SHOULD_SILK_TOUCH_BUDDING_BLOCKS.get()){
            return Collections.singletonList(budding);
        }
        return super.getDrops(blockState, builder);
    }
}