package com.oyoclass.KidoyoMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrenade extends Item {
	public ItemGrenade() {
		this.setUnlocalizedName("grenade"); // Sets the name of this item, Has
											// to be unique!
		this.setCreativeTab(CoolMod.Random_stuff); // This Item will be in the
														// Combat Creative Tab!
		this.setTextureName(CoolMod.MODID + ":" + "grenade1"); // The texture
																// for this
																// item is
																// the
																// Grenade!
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		// This if statement is here to check that the Server is working
		if (!par2World.isRemote) {
			/*
			 * This method in World spawn in an entity, You can use with
			 * anything that extends the Entity class, in this case it's the
			 * EntityGrenade class
			 */
			par2World.spawnEntityInWorld(new EntityGrenade(par2World,
					par3EntityPlayer));
			// Decrease an item from the stack because you used it!
			--par1ItemStack.stackSize;
		}
		return par1ItemStack;
	}

	/**
	 * Render Pass sensitive version of hasEffect()
	 */
	//public boolean hasEffect(ItemStack par1ItemStack, int pass) {
		// This means it will look "enchanted" in the inventory
	//	return true;
	}
