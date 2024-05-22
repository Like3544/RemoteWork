
package net.mcreator.narkoti.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.narkoti.procedures.ChargeBProcedure;

import java.util.List;

public class BatteryEItem extends Item {
	public BatteryEItem() {
		super(new Item.Properties().stacksTo(8).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		list.add(Component.literal(ChargeBProcedure.execute(itemstack)));
	}
}
