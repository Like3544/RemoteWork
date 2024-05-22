
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.narkoti.item.WeedBushSeedsItem;
import net.mcreator.narkoti.item.TitanIngotItem;
import net.mcreator.narkoti.item.TinIngotItem;
import net.mcreator.narkoti.item.SulfurDustItem;
import net.mcreator.narkoti.item.SmeltedIronIngotItem;
import net.mcreator.narkoti.item.RifleAmmoItem;
import net.mcreator.narkoti.item.RawTitanOreItem;
import net.mcreator.narkoti.item.RawTinOreItem;
import net.mcreator.narkoti.item.Prototype1Item;
import net.mcreator.narkoti.item.PistolAmmonItem;
import net.mcreator.narkoti.item.NightVisionHelmetItem;
import net.mcreator.narkoti.item.MarijuanaLeafItem;
import net.mcreator.narkoti.item.HItem;
import net.mcreator.narkoti.item.DeagleItem;
import net.mcreator.narkoti.item.ClItem;
import net.mcreator.narkoti.item.CItem;
import net.mcreator.narkoti.item.CH4fItem;
import net.mcreator.narkoti.item.C3H8fItem;
import net.mcreator.narkoti.item.BatteryFItem;
import net.mcreator.narkoti.item.BatteryEItem;
import net.mcreator.narkoti.item.Ak47Item;
import net.mcreator.narkoti.block.display.InfinityEnergyGeenratorDisplayItem;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NarkotiMod.MODID);
	public static final RegistryObject<Item> GAS_FURNACE = block(NarkotiModBlocks.GAS_FURNACE);
	public static final RegistryObject<Item> H_BUCKET = REGISTRY.register("h_bucket", () -> new HItem());
	public static final RegistryObject<Item> C_BUCKET = REGISTRY.register("c_bucket", () -> new CItem());
	public static final RegistryObject<Item> CL_BUCKET = REGISTRY.register("cl_bucket", () -> new ClItem());
	public static final RegistryObject<Item> GAS_BALON = block(NarkotiModBlocks.GAS_BALON);
	public static final RegistryObject<Item> CH_4 = block(NarkotiModBlocks.CH_4);
	public static final RegistryObject<Item> C_3_H_8 = block(NarkotiModBlocks.C_3_H_8);
	public static final RegistryObject<Item> CH_4F_BUCKET = REGISTRY.register("ch_4f_bucket", () -> new CH4fItem());
	public static final RegistryObject<Item> C_3_H_8F_BUCKET = REGISTRY.register("c_3_h_8f_bucket", () -> new C3H8fItem());
	public static final RegistryObject<Item> WEED_BUSH_SEEDS = REGISTRY.register("weed_bush_seeds", () -> new WeedBushSeedsItem());
	public static final RegistryObject<Item> WEED_BUSH = block(NarkotiModBlocks.WEED_BUSH);
	public static final RegistryObject<Item> PURPLE_LAMP = block(NarkotiModBlocks.PURPLE_LAMP);
	public static final RegistryObject<Item> BIG_FLOWER_POT = block(NarkotiModBlocks.BIG_FLOWER_POT);
	public static final RegistryObject<Item> MARIJUANA_LEAF = REGISTRY.register("marijuana_leaf", () -> new MarijuanaLeafItem());
	public static final RegistryObject<Item> INFINITY_ENERGY_GEENRATOR = REGISTRY.register(NarkotiModBlocks.INFINITY_ENERGY_GEENRATOR.getId().getPath(),
			() -> new InfinityEnergyGeenratorDisplayItem(NarkotiModBlocks.INFINITY_ENERGY_GEENRATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEAGLE = REGISTRY.register("deagle", () -> new DeagleItem());
	public static final RegistryObject<Item> PISTOL_AMMON = REGISTRY.register("pistol_ammon", () -> new PistolAmmonItem());
	public static final RegistryObject<Item> RIFLE_AMMO = REGISTRY.register("rifle_ammo", () -> new RifleAmmoItem());
	public static final RegistryObject<Item> AK_47 = REGISTRY.register("ak_47", () -> new Ak47Item());
	public static final RegistryObject<Item> PROTOTYPE_1 = REGISTRY.register("prototype_1", () -> new Prototype1Item());
	public static final RegistryObject<Item> BATTERY_F = REGISTRY.register("battery_f", () -> new BatteryFItem());
	public static final RegistryObject<Item> BATTERY_E = REGISTRY.register("battery_e", () -> new BatteryEItem());
	public static final RegistryObject<Item> ANTI_LASER_BLOCK = block(NarkotiModBlocks.ANTI_LASER_BLOCK);
	public static final RegistryObject<Item> REDSTONE_BATTERY = block(NarkotiModBlocks.REDSTONE_BATTERY);
	public static final RegistryObject<Item> CABLE_BLOCK = block(NarkotiModBlocks.CABLE_BLOCK);
	public static final RegistryObject<Item> IRON_CABLE_BLOCK = block(NarkotiModBlocks.IRON_CABLE_BLOCK);
	public static final RegistryObject<Item> SOLAR_PANEL_1 = block(NarkotiModBlocks.SOLAR_PANEL_1);
	public static final RegistryObject<Item> SOLAR_PANEL_2 = block(NarkotiModBlocks.SOLAR_PANEL_2);
	public static final RegistryObject<Item> SOLAR_PANEL_3 = block(NarkotiModBlocks.SOLAR_PANEL_3);
	public static final RegistryObject<Item> SOLAR_PANEL_4 = block(NarkotiModBlocks.SOLAR_PANEL_4);
	public static final RegistryObject<Item> SOLAR_PANEL_5 = block(NarkotiModBlocks.SOLAR_PANEL_5);
	public static final RegistryObject<Item> NIGHT_VISION_HELMET_HELMET = REGISTRY.register("night_vision_helmet_helmet", () -> new NightVisionHelmetItem.Helmet());
	public static final RegistryObject<Item> SMELTED_IRON_INGOT = REGISTRY.register("smelted_iron_ingot", () -> new SmeltedIronIngotItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new TitanIngotItem());
	public static final RegistryObject<Item> TIN_ORE = block(NarkotiModBlocks.TIN_ORE);
	public static final RegistryObject<Item> TITAN_ORE = block(NarkotiModBlocks.TITAN_ORE);
	public static final RegistryObject<Item> SULFUR_DUST = REGISTRY.register("sulfur_dust", () -> new SulfurDustItem());
	public static final RegistryObject<Item> SULFUR_ORE = block(NarkotiModBlocks.SULFUR_ORE);
	public static final RegistryObject<Item> RAW_TITAN_ORE = REGISTRY.register("raw_titan_ore", () -> new RawTitanOreItem());
	public static final RegistryObject<Item> RAW_TIN_ORE = REGISTRY.register("raw_tin_ore", () -> new RawTinOreItem());
	public static final RegistryObject<Item> ELECTRIC_GAS_FURNACE = block(NarkotiModBlocks.ELECTRIC_GAS_FURNACE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
