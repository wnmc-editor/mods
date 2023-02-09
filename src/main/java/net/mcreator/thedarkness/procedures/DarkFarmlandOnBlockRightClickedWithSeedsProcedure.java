package net.mcreator.thedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thedarkness.init.TheDarknessModItems;

public class DarkFarmlandOnBlockRightClickedWithSeedsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack crop = ItemStack.EMPTY;
		crop = new ItemStack(TheDarknessModItems.DARK_FIBER_SEEDS.get());
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == crop.getItem()) {
			DarkFiberSeedsRightClickedOnBlockProcedure.execute(world, x, y, z, entity);
		}
	}
}
