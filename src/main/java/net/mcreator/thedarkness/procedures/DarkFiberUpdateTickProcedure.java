package net.mcreator.thedarkness.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.thedarkness.init.TheDarknessModBlocks;

public class DarkFiberUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage4 = Blocks.AIR.defaultBlockState();
		stage0 = TheDarknessModBlocks.DARK_FIBERSTAGE_0.get().defaultBlockState();
		stage1 = TheDarknessModBlocks.DARK_FIBERSTAGE_1.get().defaultBlockState();
		stage2 = TheDarknessModBlocks.DARK_FIBERSTAGE_2.get().defaultBlockState();
		stage3 = TheDarknessModBlocks.DARK_FIBERSTAGE_3.get().defaultBlockState();
		stage4 = TheDarknessModBlocks.DARK_FIBERSTAGE_4.get().defaultBlockState();
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage0.getBlock() && stage1.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage1, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage1.getBlock()
					&& stage2.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage2, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage2.getBlock()
					&& stage3.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage3, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage3.getBlock()
					&& stage4.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage4, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "GrowthTime")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
