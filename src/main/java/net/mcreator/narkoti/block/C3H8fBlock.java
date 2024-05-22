
package net.mcreator.narkoti.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.init.NarkotiModFluids;

public class C3H8fBlock extends LiquidBlock {
	public C3H8fBlock() {
		super(() -> NarkotiModFluids.C_3_H_8F.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
