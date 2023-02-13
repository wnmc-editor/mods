
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.thedarkness.entity.DarkSpriteEntityProjectile;
import net.mcreator.thedarkness.entity.DarkSpriteEntity;
import net.mcreator.thedarkness.TheDarknessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheDarknessModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheDarknessMod.MODID);
	public static final RegistryObject<EntityType<DarkSpriteEntity>> DARK_SPRITE = register("dark_sprite",
			EntityType.Builder.<DarkSpriteEntity>of(DarkSpriteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(DarkSpriteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkSpriteEntityProjectile>> DARK_SPRITE_PROJECTILE = register("projectile_dark_sprite",
			EntityType.Builder.<DarkSpriteEntityProjectile>of(DarkSpriteEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(DarkSpriteEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DarkSpriteEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DARK_SPRITE.get(), DarkSpriteEntity.createAttributes().build());
	}
}
