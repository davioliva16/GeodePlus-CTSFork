package net.yeoxuhang.geodeplus.platform.fabric;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.block.entity.DeepslateLampBlockEntity;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

import java.util.function.Supplier;

public class BlockEntityTypeHelperImpl {
    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createWrappistPedastle() {
        BlockEntityType<?> type = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(GeodePlus.MOD_ID, "wrappist_pedestal"), FabricBlockEntityTypeBuilder.create(WrappistPedestalBlockEntity::new).addBlock(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get()).build());
        return () -> (BlockEntityType<WrappistPedestalBlockEntity>) type;
    }
    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createDeepslateLamp() {
        BlockEntityType<?> type = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(GeodePlus.MOD_ID, "deepslate_lamp"), FabricBlockEntityTypeBuilder.create(DeepslateLampBlockEntity::new).addBlock(GeodePlusBlocksRegistry.DEEPSLATE_LAMP.get()).build());
        return () -> (BlockEntityType<WrappistPedestalBlockEntity>) type;
    }
}
