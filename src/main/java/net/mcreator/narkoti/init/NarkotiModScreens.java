
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.narkoti.client.gui.RedstoneBatteryGUIScreen;
import net.mcreator.narkoti.client.gui.GasFurnaceGUIScreen;
import net.mcreator.narkoti.client.gui.EGFGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NarkotiModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NarkotiModMenus.GAS_FURNACE_GUI.get(), GasFurnaceGUIScreen::new);
			MenuScreens.register(NarkotiModMenus.REDSTONE_BATTERY_GUI.get(), RedstoneBatteryGUIScreen::new);
			MenuScreens.register(NarkotiModMenus.EGFGUI.get(), EGFGUIScreen::new);
		});
	}
}
