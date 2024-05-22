package net.mcreator.narkoti.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.narkoti.jei_recipes.GasFurRecipe;
import net.mcreator.narkoti.jei_recipes.EGFJEIRecipe;
import net.mcreator.narkoti.NarkotiMod;

@Mod.EventBusSubscriber(modid = NarkotiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NarkotiModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "narkoti");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("gas_fur", () -> GasFurRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("egfjei", () -> EGFJEIRecipe.Serializer.INSTANCE);
		});
	}
}
