
package net.mcreator.narkoti.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SmeltedIronIngotItem extends Item {
	public SmeltedIronIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
