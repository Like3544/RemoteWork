package net.mcreator.narkoti.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.item.DeagleItem;

public class DeagleItemModel extends GeoModel<DeagleItem> {
	@Override
	public ResourceLocation getAnimationResource(DeagleItem animatable) {
		return new ResourceLocation("narkoti", "animations/deserteaglen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeagleItem animatable) {
		return new ResourceLocation("narkoti", "geo/deserteaglen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeagleItem animatable) {
		return new ResourceLocation("narkoti", "textures/item/detexturemap.png");
	}
}
