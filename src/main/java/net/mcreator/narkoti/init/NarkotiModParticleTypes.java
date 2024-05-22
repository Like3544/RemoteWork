
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.narkoti.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.narkoti.NarkotiMod;

public class NarkotiModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NarkotiMod.MODID);
	public static final RegistryObject<SimpleParticleType> PURPLE = REGISTRY.register("purple", () -> new SimpleParticleType(true));
}
