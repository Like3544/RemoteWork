
package net.mcreator.narkoti.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SulfurDustItem extends Item {
	public SulfurDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
