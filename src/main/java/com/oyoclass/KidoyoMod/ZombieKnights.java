package com.oyoclass.KidoyoMod;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ZombieKnights {
	
	@SubscribeEvent
	public void giveArmor(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityZombie)){
			return;
		}
		EntityZombie zombie = (EntityZombie) event.entity;
		zombie.setCurrentItemOrArmor(4, new ItemStack(Blocks.dropper));
		zombie.setCurrentItemOrArmor(0, new ItemStack(Items.stick));
	}

}
//EntityZombie