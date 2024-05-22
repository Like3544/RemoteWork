
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NarkotiMod.MODID);
	public static final RegistryObject<SoundEvent> DEAGLE_SHOT = REGISTRY.register("deagle-shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "deagle-shot")));
	public static final RegistryObject<SoundEvent> DEAGLE_RELOAD = REGISTRY.register("deagle-reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "deagle-reload")));
	public static final RegistryObject<SoundEvent> DEAGLE_NOAMMO = REGISTRY.register("deagle-noammo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "deagle-noammo")));
	public static final RegistryObject<SoundEvent> AK47RELOAD = REGISTRY.register("ak47reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "ak47reload")));
	public static final RegistryObject<SoundEvent> AK47SHOT = REGISTRY.register("ak47shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "ak47shot")));
	public static final RegistryObject<SoundEvent> AK47DEPLOY = REGISTRY.register("ak47deploy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "ak47deploy")));
	public static final RegistryObject<SoundEvent> PROTOTYPE_RELOAD = REGISTRY.register("prototype-reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "prototype-reload")));
	public static final RegistryObject<SoundEvent> PROTOTYPE_SHOT = REGISTRY.register("prototype-shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("narkoti", "prototype-shot")));
}
