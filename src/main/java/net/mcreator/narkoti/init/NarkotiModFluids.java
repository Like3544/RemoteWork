
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import org.checkerframework.checker.units.qual.C;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.narkoti.fluid.HFluid;
import net.mcreator.narkoti.fluid.ClFluid;
import net.mcreator.narkoti.fluid.CH4fFluid;
import net.mcreator.narkoti.fluid.CFluid;
import net.mcreator.narkoti.fluid.C3H8fFluid;
import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, NarkotiMod.MODID);
	public static final RegistryObject<FlowingFluid> H = REGISTRY.register("h", () -> new HFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_H = REGISTRY.register("flowing_h", () -> new HFluid.Flowing());
	public static final RegistryObject<FlowingFluid> C = REGISTRY.register("c", () -> new CFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_C = REGISTRY.register("flowing_c", () -> new CFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CL = REGISTRY.register("cl", () -> new ClFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CL = REGISTRY.register("flowing_cl", () -> new ClFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CH_4F = REGISTRY.register("ch_4f", () -> new CH4fFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CH_4F = REGISTRY.register("flowing_ch_4f", () -> new CH4fFluid.Flowing());
	public static final RegistryObject<FlowingFluid> C_3_H_8F = REGISTRY.register("c_3_h_8f", () -> new C3H8fFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_C_3_H_8F = REGISTRY.register("flowing_c_3_h_8f", () -> new C3H8fFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(H.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_H.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(C.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_C.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CH_4F.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CH_4F.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(C_3_H_8F.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_C_3_H_8F.get(), RenderType.translucent());
		}
	}
}
