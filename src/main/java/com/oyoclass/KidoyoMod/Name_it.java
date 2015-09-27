package com.oyoclass.KidoyoMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class Name_it extends Block {

	protected Name_it(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		//this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setCreativeTab(CoolMod.Random_stuff);
		this.setLightOpacity(0);
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
