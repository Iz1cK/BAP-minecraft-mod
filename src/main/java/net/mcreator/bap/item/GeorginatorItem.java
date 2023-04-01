
package net.mcreator.bap.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.bap.procedures.GeorginatorRightclickedProcedure;
import net.mcreator.bap.procedures.GeorginatorPlayerFinishesUsingItemProcedure;
import net.mcreator.bap.procedures.GeorginatorInInventoryTickProcedure;
import net.mcreator.bap.init.BapModTabs;

public class GeorginatorItem extends Item {
	public GeorginatorItem() {
		super(new Item.Properties().tab(BapModTabs.TAB_BAP).durability(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 5;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GeorginatorRightclickedProcedure.execute(itemstack);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GeorginatorPlayerFinishesUsingItemProcedure.execute(itemstack);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GeorginatorInInventoryTickProcedure.execute(entity, itemstack);
	}
}
