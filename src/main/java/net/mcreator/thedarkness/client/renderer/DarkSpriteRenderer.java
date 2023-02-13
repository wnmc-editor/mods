
package net.mcreator.thedarkness.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.thedarkness.entity.DarkSpriteEntity;
import net.mcreator.thedarkness.client.model.Modeldark_sprite_entity;

public class DarkSpriteRenderer extends MobRenderer<DarkSpriteEntity, Modeldark_sprite_entity<DarkSpriteEntity>> {
	public DarkSpriteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldark_sprite_entity(context.bakeLayer(Modeldark_sprite_entity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DarkSpriteEntity, Modeldark_sprite_entity<DarkSpriteEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("the_darkness:textures/entities/dark_sprite_skin.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DarkSpriteEntity entity) {
		return new ResourceLocation("the_darkness:textures/entities/dark_sprite_skin.png");
	}
}
