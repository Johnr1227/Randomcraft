package com.oyoclass.KidoyoMod;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

//public class CreeperReinforcement {
//	@SubscribeEvent
	//public void spawnReinforcements(LivingDeathEvent event) {
		//System.out.println("jdwu: " + event.entity.getClass().getName());
		//if (!(event.entity instanceof EntityCreeper)) {
			//System.out.println("That's not a creeper!");
			//return;
		//}

		//for (int i = 0; i < 5; i++) {
			//System.out.println("Spawning creeper number " + i);
			//EntityCreeper creeper = new EntityCreeper(event.entity.worldObj);
			//creeper.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
			//if (!event.entity.worldObj.isRemote){
				//event.entity.worldObj.spawnEntityInWorld(creeper);
			//}
		//}
		
		//System.out.println("Leaving the LivingDeath event handler for " + event);
	//}

//}
