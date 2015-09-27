package com.oyoclass.KidoyoMod;

import net.minecraft.client.renderer.entity.RenderSnowball;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class GrenadeClient extends GrenadeCommon {
	@Override
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class,
				new RenderSnowball(CoolMod.grenade));
	}

	@Override
	public void registerSounds() {
	}
}