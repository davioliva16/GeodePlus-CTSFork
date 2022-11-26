package net.yeoxuhang.geodeplus.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WrappistPedestalBlock extends BaseEntityBlock {
    public WrappistPedestalBlock(Properties properties) {
        super(properties);
    }


    private static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 8, 15);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
        return !groundState.is(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get()) || groundState.is(GeodeModTagsRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos blockpos = pos.below();
        BlockState groundState = levelReader.getBlockState(blockpos);
        return this.mayPlaceOn(groundState, levelReader, blockpos);
    }

    public InteractionResult use(@NotNull BlockState state, Level worldIn, @NotNull BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(handIn);
        if (worldIn.getBlockEntity(pos) instanceof WrappistPedestalBlockEntity wrappistPedestalBlock && (!player.isShiftKeyDown()  && heldItem.getItem() != this.asItem())) {
            ItemStack stack = heldItem.copy();
            stack.setCount(1);
            if(wrappistPedestalBlock.getItem(0).isEmpty()){
                wrappistPedestalBlock.setItem(0, stack);
                if(!player.isCreative()){
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }else if(wrappistPedestalBlock.getItem(0).sameItem(stack) && wrappistPedestalBlock.getItem(0).getMaxStackSize() > wrappistPedestalBlock.getItem(0).getCount() + stack.getCount()){
                wrappistPedestalBlock.getItem(0).grow(1);
                if(!player.isCreative()){
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }else{
                popResource(worldIn, pos, wrappistPedestalBlock.getItem(0).copy());
                wrappistPedestalBlock.setItem(0, ItemStack.EMPTY);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WrappistPedestalBlockEntity(pos, state);
    }

    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        BlockEntity tileentity = worldIn.getBlockEntity(pos);
        if (tileentity instanceof WrappistPedestalBlockEntity) {
            Containers.dropContents(worldIn, pos, (WrappistPedestalBlockEntity) tileentity);
            worldIn.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, worldIn, pos, newState, isMoving);
    }
}
