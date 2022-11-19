package net.yeoxuhang.geodeplus.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;

public class BuddingWrappistBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 10;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingWrappistBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(30) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get()) && blockstate.getValue(WrappistClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get();
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
}