package net.yeoxuhang.geodeplus.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class WrappistPedestalBlockentityModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wrappistpedestalblockentitymodel"), "main");
	private final ModelPart wrappist_pedestal;

	public WrappistPedestalBlockentityModel(ModelPart root) {
		this.wrappist_pedestal = root.getChild("wrappist_pedestal");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wrappist_pedestal = partdefinition.addOrReplaceChild("wrappist_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition crystals = wrappist_pedestal.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, -5.0F));

		PartDefinition cube_r1 = crystal1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(-5.5F, 2.5F, 0.0F));

		PartDefinition cube_r2 = crystal2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 5.0F));

		PartDefinition cube_r3 = crystal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(5.5F, 2.5F, 0.0F));

		PartDefinition cube_r4 = crystal4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition pedestal = wrappist_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -8.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-7.0F, -14.0F, 7.0F, 14.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(7.0F, -14.0F, -7.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wrappist_pedestal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}