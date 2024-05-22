package net.mcreator.narkoti.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.narkoti.network.NarkotiModVariables;

public class AltModeONProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(NarkotiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NarkotiModVariables.PlayerVariables())).AltMode) {
			{
				boolean _setval = false;
				entity.getCapability(NarkotiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AltMode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A77AltMode: \u00A7cOFF"), false);
		} else {
			{
				boolean _setval = true;
				entity.getCapability(NarkotiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AltMode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A77AltMode: \u00A7aON"), false);
		}
	}
}
