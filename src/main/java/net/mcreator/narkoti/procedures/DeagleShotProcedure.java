package net.mcreator.narkoti.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.narkoti.item.DeagleItem;
import net.mcreator.narkoti.init.NarkotiModItems;
import net.mcreator.narkoti.init.NarkotiModEntities;
import net.mcreator.narkoti.entity.BulletEntity;

public class DeagleShotProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("ammo") < 1 && GetPAnumberProcedure.execute(world, entity, itemstack) >= 7) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(NarkotiModItems.PISTOL_AMMON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 7, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 65);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-reload")), SoundSource.NEUTRAL, (float) 0.25, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-reload")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
				}
			}
			if (itemstack.getItem() instanceof DeagleItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.DesertEagleN.reload");
			itemstack.getOrCreateTag().putDouble("ammo", 7);
		} else if (itemstack.getOrCreateTag().getDouble("ammo") >= 1) {
			if (itemstack.getItem() instanceof DeagleItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.DesertEagleN.shot");
			itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-shot")), SoundSource.NEUTRAL, (float) 0.25, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-shot")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 6);
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new BulletEntity(NarkotiModEntities.BULLET.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, (float) 0.1, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -7, 7)));
				_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 1, 4)));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 6);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.25, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
				}
			}
		}
	}
}
