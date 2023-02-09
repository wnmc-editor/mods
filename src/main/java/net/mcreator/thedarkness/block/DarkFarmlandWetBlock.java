
package net.mcreator.thedarkness.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thedarkness.init.TheDarknessModBlocks;

import java.util.List;
import java.util.Collections;

public class DarkFarmlandWetBlock extends Block {
	public DarkFarmlandWetBlock() {
		super(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.rooted_dirt.break")),
						() -> new SoundEvent(new ResourceLocation("block.nylium.step")),
						() -> new SoundEvent(new ResourceLocation("block.soul_sand.place")),
						() -> new SoundEvent(new ResourceLocation("block.sculk.hit")),
						() -> new SoundEvent(new ResourceLocation("block.sculk.fall"))))
				.strength(1f, 10f).lightLevel(s -> 2).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TheDarknessModBlocks.DARK_FARMLAND_WET.get());
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheDarknessModBlocks.DARK_DIRT.get()));
	}
}
