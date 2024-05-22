
package net.mcreator.narkoti.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.narkoti.init.NarkotiModFluids;

public class HItem extends BucketItem {
	public HItem() {
		super(NarkotiModFluids.H, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
