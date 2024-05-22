package net.mcreator.narkoti.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class SolarPanelsOnTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.getLevelData().isRaining() && world instanceof Level _lvl1 && _lvl1.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z));
	}
}
