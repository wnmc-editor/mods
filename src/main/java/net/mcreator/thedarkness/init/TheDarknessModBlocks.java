
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thedarkness.block.TheDarknessPortalBlock;
import net.mcreator.thedarkness.block.DarkGrassBlock;
import net.mcreator.thedarkness.block.DarkFiberstage4Block;
import net.mcreator.thedarkness.block.DarkFiberstage3Block;
import net.mcreator.thedarkness.block.DarkFiberstage2Block;
import net.mcreator.thedarkness.block.DarkFiberstage1Block;
import net.mcreator.thedarkness.block.DarkFiberstage0Block;
import net.mcreator.thedarkness.block.DarkFarmlandWetBlock;
import net.mcreator.thedarkness.block.DarkFarmlandBlock;
import net.mcreator.thedarkness.block.DarkDirtBlock;
import net.mcreator.thedarkness.TheDarknessMod;

public class TheDarknessModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheDarknessMod.MODID);
	public static final RegistryObject<Block> DARK_DIRT = REGISTRY.register("dark_dirt", () -> new DarkDirtBlock());
	public static final RegistryObject<Block> DARK_FIBERSTAGE_0 = REGISTRY.register("dark_fiberstage_0", () -> new DarkFiberstage0Block());
	public static final RegistryObject<Block> DARK_FIBERSTAGE_1 = REGISTRY.register("dark_fiberstage_1", () -> new DarkFiberstage1Block());
	public static final RegistryObject<Block> DARK_FIBERSTAGE_2 = REGISTRY.register("dark_fiberstage_2", () -> new DarkFiberstage2Block());
	public static final RegistryObject<Block> DARK_FIBERSTAGE_3 = REGISTRY.register("dark_fiberstage_3", () -> new DarkFiberstage3Block());
	public static final RegistryObject<Block> DARK_FIBERSTAGE_4 = REGISTRY.register("dark_fiberstage_4", () -> new DarkFiberstage4Block());
	public static final RegistryObject<Block> DARK_FARMLAND = REGISTRY.register("dark_farmland", () -> new DarkFarmlandBlock());
	public static final RegistryObject<Block> DARK_FARMLAND_WET = REGISTRY.register("dark_farmland_wet", () -> new DarkFarmlandWetBlock());
	public static final RegistryObject<Block> DARK_GRASS = REGISTRY.register("dark_grass", () -> new DarkGrassBlock());
	public static final RegistryObject<Block> THE_DARKNESS_PORTAL = REGISTRY.register("the_darkness_portal", () -> new TheDarknessPortalBlock());
}
