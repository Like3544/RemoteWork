package net.mcreator.narkoti.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.narkoti.block.model.InfinityEnergyGeenratorDisplayModel;
import net.mcreator.narkoti.block.display.InfinityEnergyGeenratorDisplayItem;

public class InfinityEnergyGeenratorDisplayItemRenderer extends GeoItemRenderer<InfinityEnergyGeenratorDisplayItem> {
	public InfinityEnergyGeenratorDisplayItemRenderer() {
		super(new InfinityEnergyGeenratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(InfinityEnergyGeenratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
