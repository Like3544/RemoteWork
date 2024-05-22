package net.mcreator.narkoti.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.narkoti.block.model.InfinityEnergyGeenratorBlockModel;
import net.mcreator.narkoti.block.entity.InfinityEnergyGeenratorTileEntity;

public class InfinityEnergyGeenratorTileRenderer extends GeoBlockRenderer<InfinityEnergyGeenratorTileEntity> {
	public InfinityEnergyGeenratorTileRenderer() {
		super(new InfinityEnergyGeenratorBlockModel());
	}

	@Override
	public RenderType getRenderType(InfinityEnergyGeenratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
