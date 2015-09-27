package com.oyoclass.KidoyoMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OyoBlock extends Block {
	protected OyoBlock(Material material) {
		super(material);
		//this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(CoolMod.Random_stuff);
	}

}
