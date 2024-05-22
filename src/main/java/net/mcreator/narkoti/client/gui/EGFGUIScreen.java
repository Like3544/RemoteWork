package net.mcreator.narkoti.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.narkoti.world.inventory.EGFGUIMenu;
import net.mcreator.narkoti.procedures.TestWorkStateProcedure;
import net.mcreator.narkoti.procedures.ProgressPercentageProcedure;
import net.mcreator.narkoti.procedures.EnergyValueProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EGFGUIScreen extends AbstractContainerScreen<EGFGUIMenu> {
	private final static HashMap<String, Object> guistate = EGFGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EGFGUIScreen(EGFGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("narkoti:textures/screens/egfgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 80 && mouseX < leftPos + 92 && mouseY > topPos + 53 && mouseY < topPos + 70)
			guiGraphics.renderTooltip(font, Component.literal(EnergyValueProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("narkoti:textures/screens/tryba_up.png"), this.leftPos + 79, this.topPos + 17, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("narkoti:textures/screens/electro_light_off.png"), this.leftPos + 78, this.topPos + 54, 0, 0, 16, 16, 16, 16);

		if (TestWorkStateProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("narkoti:textures/screens/electro_light_on.png"), this.leftPos + 78, this.topPos + 54, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.narkoti.egfgui.label_eliektrichieskaia_ghazovaia_piech"), 17, 3, -12829636, false);
		guiGraphics.drawString(this.font,

				ProgressPercentageProcedure.execute(world, x, y, z), 96, 19, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
