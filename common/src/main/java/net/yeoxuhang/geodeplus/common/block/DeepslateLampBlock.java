package net.yeoxuhang.geodeplus.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.yeoxuhang.geodeplus.common.block.entity.DeepslateLampBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeepslateLampBlock extends BaseEntityBlock {
    public static final BooleanProperty LIT;

    public DeepslateLampBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }

    public static boolean isLit() {
        return LIT.equals(true);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return this.defaultBlockState().setValue(LIT, blockPlaceContext.getLevel().hasNeighborSignal(blockPlaceContext.getClickedPos()));
    }

    public void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, BlockPos blockPos2, boolean bl) {
        if (!level.isClientSide) {
            boolean bl2 = blockState.getValue(LIT);
            if (bl2 != level.hasNeighborSignal(blockPos)) {
                if (bl2) {
                    level.scheduleTick(blockPos, this, 4);
                } else {
                    level.setBlock(blockPos, blockState.cycle(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(LIT) && !serverLevel.hasNeighborSignal(blockPos)) {
            serverLevel.setBlock(blockPos, blockState.cycle(LIT), 2);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{LIT});
    }

    static {
        LIT = RedstoneTorchBlock.LIT;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new DeepslateLampBlockEntity(blockPos, blockState);
    }

    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        BlockEntity tileentity = worldIn.getBlockEntity(pos);
        if (tileentity instanceof DeepslateLampBlockEntity) {
            Containers.dropContents(worldIn, pos, (DeepslateLampBlockEntity) tileentity);
            worldIn.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, worldIn, pos, newState, isMoving);
    }

    public InteractionResult use(@NotNull BlockState state, Level worldIn, @NotNull BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(handIn);
        if (worldIn.getBlockEntity(pos) instanceof DeepslateLampBlockEntity deepslateLampBlockEntity && (!player.isShiftKeyDown()  && heldItem.getItem() != this.asItem() && heldItem.is(Item.byBlock(GlassBlock.byItem(heldItem.getItem()))))) {
            ItemStack stack = heldItem.copy();
            stack.setCount(1);
            if(deepslateLampBlockEntity.getItem(0).isEmpty()){
                deepslateLampBlockEntity.setItem(0, stack);
                if(!player.isCreative()){
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }else if(deepslateLampBlockEntity.getItem(0).is(stack.getItem()) && deepslateLampBlockEntity.getItem(0).getMaxStackSize() > deepslateLampBlockEntity.getItem(0).getCount() + stack.getCount()){
                deepslateLampBlockEntity.getItem(0).grow(1);
                if(!player.isCreative()){
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            } else{
                popResource(worldIn, pos, deepslateLampBlockEntity.getItem(0).copy());
                deepslateLampBlockEntity.setItem(0, ItemStack.EMPTY);
                return InteractionResult.SUCCESS;
            }
        } else if (worldIn.getBlockEntity(pos) instanceof DeepslateLampBlockEntity deepslateLampBlockEntity && (!player.isShiftKeyDown()  && heldItem.getItem() != this.asItem() && !heldItem.is(GeodePlusTagRegistry.Items.IS_GLASS))){

        }
        return InteractionResult.PASS;
    }
}
