
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import org.checkerframework.checker.units.qual.C;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.narkoti.block.WeedBushBlock;
import net.mcreator.narkoti.block.TitanOreBlock;
import net.mcreator.narkoti.block.TinOreBlock;
import net.mcreator.narkoti.block.SulfurOreBlock;
import net.mcreator.narkoti.block.SolarPanel5Block;
import net.mcreator.narkoti.block.SolarPanel4Block;
import net.mcreator.narkoti.block.SolarPanel3Block;
import net.mcreator.narkoti.block.SolarPanel2Block;
import net.mcreator.narkoti.block.SolarPanel1Block;
import net.mcreator.narkoti.block.RedstoneBatteryBlock;
import net.mcreator.narkoti.block.PurpleLampBlock;
import net.mcreator.narkoti.block.IronCableBlockBlock;
import net.mcreator.narkoti.block.InfinityEnergyGeenratorBlock;
import net.mcreator.narkoti.block.HBlock;
import net.mcreator.narkoti.block.GasFurnaceBlock;
import net.mcreator.narkoti.block.GasBalonBlock;
import net.mcreator.narkoti.block.ElectricGasFurnaceBlock;
import net.mcreator.narkoti.block.ClBlock;
import net.mcreator.narkoti.block.CableBlockBlock;
import net.mcreator.narkoti.block.CH4fBlock;
import net.mcreator.narkoti.block.CH4Block;
import net.mcreator.narkoti.block.CBlock;
import net.mcreator.narkoti.block.C3H8fBlock;
import net.mcreator.narkoti.block.C3H8Block;
import net.mcreator.narkoti.block.BigFlowerPotBlock;
import net.mcreator.narkoti.block.AntiLaserBlockBlock;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NarkotiMod.MODID);
	public static final RegistryObject<Block> GAS_FURNACE = REGISTRY.register("gas_furnace", () -> new GasFurnaceBlock());
	public static final RegistryObject<Block> H = REGISTRY.register("h", () -> new HBlock());
	public static final RegistryObject<Block> C = REGISTRY.register("c", () -> new CBlock());
	public static final RegistryObject<Block> CL = REGISTRY.register("cl", () -> new ClBlock());
	public static final RegistryObject<Block> GAS_BALON = REGISTRY.register("gas_balon", () -> new GasBalonBlock());
	public static final RegistryObject<Block> CH_4 = REGISTRY.register("ch_4", () -> new CH4Block());
	public static final RegistryObject<Block> C_3_H_8 = REGISTRY.register("c_3_h_8", () -> new C3H8Block());
	public static final RegistryObject<Block> CH_4F = REGISTRY.register("ch_4f", () -> new CH4fBlock());
	public static final RegistryObject<Block> C_3_H_8F = REGISTRY.register("c_3_h_8f", () -> new C3H8fBlock());
	public static final RegistryObject<Block> WEED_BUSH = REGISTRY.register("weed_bush", () -> new WeedBushBlock());
	public static final RegistryObject<Block> PURPLE_LAMP = REGISTRY.register("purple_lamp", () -> new PurpleLampBlock());
	public static final RegistryObject<Block> BIG_FLOWER_POT = REGISTRY.register("big_flower_pot", () -> new BigFlowerPotBlock());
	public static final RegistryObject<Block> INFINITY_ENERGY_GEENRATOR = REGISTRY.register("infinity_energy_geenrator", () -> new InfinityEnergyGeenratorBlock());
	public static final RegistryObject<Block> ANTI_LASER_BLOCK = REGISTRY.register("anti_laser_block", () -> new AntiLaserBlockBlock());
	public static final RegistryObject<Block> REDSTONE_BATTERY = REGISTRY.register("redstone_battery", () -> new RedstoneBatteryBlock());
	public static final RegistryObject<Block> CABLE_BLOCK = REGISTRY.register("cable_block", () -> new CableBlockBlock());
	public static final RegistryObject<Block> IRON_CABLE_BLOCK = REGISTRY.register("iron_cable_block", () -> new IronCableBlockBlock());
	public static final RegistryObject<Block> SOLAR_PANEL_1 = REGISTRY.register("solar_panel_1", () -> new SolarPanel1Block());
	public static final RegistryObject<Block> SOLAR_PANEL_2 = REGISTRY.register("solar_panel_2", () -> new SolarPanel2Block());
	public static final RegistryObject<Block> SOLAR_PANEL_3 = REGISTRY.register("solar_panel_3", () -> new SolarPanel3Block());
	public static final RegistryObject<Block> SOLAR_PANEL_4 = REGISTRY.register("solar_panel_4", () -> new SolarPanel4Block());
	public static final RegistryObject<Block> SOLAR_PANEL_5 = REGISTRY.register("solar_panel_5", () -> new SolarPanel5Block());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TITAN_ORE = REGISTRY.register("titan_ore", () -> new TitanOreBlock());
	public static final RegistryObject<Block> SULFUR_ORE = REGISTRY.register("sulfur_ore", () -> new SulfurOreBlock());
	public static final RegistryObject<Block> ELECTRIC_GAS_FURNACE = REGISTRY.register("electric_gas_furnace", () -> new ElectricGasFurnaceBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
