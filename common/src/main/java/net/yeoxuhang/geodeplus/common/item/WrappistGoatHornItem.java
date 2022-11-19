package net.yeoxuhang.geodeplus.common.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WrappistGoatHornItem extends Item {
    public WrappistGoatHornItem(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemstack = player.getItemInHand(interactionHand);
        if (!player.isCreative()) {
            player.startUsingItem(interactionHand);
            player.getCooldowns().addCooldown(this, 50);
            return InteractionResultHolder.consume(itemstack);

        } else{
            player.startUsingItem(interactionHand);
            return InteractionResultHolder.consume(itemstack);
        }
    }
}
