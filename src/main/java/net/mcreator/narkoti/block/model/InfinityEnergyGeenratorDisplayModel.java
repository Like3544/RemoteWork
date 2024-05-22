package net.mcreator.narkoti.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.block.display.InfinityEnergyGeenratorDisplayItem;

public class InfinityEnergyGeenratorDisplayModel extends GeoModel<InfinityEnergyGeenratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InfinityEnergyGeenratorDisplayItem animatable) {
		return new ResourceLocation("narkoti", "animations/infenergygen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfinityEnergyGeenratorDisplayItem animatable) {
		return new ResourceLocation("narkoti", "geo/infenergygen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfinityEnergyGeenratorDisplayItem entity) {
		return new ResourceLocation("narkoti", "textures/block/iegtexture.png");
	}
}
