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

import net.mcreator.narkoti.item.Ak47Item;
import net.mcreator.narkoti.init.NarkotiModItems;
import net.mcreator.narkoti.init.NarkotiModEntities;
import net.mcreator.narkoti.entity.BulletEntity;
import net.mcreator.narkoti.NarkotiMod;

public class Ak47shotProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("ammo") < 1 && GetRAnumberProcedure.execute(world, entity, itemstack) >= 30) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(NarkotiModItems.RIFLE_AMMO.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 30, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
			if (Mth.nextDouble(RandomSource.create(), 0, 1) == 0) {
				if (itemstack.getItem() instanceof Ak47Item)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.AK47.reload1");
			} else {
				if (itemstack.getItem() instanceof Ak47Item)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.AK47.reload2");
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47reload")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47reload")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			NarkotiMod.queueServerWork(30, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47deploy")), SoundSource.NEUTRAL, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47deploy")), SoundSource.NEUTRAL, 2, 1, false);
					}
				}
			});
			itemstack.getOrCreateTag().putDouble("ammo", 30);
		} else if (itemstack.getOrCreateTag().getDouble("ammo") >= 1) {
			if (itemstack.getItem() instanceof Ak47Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.AK47.shot");
			itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47shot")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:ak47shot")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 3);
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
					}.getArrow(projectileLevel, (float) 0.05, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -5, 5)));
				_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 1, 5)));
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
				_player.getCooldowns().addCooldown(itemstack.getItem(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.1, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("narkoti:deagle-noammo")), SoundSource.NEUTRAL, (float) 0.1, 2, false);
				}
			}
		}
	}
}
