package com.oyoclass.KidoyoMod;

import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class Pizza extends ItemFood {

	PotionEffect[] effects;

	public Pizza(int unlocalizedName, float healAmount, boolean b) {
		super(unlocalizedName, healAmount, b);
		this.setFull3D();
		
		// TODO Auto-generated constructor stub
		this.setTextureName("cm:cheese blok");
	}
    
	public Pizza(String unlocalizedName, int healAmount,
			float saturationModifier, boolean wolvesFavorite,
			PotionEffect... regeneration) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
//		this.setTextureName(ExampleMod.MODID + ":" + unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.effects = regeneration;
	}

}
