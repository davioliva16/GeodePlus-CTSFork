package net.yeoxuhang.geodeplus.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;

public class BuddingDiamondBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingDiamondBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get();
            } else if (blockstate.is(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get();
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(OresClusterBlock.FACING, direction).setValue(OresClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    @Override
    public void spawnAfterBreak(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, ItemStack itemStack, boolean bl) {
        super.spawnAfterBreak(blockState, serverLevel, blockPos, itemStack, bl);
        popExperience(serverLevel, blockPos, 5);
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}