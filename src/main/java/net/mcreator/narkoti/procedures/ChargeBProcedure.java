package net.mcreator.narkoti.procedures;

import net.minecraft.world.item.ItemStack;

public class ChargeBProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A77\u0417\u0430\u0440\u044F\u0434: " + Math.round(itemstack.getOrCreateTag().getDouble("charge")) + "/" + Math.round(itemstack.getOrCreateTag().getDouble("max_charge")) + "FE";
	}
}
