package com.oyoclass.KidoyoMod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class CheeseWitherRenderer extends RenderLiving {

	private final static ResourceLocation mobTextures = new ResourceLocation(CoolMod.MODID + ":textures/entity/cheeseWither.png");
	
	public CheeseWitherRenderer(ModelBase modelBase, float someFloat) {
		super(modelBase, someFloat);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return mobTextures;
	}

}
