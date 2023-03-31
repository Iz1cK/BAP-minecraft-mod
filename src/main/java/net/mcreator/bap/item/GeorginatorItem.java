
package net.mcreator.bap.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.bap.procedures.GeorginatorItemInInventoryTickProcedure;
import net.mcreator.bap.init.BapModTabs;

public class GeorginatorItem extends Item {
	public GeorginatorItem() {
		super(new Item.Properties().tab(BapModTabs.TAB_BAP).durability(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GeorginatorItemInInventoryTickProcedure.execute(entity, itemstack);
	}
}
