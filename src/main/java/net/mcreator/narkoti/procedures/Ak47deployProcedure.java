package net.mcreator.narkoti.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.item.Ak47Item;

public class Ak47deployProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 0, 1) == 0) {
			if (itemstack.getItem() instanceof Ak47Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.AK47.deploy1");
		} else {
			if (itemstack.getItem() instanceof Ak47Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.AK47.deploy2");
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47deploy")), SoundSource.NEUTRAL, 2, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47deploy")), SoundSource.NEUTRAL, 2, 1, false);
			}
		}
	}
}
