package net.yeoxuhang.geodeplus.client.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.yeoxuhang.geodeplus.client.GeodePlusClient;
import net.yeoxuhang.geodeplus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockEntityWithoutLevelRenderer.class)
public class BlockEntityWithoutLevelRendererMixin {
    public WrappistPedestalBlockEntityModel wrappistPedestal;
    @Shadow
    private final EntityModelSet entityModelSet;

    public BlockEntityWithoutLevelRendererMixin(EntityModelSet entityModelSet, BlockEntityRendererProvider.Context context) {
        this.entityModelSet = entityModelSet;
    }

    @Inject(method = "renderByItem", at = @At("RETURN"))
    private void renderByItemGeodePlus(ItemStack itemStack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j, CallbackInfo ci) {
        if (itemStack.is(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get().asItem())) {
            float test = WrappistPedestalBlockEntity.tick;
            float e = ++test;
            float tick = e / 36.0F;
            poseStack.pushPose();
            poseStack.scale(1.1F, 1.1F, 1.1F);
            poseStack.translate(0.8, 1, 0);
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            VertexConsumer vertexConsumer2 = ItemRenderer.getFoilBufferDirect(multiBufferSource, RenderType.entityCutoutNoCull(WrappistPedestalBlockEntityRenderer.TEXTURE), false, itemStack.hasFoil());
            this.wrappistPedestal.renderToBuffer(poseStack, vertexConsumer2, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
            this.wrappistPedestal.crystals.setRotation(0.0F, tick % 360.0F, 0.0F);
            poseStack.popPose();
        }
    }
    @Inject(method = "onResourceManagerReload", at = @At("RETURN"))
    public void onResourceManagerReloadGeodePlus(ResourceManager resourceManager, CallbackInfo ci) {
        this.wrappistPedestal = new WrappistPedestalBlockEntityModel(this.entityModelSet.bakeLayer(GeodePlusClient.WRAPPIST_PEDESTAL));
    }

}
