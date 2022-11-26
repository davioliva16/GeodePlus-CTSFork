package net.yeoxuhang.geodeplus.platform.fabric;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class BlockEntityTypeHelperImpl {
    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createWrappistPedastle() {
        BlockEntityType<?> type = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(GeodePlus.MOD_ID, "wrappist_pedestal"), FabricBlockEntityTypeBuilder.create(WrappistPedestalBlockEntity::new).addBlock(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get()).build());
        return () -> (BlockEntityType<WrappistPedestalBlockEntity>) type;
    }
}
