
package net.mcreator.narkoti.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class NarkotiModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("narkoti:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(NarkotiModBlocks.GAS_FURNACE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.narkoti.gas_fur_info"));
		registration.addIngredientInfo(List.of(new ItemStack(NarkotiModBlocks.ELECTRIC_GAS_FURNACE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.narkoti.egfinfo"));
	}
}
