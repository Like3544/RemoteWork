package net.mcreator.narkoti.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.init.NarkotiModBlocks;

public class CH4PriObnovlieniiTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double x1 = 0;
		double xm1 = 0;
		double z1 = 0;
		double zm1 = 0;
		double r = 0;
		double yc = 0;
		x1 = x + 1;
		xm1 = x - 1;
		z1 = z + 1;
		zm1 = z - 1;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NarkotiModBlocks.CH_4.get()) {
			yc = y + 1;
		} else {
			yc = y - 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, yc, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, yc, z), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		r = Math.round(Math.random() * 3);
		if (r == 0 && (world.getBlockState(BlockPos.containing(x1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x1, y, z), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (r == 1 && (world.getBlockState(BlockPos.containing(xm1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(xm1, y, z), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (r == 2 && (world.getBlockState(BlockPos.containing(x, y, z1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z1), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (r == 3 && (world.getBlockState(BlockPos.containing(x, y, zm1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, zm1), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
