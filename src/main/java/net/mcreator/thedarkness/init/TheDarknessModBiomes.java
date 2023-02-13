
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.thedarkness.world.biome.DarkPlainsBiome;
import net.mcreator.thedarkness.TheDarknessMod;

public class TheDarknessModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TheDarknessMod.MODID);
	public static final RegistryObject<Biome> DARK_PLAINS = REGISTRY.register("dark_plains", DarkPlainsBiome::createBiome);
}
