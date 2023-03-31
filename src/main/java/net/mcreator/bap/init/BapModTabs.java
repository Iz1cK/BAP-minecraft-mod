
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BapModTabs {
	public static CreativeModeTab TAB_BAP;

	public static void load() {
		TAB_BAP = new CreativeModeTab("tabbap") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BapModBlocks.GEORGIUM_ORE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
