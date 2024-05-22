package net.mcreator.narkoti.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.narkoti.init.NarkotiModItems;

public class ArmorTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack i = ItemStack.EMPTY;
		itemstack.setDamageValue((int) Math.round(itemstack.getOrCreateTag().getDouble("charge") / 2200));
		if (entity.getPersistentData().getBoolean("NV")) {
			if (itemstack.getOrCreateTag().getDouble("charge") > 0 && itemstack.getItem() == NarkotiModItems.NIGHT_VISION_HELMET_HELMET.get()) {
				itemstack.getOrCreateTag().putDouble("charge", (itemstack.getOrCreateTag().getDouble("charge") - 10));
			} else if (itemstack.getOrCreateTag().getDouble("charge") < 1 || !(itemstack.getItem() == NarkotiModItems.NIGHT_VISION_HELMET_HELMET.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.NIGHT_VISION);
				entity.getPersistentData().putBoolean("NV", false);
			}
		}
	}
}
