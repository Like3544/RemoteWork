package net.mcreator.narkoti.procedures;

import net.minecraft.world.item.ItemStack;

public class AmmoInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u041F\u0430\u0442\u0440\u043E\u043D\u044B: " + Math.round(itemstack.getOrCreateTag().getDouble("ammo"));
	}
}
