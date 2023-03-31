package net.mcreator.bap.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.bap.init.BapModItems;

public class GeorginatorItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BapModItems.GEORGINATOR.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == BapModItems.GEORGINATOR.get()) && entity.isShiftKeyDown()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BapModItems.GEORGIUM_INGOT.get())) : false) && (itemstack).getDamageValue() != 0) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BapModItems.GEORGIUM_INGOT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			(itemstack).setDamageValue((int) ((itemstack).getDamageValue() - 1));
		}
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 15) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(20);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
