package com.oyoclass.KidoyoMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_of_chez extends Block {

	public Block_of_chez(Material ice) {
		super(ice);
		this.setCreativeTab(CoolMod.Random_stuff);
		this.setStepSound(soundTypeCloth);
		this.setHardness(1999999999);
	}

}
