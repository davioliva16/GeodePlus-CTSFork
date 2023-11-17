package net.yeoxuhang.geodeplus.common.projectile;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusEntityRegistry;

import java.util.Iterator;
import java.util.List;

public class WrappistHornEffect extends AbstractHurtingProjectile {

    public WrappistHornEffect(EntityType<? extends WrappistHornEffect> entityType, Level level) {
        super(entityType, level);
    }

    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
    }
}
