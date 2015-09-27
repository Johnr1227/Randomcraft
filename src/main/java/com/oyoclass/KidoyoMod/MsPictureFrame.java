package com.oyoclass.KidoyoMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MsPictureFrame extends Block {

	protected MsPictureFrame(Material p_i45394_1_) {
		super(p_i45394_1_);
		// s.setCreativeTab(CreativeTabs.tabDecorations);
		this.setCreativeTab(CoolMod.Random_stuff);
		this.setStepSound(soundTypeAnvil);
		this.setLightLevel(1.0F);
		this.setLightOpacity(0);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
