package net.mcreator.narkoti.procedures;

import net.minecraft.world.item.ItemStack;

public class ChargeInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u0417\u0430\u0440\u044F\u0434: " + Math.round(itemstack.getOrCreateTag().getDouble("ammo"));
	}
}
