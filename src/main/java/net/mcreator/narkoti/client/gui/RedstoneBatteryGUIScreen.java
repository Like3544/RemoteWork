package net.mcreator.narkoti.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.narkoti.world.inventory.RedstoneBatteryGUIMenu;
import net.mcreator.narkoti.procedures.EnergyLevelProcedure;
import net.mcreator.narkoti.procedures.ChargeVProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RedstoneBatteryGUIScreen extends AbstractContainerScreen<RedstoneBatteryGUIMenu> {
	private final static HashMap<String, Object> guistate = RedstoneBatteryGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RedstoneBatteryGUIScreen(RedstoneBatteryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("narkoti:textures/screens/redstone_battery_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("narkoti:textures/screens/redstone_arrow_up_off.png"), this.leftPos + 43, this.topPos + 44, 0, 0, 16, 16, 16, 16);

		if (ChargeVProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("narkoti:textures/screens/redstone_arrow_up.png"), this.leftPos + 43, this.topPos + 44, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.narkoti.redstone_battery_gui.label_prostoi_akkamuliator"), 5, 5, -12829636, false);
		guiGraphics.drawString(this.font,

				EnergyLevelProcedure.execute(world, x, y, z), 63, 47, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
