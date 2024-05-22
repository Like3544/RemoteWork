
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.narkoti.world.inventory.RedstoneBatteryGUIMenu;
import net.mcreator.narkoti.world.inventory.GasFurnaceGUIMenu;
import net.mcreator.narkoti.world.inventory.EGFGUIMenu;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NarkotiMod.MODID);
	public static final RegistryObject<MenuType<GasFurnaceGUIMenu>> GAS_FURNACE_GUI = REGISTRY.register("gas_furnace_gui", () -> IForgeMenuType.create(GasFurnaceGUIMenu::new));
	public static final RegistryObject<MenuType<RedstoneBatteryGUIMenu>> REDSTONE_BATTERY_GUI = REGISTRY.register("redstone_battery_gui", () -> IForgeMenuType.create(RedstoneBatteryGUIMenu::new));
	public static final RegistryObject<MenuType<EGFGUIMenu>> EGFGUI = REGISTRY.register("egfgui", () -> IForgeMenuType.create(EGFGUIMenu::new));
}
