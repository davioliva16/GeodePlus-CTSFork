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

import java.util.Collections;
import java.util.List;

public class BuddingCelestiteBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingCelestiteBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(20) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get()) && blockstate.getValue(CelestiteClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get()) && blockstate.getValue(CelestiteClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get();
            } else if (blockstate.is(GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get()) && blockstate.getValue(CelestiteClusterBlock.FACING) == direction) {
                block = GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get();
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(CelestiteClusterBlock.FACING, direction).setValue(CelestiteClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }


    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack budding = new ItemStack(GeodePlusBlocksRegistry.BUDDING_CELESTITE.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && GeodePlusCommonConfigs.SHOULD_SILK_TOUCH_BUDDING_BLOCKS.get()){
            return Collections.singletonList(budding);
        }
        return super.getDrops(blockState, builder);
    }
}