
package net.mcreator.narkoti.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.narkoti.jei_recipes.GasFurRecipeCategory;
import net.mcreator.narkoti.jei_recipes.GasFurRecipe;
import net.mcreator.narkoti.jei_recipes.EGFJEIRecipeCategory;
import net.mcreator.narkoti.jei_recipes.EGFJEIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class NarkotiModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<GasFurRecipe> GasFur_Type = new mezz.jei.api.recipe.RecipeType<>(GasFurRecipeCategory.UID, GasFurRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<EGFJEIRecipe> EGFJEI_Type = new mezz.jei.api.recipe.RecipeType<>(EGFJEIRecipeCategory.UID, EGFJEIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("narkoti:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new GasFurRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new EGFJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<GasFurRecipe> GasFurRecipes = recipeManager.getAllRecipesFor(GasFurRecipe.Type.INSTANCE);
		registration.addRecipes(GasFur_Type, GasFurRecipes);
		List<EGFJEIRecipe> EGFJEIRecipes = recipeManager.getAllRecipesFor(EGFJEIRecipe.Type.INSTANCE);
		registration.addRecipes(EGFJEI_Type, EGFJEIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(NarkotiModBlocks.GAS_FURNACE.get().asItem()), GasFur_Type);
		registration.addRecipeCatalyst(new ItemStack(NarkotiModBlocks.ELECTRIC_GAS_FURNACE.get().asItem()), EGFJEI_Type);
	}
}
