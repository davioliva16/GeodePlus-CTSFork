package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.platform.BlockEntityTypeHelper;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class GeodeModBlockEntitiesRegistry {
    public static final Supplier<BlockEntityType<WrappistPedestalBlockEntity>> WRAPPIST_PEDESTAL_ENTITY = BlockEntityTypeHelper.createWrappistPedastle();
    public static void initialize() {
    }
}
