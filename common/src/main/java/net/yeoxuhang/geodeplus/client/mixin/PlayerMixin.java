package net.yeoxuhang.geodeplus.client.mixin;

import net.minecraft.world.entity.player.Player;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class PlayerMixin{
    @Inject(method = "tick", at = @At("TAIL"))
    public void tick(CallbackInfo ci){
        ++WrappistPedestalBlockEntity.tick;
    }

}
