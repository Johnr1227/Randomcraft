/*package com.oyoclass.KidoyoMod;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SkeletonReinforcements {
	@SubscribeEvent
	public void spawnReinforcements(LivingDeathEvent event) {
		System.out.println("jdwu: " + event.entity.getClass().getName());
		if (!(event.entity instanceof EntitySkeleton)) {
			System.out.println("That's not a skeleton!");
			return;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Spawning creeper number " + i);
			EntitySkeleton skeleton = new EntitySkeleton(event.entity.worldObj);
			skeleton.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
			if (!event.entity.worldObj.isRemote) {
				event.entity.worldObj.spawnEntityInWorld(skeleton);
			}
		}

		System.out.println("Leaving the LivingDeath event handler for " + event);
	}

}*/
