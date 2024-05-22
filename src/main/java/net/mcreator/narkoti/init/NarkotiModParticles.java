
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.narkoti.client.particle.PurpleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NarkotiModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(NarkotiModParticleTypes.PURPLE.get(), PurpleParticle::provider);
	}
}
