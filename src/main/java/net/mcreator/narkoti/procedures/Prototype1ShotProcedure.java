package net.mcreator.narkoti.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.item.Prototype1Item;
import net.mcreator.narkoti.init.NarkotiModItems;

public class Prototype1ShotProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("ammo") < 1 && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(NarkotiModItems.BATTERY_F.get())) : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(NarkotiModItems.BATTERY_F.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(NarkotiModItems.BATTERY_E.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 70);
			if (itemstack.getItem() instanceof Prototype1Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.Prototype1.reload");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:prototype-reload")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:prototype-reload")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			itemstack.getOrCreateTag().putDouble("ammo", 8);
		} else if (itemstack.getOrCreateTag().getDouble("ammo") >= 1) {
			if (itemstack.getItem() instanceof Prototype1Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.Prototype1.shot");
			itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:prototype-shot")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:prototype-shot")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 25);
			LaserBeamProcedure.execute(world, entity);
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.5, 100);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.5, 100, false);
				}
			}
		}
	}
}
