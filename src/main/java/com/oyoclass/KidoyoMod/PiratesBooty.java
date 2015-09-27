package com.oyoclass.KidoyoMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class PiratesBooty extends ItemFood {

	public PiratesBooty(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(CoolMod.Random_stuff);
		
		this.setUnlocalizedName("CAPN HUK").setTextureName("cm:PiratesBooty");
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}
