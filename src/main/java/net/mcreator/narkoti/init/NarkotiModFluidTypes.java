
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.narkoti.fluid.types.HFluidType;
import net.mcreator.narkoti.fluid.types.ClFluidType;
import net.mcreator.narkoti.fluid.types.CH4fFluidType;
import net.mcreator.narkoti.fluid.types.CFluidType;
import net.mcreator.narkoti.fluid.types.C3H8fFluidType;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NarkotiMod.MODID);
	public static final RegistryObject<FluidType> H_TYPE = REGISTRY.register("h", () -> new HFluidType());
	public static final RegistryObject<FluidType> C_TYPE = REGISTRY.register("c", () -> new CFluidType());
	public static final RegistryObject<FluidType> CL_TYPE = REGISTRY.register("cl", () -> new ClFluidType());
	public static final RegistryObject<FluidType> CH_4F_TYPE = REGISTRY.register("ch_4f", () -> new CH4fFluidType());
	public static final RegistryObject<FluidType> C_3_H_8F_TYPE = REGISTRY.register("c_3_h_8f", () -> new C3H8fFluidType());
}
