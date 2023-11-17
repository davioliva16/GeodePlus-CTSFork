package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.yeoxuhang.geodeplus.common.projectile.WrappistHornEffect;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;

import java.util.function.Supplier;

public class GeodePlusEntityRegistry {
    public static final Supplier<EntityType<WrappistHornEffect>> WRAPPIST_HORN_EFFECT = RegistryHelper.registerEntity("wrappist_goat_horn",
            (entityType, level) -> new WrappistHornEffect(entityType, level), MobCategory.MISC, 1F, 1F, 1);

    public static void init() {}
}
