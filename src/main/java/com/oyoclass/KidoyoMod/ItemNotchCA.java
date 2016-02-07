package com.oyoclass.KidoyoMod;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemNotchCA extends ItemFood {

	
	public ItemNotchCA(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
	}
	
		public boolean hasEffect(ItemStack par1ItemStack, int pass) {
			// This means it will look "special" in the inventory
			return true;
			
	}

}
