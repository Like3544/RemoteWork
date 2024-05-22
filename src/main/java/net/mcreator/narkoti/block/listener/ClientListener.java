package net.mcreator.narkoti.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.narkoti.init.NarkotiModBlockEntities;
import net.mcreator.narkoti.block.renderer.InfinityEnergyGeenratorTileRenderer;
import net.mcreator.narkoti.NarkotiMod;

@Mod.EventBusSubscriber(modid = NarkotiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(NarkotiModBlockEntities.INFINITY_ENERGY_GEENRATOR.get(), context -> new InfinityEnergyGeenratorTileRenderer());
	}
}
