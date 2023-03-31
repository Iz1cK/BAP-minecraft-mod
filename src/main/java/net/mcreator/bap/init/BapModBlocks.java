
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bap.block.GeorgiumOreBlock;
import net.mcreator.bap.block.GeorgiumJobratorBlock;
import net.mcreator.bap.BapMod;

public class BapModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BapMod.MODID);
	public static final RegistryObject<Block> GEORGIUM_ORE = REGISTRY.register("georgium_ore", () -> new GeorgiumOreBlock());
	public static final RegistryObject<Block> GEORGIUM_JOBRATOR = REGISTRY.register("georgium_jobrator", () -> new GeorgiumJobratorBlock());
}
