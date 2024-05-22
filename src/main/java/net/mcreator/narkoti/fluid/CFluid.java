
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

public abstract class CFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> NarkotiModFluidTypes.C_TYPE.get(), () -> NarkotiModFluids.C.get(), () -> NarkotiModFluids.FLOWING_C.get()).explosionResistance(0f).tickRate(1)
			.slopeFindDistance(1).bucket(() -> NarkotiModItems.C_BUCKET.get()).block(() -> (LiquidBlock) NarkotiModBlocks.C.get());

	private CFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CFluid {
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
