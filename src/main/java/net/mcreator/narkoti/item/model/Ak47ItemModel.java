package net.mcreator.narkoti.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.item.Ak47Item;

public class Ak47ItemModel extends GeoModel<Ak47Item> {
	@Override
	public ResourceLocation getAnimationResource(Ak47Item animatable) {
		return new ResourceLocation("narkoti", "animations/ak47.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Ak47Item animatable) {
		return new ResourceLocation("narkoti", "geo/ak47.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Ak47Item animatable) {
		return new ResourceLocation("narkoti", "textures/item/ak-47texturemap.png");
	}
}
