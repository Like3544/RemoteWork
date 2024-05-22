package net.mcreator.narkoti.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.narkoti.init.NarkotiModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnergyArmorCraftedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == NarkotiModItems.NIGHT_VISION_HELMET_HELMET.get()) {
			itemstack.getOrCreateTag().putDouble("charge", 0);
			itemstack.getOrCreateTag().putDouble("max_charge", 8000);
		}
	}
}
