package net.mcreator.narkoti.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.block.entity.InfinityEnergyGeenratorTileEntity;

public class InfinityEnergyGeenratorBlockModel extends GeoModel<InfinityEnergyGeenratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfinityEnergyGeenratorTileEntity animatable) {
		return new ResourceLocation("narkoti", "animations/infenergygen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfinityEnergyGeenratorTileEntity animatable) {
		return new ResourceLocation("narkoti", "geo/infenergygen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfinityEnergyGeenratorTileEntity animatable) {
		return new ResourceLocation("narkoti", "textures/block/iegtexture.png");
	}
}
