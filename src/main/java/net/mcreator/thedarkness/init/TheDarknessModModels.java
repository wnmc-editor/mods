
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thedarkness.client.model.Modeldark_sprite_entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheDarknessModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldark_sprite_entity.LAYER_LOCATION, Modeldark_sprite_entity::createBodyLayer);
	}
}
