package com.oyoclass.KidoyoMod;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ExplodingAnvils {

	@SubscribeEvent
	public void explode(LivingHurtEvent event) {
		if (event.source != DamageSource.anvil) {
			return;
		}

		Entity entity = event.entity;
		event.entity.worldObj.createExplosion(entity, entity.posX, entity.posY, entity.posZ, 4, true);
		System.out.println("::: " + event.source.getSourceOfDamage());
		
	}
}
