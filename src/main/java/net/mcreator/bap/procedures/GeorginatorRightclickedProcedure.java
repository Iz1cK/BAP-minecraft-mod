package net.mcreator.bap.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.bap.BapMod;

public class GeorginatorRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		if ((itemstack).getDamageValue() >= (itemstack).getMaxDamage() - 1) {
			BapMod.LOGGER.info("cant eat anymore: " + (itemstack).getDamageValue());
		} else {
			BapMod.LOGGER.info("eating");
		}
	}
}
