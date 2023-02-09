package net.mcreator.thedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thedarkness.init.TheDarknessModBlocks;

public class DarkDirtOnBlockRightClickedWithHoeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem) {
			world.setBlock(new BlockPos(x, y, z), TheDarknessModBlocks.DARK_FARMLAND.get().defaultBlockState(), 3);
		}
	}
}
