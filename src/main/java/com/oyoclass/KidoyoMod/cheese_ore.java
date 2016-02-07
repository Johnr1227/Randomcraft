package com.oyoclass.KidoyoMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class cheese_ore extends Block {

	protected cheese_ore(Material p_i45394_1_) {
		super(p_i45394_1_);

		// this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(175);
		this.setCreativeTab(CoolMod.Random_stuff);
		this.setStepSound(soundTypeStone);
		
		

	}
}