package net.mcreator.narkoti.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CableForgeEnergySidesProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		boolean east = false;
		boolean south = false;
		boolean north = false;
		boolean west = false;
		boolean up = false;
		boolean down = false;
		double sides = 0;
		double sendAmount = 0;
		double energy = 0;
		sides = 0;
		south = CableForgeEnergySouthProcedure.execute(world, x, y, z);
		north = CableForgeEnergyNorthProcedure.execute(world, x, y, z);
		east = CableForgeEnergyEastProcedure.execute(world, x, y, z);
		west = CableForgeEnergyWestProcedure.execute(world, x, y, z);
		up = CableForgeEnergyUpProcedure.execute(world, x, y, z);
		down = CableForgeEnergyDownProcedure.execute(world, x, y, z);
		if (south) {
			sides = sides + 1;
		}
		if (north) {
			sides = sides + 1;
		}
		if (east) {
			sides = sides + 1;
		}
		if (west) {
			sides = sides + 1;
		}
		if (up) {
			sides = sides + 1;
		}
		if (down) {
			sides = sides + 1;
		}
		return sides;
	}
}
