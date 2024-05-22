package net.mcreator.narkoti.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.init.NarkotiModItems;
import net.mcreator.narkoti.init.NarkotiModBlocks;

public class WeedBushSeedsPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PODZOL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NarkotiModBlocks.BIG_FLOWER_POT.get())) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(NarkotiModItems.WEED_BUSH_SEEDS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), NarkotiModBlocks.WEED_BUSH.get().defaultBlockState(), 3);
		}
	}
}
