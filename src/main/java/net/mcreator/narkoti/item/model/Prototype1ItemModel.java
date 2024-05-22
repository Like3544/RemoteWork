package net.mcreator.narkoti.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.item.Prototype1Item;

public class Prototype1ItemModel extends GeoModel<Prototype1Item> {
	@Override
	public ResourceLocation getAnimationResource(Prototype1Item animatable) {
		return new ResourceLocation("narkoti", "animations/prototype1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Prototype1Item animatable) {
		return new ResourceLocation("narkoti", "geo/prototype1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Prototype1Item animatable) {
		return new ResourceLocation("narkoti", "textures/item/prototype1tm.png");
	}
}
