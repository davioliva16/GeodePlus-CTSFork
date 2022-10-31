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
import net.yeoxuhang.geodeplus.common.block.blockentity.WrappistPedestalBlockEntity;

import java.util.Random;

public class OldWrappistPedestalBlockEntityRenderer<T extends WrappistPedestalBlockEntity> implements BlockEntityRenderer<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(GeodePlus.MOD_ID, "wrappistpedestalblockentitymodel"), "main");

    private final Random random = new Random();
    private final ItemRenderer itemRenderer;
    private static final ResourceLocation TEXTURE = new ResourceLocation("geode:textures/entity/wrappist_pedestal/wrappist_pedestal.png");
    private static ModelPart wrappist_pedestal;
    private final ModelPart crystals;
    private final ModelPart crystal1;
    private final ModelPart crystal2;
    private final ModelPart crystal3;
    private final ModelPart crystal4;


    public OldWrappistPedestalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        ModelPart modelpart = context.bakeLayer(OldWrappistPedestalBlockEntityRenderer.LAYER_LOCATION);
        this.wrappist_pedestal = modelpart.getChild("wrappist_pedestal");
        this.crystals = wrappist_pedestal.getChild("crystals");
        this.crystal1 = crystals.getChild("crystal1");
        this.crystal2 = crystals.getChild("crystal2");
        this.crystal3 = crystals.getChild("crystal3");
        this.crystal4 = crystals.getChild("crystal4");
        this.itemRenderer = context.getItemRenderer();
    }

    protected int getModelCount(ItemStack stack) {
        int i = 1;
        if (stack.getCount() > 48) {
            i = 5;
        } else if (stack.getCount() > 32) {
            i = 4;
        } else if (stack.getCount() > 16) {
            i = 3;
        } else if (stack.getCount() > 1) {
            i = 2;
        }

        return i;
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition wrappist_pedestal = partdefinition.addOrReplaceChild("wrappist_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition crystals = wrappist_pedestal.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

        PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -7.0F));

        PartDefinition cube_r1 = crystal1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(-7.0F, -2.0F, 0.0F));

        PartDefinition cube_r2 = crystal2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));

        PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 7.0F));

        PartDefinition cube_r3 = crystal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(7.0F, -1.0F, 0.0F));

        PartDefinition cube_r4 = crystal4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));

        PartDefinition pedestal = wrappist_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void render(T entity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int combinedLightIn, int combinedOverlayIn) {
        Level world = entity.getLevel();
        assert world != null;
        long gameTime = world.getGameTime();
        float offsetY = (float)Math.sin((double)((float)gameTime / 8.0F)) * 0.025F;
        float wrappistBlockEntity = entity.tick();
        float crystalTick = wrappistBlockEntity / 35f;
        float tick = wrappistBlockEntity / 10f;
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
        wrappist_pedestal.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)), combinedLightIn, combinedOverlayIn, 1, 1F, 1, 1);
        crystals.setRotation(0.0f, -crystalTick % 360, 0.0f);
        wrappist_pedestal.setPos(8, -2, -8);

        if (entity.hasLevel() && !entity.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, offsetY - 1.0, -0.5);
            poseStack.scale(0.35f,0.35f,0.35f);
            poseStack.mulPose(Vector3f.YP.rotationDegrees((tick % 360)));
            poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(entity.getItem(0), ItemTransforms.TransformType.NONE, combinedLightIn, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, 0);
            poseStack.popPose();
        }
        /*if (!entity.isEmpty()){
            ItemStack stack = entity.getItem(0);
            poseStack.translate(0,  offsetY+ 0.7, 0);
            poseStack.scale(0.5f,0.5f,0.5f);
            Quaternion rotation = Vector3f.XP.rotationDegrees(180.0F);
            rotation.mul(Vector3f.YP.rotationDegrees(180));
            poseStack.mulPose(rotation);
            BakedModel ibakedmodel = Minecraft.getInstance().getItemRenderer().getModel(stack, entity.getLevel(), (LivingEntity)null, 0);
            Minecraft.getInstance().getItemRenderer().render(stack, ItemTransforms.TransformType.FIXED, true, poseStack, multiBufferSource, combinedLightIn, OverlayTexture.NO_OVERLAY, ibakedmodel);

        }*/
    }

    public static void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103015_, int p_103016_, float p_103017_, float p_103018_, float p_103019_, float p_103020_) {
        wrappist_pedestal.render(poseStack,vertexConsumer, p_103015_, p_103016_);
    }
}
