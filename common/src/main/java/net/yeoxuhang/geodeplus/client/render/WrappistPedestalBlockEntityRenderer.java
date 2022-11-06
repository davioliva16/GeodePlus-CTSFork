package net.yeoxuhang.geodeplus.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.model.layer.GeodeModModelLayers;
import net.yeoxuhang.geodeplus.common.block.blockentity.WrappistPedestalBlockEntity;

import java.util.Random;

public class WrappistPedestalBlockEntityRenderer<T extends WrappistPedestalBlockEntity> implements BlockEntityRenderer<T> {
    private final Random random = new Random();
    private final ItemRenderer itemRenderer;
    private static final ResourceLocation TEXTURE = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/wrappist_pedestal/wrappist_pedestal.png");
    private static ModelPart wrappist_pedestal;
    private final ModelPart crystals;
    private final ModelPart crystal1;
    private final ModelPart crystal2;
    private final ModelPart crystal3;
    private final ModelPart crystal4;

    public WrappistPedestalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        ModelPart modelpart = context.bakeLayer(GeodeModModelLayers.WRAPPIST_PEDESTAL);
        wrappist_pedestal = modelpart.getChild("wrappist_pedestal");
        this.crystals = wrappist_pedestal.getChild("crystals");
        this.crystal1 = this.crystals.getChild("crystal1");
        this.crystal2 = this.crystals.getChild("crystal2");
        this.crystal3 = this.crystals.getChild("crystal3");
        this.crystal4 = this.crystals.getChild("crystal4");
        this.itemRenderer = context.getItemRenderer();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition wrappist_pedestal = partdefinition.addOrReplaceChild("wrappist_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition crystals = wrappist_pedestal.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
        PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -7.0F));
        crystal1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
        PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(-7.0F, -2.0F, 0.0F));
        crystal2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));
        PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 7.0F));
        crystal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
        PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(7.0F, -1.0F, 0.0F));
        crystal4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));
        wrappist_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void render(T entity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int combinedLightIn, int combinedOverlayIn) {
        Level world = entity.getLevel();

        assert world != null;

        long gameTime = world.getGameTime();
        float offsetY = (float)Math.sin((double)((float)gameTime / 8.0F)) * 0.025F;
        float wrappistBlockEntity = (float)entity.tick();
        float crystalTick = wrappistBlockEntity / 35.0F;
        float tick = wrappistBlockEntity / 10.0F;
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
        wrappist_pedestal.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        this.crystals.setRotation(0.0F, -crystalTick % 360.0F, 0.0F);
        wrappist_pedestal.setPos(8.0F, -2.0F, -8.0F);
        if (entity.hasLevel() && !entity.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, (double)offsetY - 1.0, -0.5);
            poseStack.scale(0.35F, 0.35F, 0.35F);
            poseStack.mulPose(Vector3f.YP.rotationDegrees(tick % 360.0F));
            poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(entity.getItem(0), ItemTransforms.TransformType.NONE, combinedLightIn, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, 0);
            poseStack.popPose();
        }

    }

    public static void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103015_, int p_103016_, float p_103017_, float p_103018_, float p_103019_, float p_103020_) {
        wrappist_pedestal.render(poseStack, vertexConsumer, p_103015_, p_103016_);
    }
}