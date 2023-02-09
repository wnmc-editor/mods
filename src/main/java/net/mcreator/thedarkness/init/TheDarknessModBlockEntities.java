
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thedarkness.block.entity.DarkFiberstage4BlockEntity;
import net.mcreator.thedarkness.block.entity.DarkFiberstage3BlockEntity;
import net.mcreator.thedarkness.block.entity.DarkFiberstage2BlockEntity;
import net.mcreator.thedarkness.block.entity.DarkFiberstage1BlockEntity;
import net.mcreator.thedarkness.block.entity.DarkFiberstage0BlockEntity;
import net.mcreator.thedarkness.block.entity.DarkFarmlandBlockEntity;
import net.mcreator.thedarkness.TheDarknessMod;

public class TheDarknessModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			TheDarknessMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DARK_FIBERSTAGE_0 = register("dark_fiberstage_0", TheDarknessModBlocks.DARK_FIBERSTAGE_0,
			DarkFiberstage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_FIBERSTAGE_1 = register("dark_fiberstage_1", TheDarknessModBlocks.DARK_FIBERSTAGE_1,
			DarkFiberstage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_FIBERSTAGE_2 = register("dark_fiberstage_2", TheDarknessModBlocks.DARK_FIBERSTAGE_2,
			DarkFiberstage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_FIBERSTAGE_3 = register("dark_fiberstage_3", TheDarknessModBlocks.DARK_FIBERSTAGE_3,
			DarkFiberstage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_FIBERSTAGE_4 = register("dark_fiberstage_4", TheDarknessModBlocks.DARK_FIBERSTAGE_4,
			DarkFiberstage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_FARMLAND = register("dark_farmland", TheDarknessModBlocks.DARK_FARMLAND,
			DarkFarmlandBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
