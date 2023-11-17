package net.yeoxuhang.geodeplus.client.render;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.yeoxuhang.geodeplus.common.projectile.WrappistHornEffect;

public class RenderNothing extends EntityRenderer<WrappistHornEffect> {
    public RenderNothing(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(WrappistHornEffect entity) {
        return null;
    }
}

