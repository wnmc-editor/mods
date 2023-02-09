
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thedarkness.item.DarkFiberSeedsItem;
import net.mcreator.thedarkness.item.DarkFiberItem;
import net.mcreator.thedarkness.TheDarknessMod;

public class TheDarknessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheDarknessMod.MODID);
	public static final RegistryObject<Item> DARK_DIRT = block(TheDarknessModBlocks.DARK_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARK_FIBER_SEEDS = REGISTRY.register("dark_fiber_seeds", () -> new DarkFiberSeedsItem());
	public static final RegistryObject<Item> DARK_FIBERSTAGE_0 = block(TheDarknessModBlocks.DARK_FIBERSTAGE_0, null);
	public static final RegistryObject<Item> DARK_FIBERSTAGE_1 = block(TheDarknessModBlocks.DARK_FIBERSTAGE_1, null);
	public static final RegistryObject<Item> DARK_FIBERSTAGE_2 = block(TheDarknessModBlocks.DARK_FIBERSTAGE_2, null);
	public static final RegistryObject<Item> DARK_FIBERSTAGE_3 = block(TheDarknessModBlocks.DARK_FIBERSTAGE_3, null);
	public static final RegistryObject<Item> DARK_FIBERSTAGE_4 = block(TheDarknessModBlocks.DARK_FIBERSTAGE_4, null);
	public static final RegistryObject<Item> DARK_FIBER = REGISTRY.register("dark_fiber", () -> new DarkFiberItem());
	public static final RegistryObject<Item> DARK_FARMLAND = block(TheDarknessModBlocks.DARK_FARMLAND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARK_FARMLAND_WET = block(TheDarknessModBlocks.DARK_FARMLAND_WET, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
