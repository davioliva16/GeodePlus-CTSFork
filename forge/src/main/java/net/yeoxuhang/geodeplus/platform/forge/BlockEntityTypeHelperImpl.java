package net.yeoxuhang.geodeplus.platform.forge;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.block.entity.DeepslateLampBlockEntity;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockEntityTypeHelperImpl {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GeodePlus.MOD_ID);

    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createWrappistPedastle() {
        return BLOCK_ENTITIES.register("wrappist_pedestal", () ->
                BlockEntityType.Builder.of(WrappistPedestalBlockEntity::new,
                        GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get()).build(null));
    }

    public static Supplier<BlockEntityType<DeepslateLampBlockEntity>> createDeepslateLamp() {
        return BLOCK_ENTITIES.register("deepslate_lamp", () ->
                BlockEntityType.Builder.of(DeepslateLampBlockEntity::new,
                        GeodePlusBlocksRegistry.DEEPSLATE_LAMP.get()).build(null));
    }
}
