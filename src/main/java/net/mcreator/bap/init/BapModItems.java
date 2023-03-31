
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bap.item.NormalCapacitorItem;
import net.mcreator.bap.item.MoriCapacitorItem;
import net.mcreator.bap.item.GeorgiumIngotItem;
import net.mcreator.bap.item.GeorginatorItem;
import net.mcreator.bap.item.GeorgeCapacitorItem;
import net.mcreator.bap.BapMod;

public class BapModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BapMod.MODID);
	public static final RegistryObject<Item> GEORGIUM_ORE = block(BapModBlocks.GEORGIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GEORGIUM_INGOT = REGISTRY.register("georgium_ingot", () -> new GeorgiumIngotItem());
	public static final RegistryObject<Item> GEORGIUM_JOBRATOR = block(BapModBlocks.GEORGIUM_JOBRATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NORMAL_CAPACITOR = REGISTRY.register("normal_capacitor", () -> new NormalCapacitorItem());
	public static final RegistryObject<Item> MORI_CAPACITOR = REGISTRY.register("mori_capacitor", () -> new MoriCapacitorItem());
	public static final RegistryObject<Item> GEORGE_CAPACITOR = REGISTRY.register("george_capacitor", () -> new GeorgeCapacitorItem());
	public static final RegistryObject<Item> GEORGINATOR = REGISTRY.register("georginator", () -> new GeorginatorItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
