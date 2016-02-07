package com.oyoclass.KidoyoMod;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
public class Cheese_obsidian extends BlockStone {

	    protected Cheese_obsidian(Material Cheese) {
		super();
		// TODO Auto-generated constructor stub
	}
		private static final String __OBFID = "CL_00000279";

	    {
	    	//this.slipperiness = 4;
	    	this.slipperiness = 0.98F;
			// TODO Auto-generated constructor stub
	    	this.setStepSound(soundTypeStone);
		}

		/**
	     * Returns the quantity of items to drop on block destruction.
	     */
	    public int quantityDropped(Random p_149745_1_)
	    {
	        return 1; 
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(Blocks.obsidian);
	    }
	    {
	    this.dropItem(CoolMod.itemCheeese, 1);
	    }
	    {
	    this.setCreativeTab(CoolMod.Random_stuff);
	    this.setHardness(500);
	    


	    
	    

}


		private void dropItem(Item itemCheeese, int i) {
			// TODO Auto-generated method stub
			//BlockIce
			
		}}

