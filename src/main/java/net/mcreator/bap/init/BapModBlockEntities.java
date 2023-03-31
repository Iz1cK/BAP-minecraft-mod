
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bap.block.entity.GeorgiumJobratorBlockEntity;
import net.mcreator.bap.BapMod;

public class BapModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BapMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GEORGIUM_JOBRATOR = register("georgium_jobrator", BapModBlocks.GEORGIUM_JOBRATOR, GeorgiumJobratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
