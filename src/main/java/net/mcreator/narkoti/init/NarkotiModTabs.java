
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NarkotiMod.MODID);
	public static final RegistryObject<CreativeModeTab> NARKOTA = REGISTRY.register("narkota",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.narkoti.narkota")).icon(() -> new ItemStack(NarkotiModBlocks.GAS_FURNACE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NarkotiModBlocks.GAS_FURNACE.get().asItem());
				tabData.accept(NarkotiModBlocks.GAS_BALON.get().asItem());
				tabData.accept(NarkotiModItems.WEED_BUSH_SEEDS.get());
				tabData.accept(NarkotiModBlocks.PURPLE_LAMP.get().asItem());
				tabData.accept(NarkotiModBlocks.BIG_FLOWER_POT.get().asItem());
				tabData.accept(NarkotiModItems.MARIJUANA_LEAF.get());
				tabData.accept(NarkotiModBlocks.INFINITY_ENERGY_GEENRATOR.get().asItem());
				tabData.accept(NarkotiModItems.DEAGLE.get());
				tabData.accept(NarkotiModItems.PISTOL_AMMON.get());
				tabData.accept(NarkotiModItems.AK_47.get());
				tabData.accept(NarkotiModItems.RIFLE_AMMO.get());
				tabData.accept(NarkotiModItems.BATTERY_F.get());
				tabData.accept(NarkotiModItems.BATTERY_E.get());
				tabData.accept(NarkotiModBlocks.ANTI_LASER_BLOCK.get().asItem());
				tabData.accept(NarkotiModBlocks.REDSTONE_BATTERY.get().asItem());
				tabData.accept(NarkotiModBlocks.CABLE_BLOCK.get().asItem());
				tabData.accept(NarkotiModBlocks.IRON_CABLE_BLOCK.get().asItem());
				tabData.accept(NarkotiModBlocks.SOLAR_PANEL_1.get().asItem());
				tabData.accept(NarkotiModBlocks.SOLAR_PANEL_2.get().asItem());
				tabData.accept(NarkotiModBlocks.SOLAR_PANEL_3.get().asItem());
				tabData.accept(NarkotiModBlocks.SOLAR_PANEL_4.get().asItem());
				tabData.accept(NarkotiModBlocks.SOLAR_PANEL_5.get().asItem());
				tabData.accept(NarkotiModItems.NIGHT_VISION_HELMET_HELMET.get());
				tabData.accept(NarkotiModItems.SMELTED_IRON_INGOT.get());
				tabData.accept(NarkotiModItems.TIN_INGOT.get());
				tabData.accept(NarkotiModItems.TITAN_INGOT.get());
				tabData.accept(NarkotiModBlocks.TIN_ORE.get().asItem());
				tabData.accept(NarkotiModBlocks.TITAN_ORE.get().asItem());
				tabData.accept(NarkotiModItems.SULFUR_DUST.get());
				tabData.accept(NarkotiModBlocks.SULFUR_ORE.get().asItem());
				tabData.accept(NarkotiModItems.RAW_TITAN_ORE.get());
				tabData.accept(NarkotiModItems.RAW_TIN_ORE.get());
				tabData.accept(NarkotiModBlocks.ELECTRIC_GAS_FURNACE.get().asItem());
			}).withSearchBar().build());
}
