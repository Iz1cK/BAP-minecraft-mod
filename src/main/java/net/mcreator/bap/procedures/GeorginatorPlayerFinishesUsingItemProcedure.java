package net.mcreator.bap.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

import net.mcreator.bap.BapMod;

public class GeorginatorPlayerFinishesUsingItemProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		BapMod.LOGGER.info("done eating");
	}
}
