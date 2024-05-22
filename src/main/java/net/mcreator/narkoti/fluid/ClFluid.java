
package net.mcreator.narkoti.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.narkoti.init.NarkotiModItems;
import net.mcreator.narkoti.init.NarkotiModFluids;
import net.mcreator.narkoti.init.NarkotiModFluidTypes;
import net.mcreator.narkoti.init.NarkotiModBlocks;

public abstract class ClFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> NarkotiModFluidTypes.CL_TYPE.get(), () -> NarkotiModFluids.CL.get(), () -> NarkotiModFluids.FLOWING_CL.get()).explosionResistance(0f).tickRate(1)
			.slopeFindDistance(1).bucket(() -> NarkotiModItems.CL_BUCKET.get()).block(() -> (LiquidBlock) NarkotiModBlocks.CL.get());

	private ClFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ClFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ClFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
