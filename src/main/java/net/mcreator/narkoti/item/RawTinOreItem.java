
package net.mcreator.narkoti.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawTinOreItem extends Item {
	public RawTinOreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
