package net.mcreator.narkoti.block.entity;

import net.minecraftforge.items.wrapper.SidedInvWrapper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.init.NarkotiModFluids;
import net.mcreator.narkoti.init.NarkotiModBlockEntities;

import javax.annotation.Nullable;

import java.util.stream.IntStream;

public class GasBalonBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
	private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);
	private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

	public GasBalonBlockEntity(BlockPos position, BlockState state) {
		super(NarkotiModBlockEntities.GAS_BALON.get(), position, state);
	}

	@Override
	public void load(CompoundTag compound) {
		super.load(compound);
		if (!this.tryLoadLootTable(compound))
			this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(compound, this.stacks);
		if (compound.get("fluidTank") instanceof CompoundTag compoundTag)
			fluidTank.readFromNBT(compoundTag);
	}

	@Override
	public void saveAdditional(CompoundTag compound) {
		super.saveAdditional(compound);
		if (!this.trySaveLootTable(compound)) {
			ContainerHelper.saveAllItems(compound, this.stacks);
		}
		compound.put("fluidTank", fluidTank.writeToNBT(new CompoundTag()));
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}

	@Override
	public int getContainerSize() {
		return stacks.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.stacks)
			if (!itemstack.isEmpty())
				return false;
		return true;
	}

	@Override
	public Component getDefaultName() {
		return Component.literal("gas_balon");
	}

	@Override
	public int getMaxStackSize() {
		return 1;
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return ChestMenu.threeRows(id, inventory);
	}

	@Override
	public Component getDisplayName() {
		return Component.literal("Газовый балон");
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.stacks;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> stacks) {
		this.stacks = stacks;
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		if (index == 0)
			return false;
		return true;
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return IntStream.range(0, this.getContainerSize()).toArray();
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
		return this.canPlaceItem(index, stack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
		if (index == 0)
			return false;
		return true;
	}

	private final FluidTank fluidTank = new FluidTank(8000, fs -> {
		if (fs.getFluid() == NarkotiModFluids.H.get())
			return true;
		if (fs.getFluid() == NarkotiModFluids.C.get())
			return true;
		if (fs.getFluid() == NarkotiModFluids.CL.get())
			return true;
		if (fs.getFluid() == NarkotiModFluids.CH_4F.get())
			return true;
		if (fs.getFluid() == NarkotiModFluids.C_3_H_8F.get())
			return true;
		return false;
	}) {
		@Override
		protected void onContentsChanged() {
			super.onContentsChanged();
			setChanged();
			level.sendBlockUpdated(worldPosition, level.getBlockState(worldPosition), level.getBlockState(worldPosition), 2);
		}
	};

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
		if (!this.remove && facing != null && capability == ForgeCapabilities.ITEM_HANDLER)
			return handlers[facing.ordinal()].cast();
		if (!this.remove && capability == ForgeCapabilities.FLUID_HANDLER)
			return LazyOptional.of(() -> fluidTank).cast();
		return super.getCapability(capability, facing);
	}

	@Override
	public void setRemoved() {
		super.setRemoved();
		for (LazyOptional<? extends IItemHandler> handler : handlers)
			handler.invalidate();
	}
}
