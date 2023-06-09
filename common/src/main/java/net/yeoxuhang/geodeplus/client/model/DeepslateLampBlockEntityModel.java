package net.yeoxuhang.geodeplus.client.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;

public class DeepslateLampBlockEntityModel extends Model {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public final ModelPart crystals_pedestal;

	public DeepslateLampBlockEntityModel(ModelPart root) {
		super(RenderType::entityCutoutNoCull);
		this.crystals_pedestal = root.getChild("crystals_pedestal");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition crystals_pedestal = partdefinition.addOrReplaceChild("crystals_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition pedestal = crystals_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -4.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lamp = crystals_pedestal.addOrReplaceChild("lamp", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -9.5F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int j, float f, float g, float h, float k) {
		crystals_pedestal.render(poseStack, vertexConsumer, i, j, f, g,h, k);
	}
}