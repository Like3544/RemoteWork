package net.mcreator.narkoti.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.narkoti.init.NarkotiModItems;

import java.util.concurrent.atomic.AtomicReference;

public class GetPAnumberProcedure {
	public static double execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return 0;
		double ammo = 0;
		double diamonds = 0;
		ammo = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (NarkotiModItems.PISTOL_AMMON.get() == itemstackiterator.getItem()) {
						ammo = ammo + itemstackiterator.getCount();
					}
				}
			}
		}
		return ammo + itemstack.getCount();
	}
}
