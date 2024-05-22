package net.mcreator.narkoti.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.init.NarkotiModBlocks;

public class WeedBushPriObnovlieniiTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == NarkotiModBlocks.PURPLE_LAMP.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == NarkotiModBlocks.PURPLE_LAMP.get())
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == NarkotiModBlocks.BIG_FLOWER_POT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PODZOL
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == NarkotiModBlocks.WEED_BUSH.get())) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip12 ? blockstate.getValue(_getip12) : -1) < 3 && Math.round(Math.random() * 2000) == 2000) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip14 ? blockstate.getValue(_getip14) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (Math.round(Math.random() * 2000) == 2000 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) == 3
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == NarkotiModBlocks.WEED_BUSH.get())) {
				world.setBlock(BlockPos.containing(x, y + 1, z), NarkotiModBlocks.WEED_BUSH.get().defaultBlockState(), 3);
			}
		} else if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == NarkotiModBlocks.BIG_FLOWER_POT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PODZOL)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_BUSH.defaultBlockState(), 3);
		}
	}
}
