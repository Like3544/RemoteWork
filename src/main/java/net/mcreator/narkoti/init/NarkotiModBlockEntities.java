
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.narkoti.block.entity.SolarPanel5BlockEntity;
import net.mcreator.narkoti.block.entity.SolarPanel4BlockEntity;
import net.mcreator.narkoti.block.entity.SolarPanel3BlockEntity;
import net.mcreator.narkoti.block.entity.SolarPanel2BlockEntity;
import net.mcreator.narkoti.block.entity.SolarPanel1BlockEntity;
import net.mcreator.narkoti.block.entity.RedstoneBatteryBlockEntity;
import net.mcreator.narkoti.block.entity.IronCableBlockBlockEntity;
import net.mcreator.narkoti.block.entity.InfinityEnergyGeenratorTileEntity;
import net.mcreator.narkoti.block.entity.GasFurnaceBlockEntity;
import net.mcreator.narkoti.block.entity.GasBalonBlockEntity;
import net.mcreator.narkoti.block.entity.ElectricGasFurnaceBlockEntity;
import net.mcreator.narkoti.block.entity.CableBlockBlockEntity;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NarkotiMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GAS_FURNACE = register("gas_furnace", NarkotiModBlocks.GAS_FURNACE, GasFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GAS_BALON = register("gas_balon", NarkotiModBlocks.GAS_BALON, GasBalonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<InfinityEnergyGeenratorTileEntity>> INFINITY_ENERGY_GEENRATOR = REGISTRY.register("infinity_energy_geenrator",
			() -> BlockEntityType.Builder.of(InfinityEnergyGeenratorTileEntity::new, NarkotiModBlocks.INFINITY_ENERGY_GEENRATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_BATTERY = register("redstone_battery", NarkotiModBlocks.REDSTONE_BATTERY, RedstoneBatteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_BLOCK = register("cable_block", NarkotiModBlocks.CABLE_BLOCK, CableBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_CABLE_BLOCK = register("iron_cable_block", NarkotiModBlocks.IRON_CABLE_BLOCK, IronCableBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_1 = register("solar_panel_1", NarkotiModBlocks.SOLAR_PANEL_1, SolarPanel1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_2 = register("solar_panel_2", NarkotiModBlocks.SOLAR_PANEL_2, SolarPanel2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_3 = register("solar_panel_3", NarkotiModBlocks.SOLAR_PANEL_3, SolarPanel3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_4 = register("solar_panel_4", NarkotiModBlocks.SOLAR_PANEL_4, SolarPanel4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_5 = register("solar_panel_5", NarkotiModBlocks.SOLAR_PANEL_5, SolarPanel5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_GAS_FURNACE = register("electric_gas_furnace", NarkotiModBlocks.ELECTRIC_GAS_FURNACE, ElectricGasFurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
