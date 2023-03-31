
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.bap.world.features.ores.GeorgiumOreFeature;
import net.mcreator.bap.BapMod;

@Mod.EventBusSubscriber
public class BapModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BapMod.MODID);
	public static final RegistryObject<Feature<?>> GEORGIUM_ORE = REGISTRY.register("georgium_ore", GeorgiumOreFeature::feature);
}
