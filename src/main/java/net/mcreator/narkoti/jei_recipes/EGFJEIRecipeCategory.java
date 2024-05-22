
package net.mcreator.narkoti.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.narkoti.init.NarkotiModJeiPlugin;
import net.mcreator.narkoti.init.NarkotiModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class EGFJEIRecipeCategory implements IRecipeCategory<EGFJEIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("narkoti", "egfjei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("narkoti", "textures/screens/egf_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public EGFJEIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 71);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(NarkotiModBlocks.ELECTRIC_GAS_FURNACE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<EGFJEIRecipe> getRecipeType() {
		return NarkotiModJeiPlugin.EGFJEI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Электрическая газовая печь");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, EGFJEIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 27).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 79, 0).addItemStack(recipe.getResultItem(null));
	}
}
