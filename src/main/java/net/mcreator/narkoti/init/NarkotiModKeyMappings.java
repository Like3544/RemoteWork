
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.narkoti.network.HelmetSlotActiveMessage;
import net.mcreator.narkoti.network.AltMessage;
import net.mcreator.narkoti.NarkotiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NarkotiModKeyMappings {
	public static final KeyMapping ALT = new KeyMapping("key.narkoti.alt", GLFW.GLFW_KEY_LEFT, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				NarkotiMod.PACKET_HANDLER.sendToServer(new AltMessage(0, 0));
				AltMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HELMET_SLOT_ACTIVE = new KeyMapping("key.narkoti.helmet_slot_active", GLFW.GLFW_KEY_N, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				NarkotiMod.PACKET_HANDLER.sendToServer(new HelmetSlotActiveMessage(0, 0));
				HelmetSlotActiveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ALT);
		event.register(HELMET_SLOT_ACTIVE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ALT.consumeClick();
				HELMET_SLOT_ACTIVE.consumeClick();
			}
		}
	}
}
