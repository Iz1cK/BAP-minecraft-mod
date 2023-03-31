
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.bap.world.inventory.GeorgiumJobratorNewGuiMenu;
import net.mcreator.bap.BapMod;

public class BapModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BapMod.MODID);
	public static final RegistryObject<MenuType<GeorgiumJobratorNewGuiMenu>> GEORGIUM_JOBRATOR_NEW_GUI = REGISTRY.register("georgium_jobrator_new_gui", () -> IForgeMenuType.create(GeorgiumJobratorNewGuiMenu::new));
}
