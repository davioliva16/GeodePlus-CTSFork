package net.yeoxuhang.geodeplus.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.model.DeepslateLampBlockEntityModel;
import net.yeoxuhang.geodeplus.client.model.layer.GeodePlusModelLayersRegistry;
import net.yeoxuhang.geodeplus.common.block.DeepslateLampBlock;
import net.yeoxuhang.geodeplus.common.block.entity.DeepslateLampBlockEntity;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

public class DeepslateLampBlockEntityRenderer<T extends DeepslateLampBlockEntity> implements BlockEntityRenderer<T> {
    private final ItemRenderer itemRenderer;
    private static DeepslateLampBlockEntityModel deepslateLampEntityModel;

    public static final ResourceLocation TEXTURE = new ResourceLocation(GeodePlus.MOD_ID, "textures/block/deepslate_lamp.png");
    public static final ResourceLocation ON = new ResourceLocation(GeodePlus.MOD_ID, "textures/block/deepslate_lamp_on.png");


    public DeepslateLampBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRenderer = context.getItemRenderer();
        deepslateLampEntityModel = new DeepslateLampBlockEntityModel(context.bakeLayer(GeodePlusModelLayersRegistry.DEEPSLATE_LAMP));
    }

    @Override
    public void render(T blockEntity, float f, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j) {
        poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
        if (blockEntity.hasLevel() && blockEntity.isLit()){
            deepslateLampEntityModel.crystals_pedestal.setPos(8.0F, 0.0F, -8.0F);
            deepslateLampEntityModel.renderToBuffer(poseStack, multiBufferSource.getBuffer(RenderType.entitySmoothCutout(ON)), i, j, 1.0F, 1.0F, 1.0F, 1.0F);
        } deepslateLampEntityModel.crystals_pedestal.setPos(8.0F, 0.0F, -8.0F);
        deepslateLampEntityModel.renderToBuffer(poseStack, multiBufferSource.getBuffer(RenderType.entitySmoothCutout(TEXTURE)), i, j, 1.0F, 1.0F, 1.0F, 1.0F);
        if (blockEntity.hasLevel() && !blockEntity.isEmpty()) {
            poseStack.translate(0.5, -0.5, -0.5);
            poseStack.scale(1F, 1F, 1F);
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(blockEntity.getItem(0), ItemDisplayContext.HEAD, i, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, blockEntity.getLevel(), j);
        } else if (blockEntity.hasLevel() && blockEntity.isEmpty()){
            ItemStack itemStack = Items.GLASS.getDefaultInstance();
            poseStack.translate(0.5, -0.5, -0.5);
            poseStack.scale(1F, 1F, 1F);
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(itemStack, ItemDisplayContext.HEAD, i, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, blockEntity.getLevel(), j);
        }
    }
}
