package com.oyoclass.KidoyoMod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class CheeseWood extends Block {
	private IIcon topIcon;
	private IIcon bottomIcon;

	protected CheeseWood(Material p_i45394_1_) {
//		super(p_i45394_1_);
		super(Material.wood);
		this.setHardness(15);
		this.setCreativeTab(CoolMod.Random_stuff);
		this.setStepSound(soundTypeWood);

	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		//return meta == 0 ? this.bottomIcon : (meta == 1 ? this.topIcon : this.blockIcon);
		return this.topIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		//this.topIcon = p_149651_1_.registerIcon(this.getTextureName() + "_top");
		this.topIcon = p_149651_1_.registerIcon(this.getTextureName());
		//this.bottomIcon = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
	}

//    public static final String[] field_150096_a = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};
//    @SideOnly(Side.CLIENT)
//    private IIcon[] field_150095_b;
//    private static final String __OBFID = "CL_00000335";
//
//    public CheeseWood(Material m)
//    {
//        super(Material.wood);
//        this.setCreativeTab(CreativeTabs.tabBlock);
//    }
//
//    /**
//     * Gets the block's texture. Args: side, meta
//     */
//    @SideOnly(Side.CLIENT)
//    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
//    {
//        if (p_149691_2_ < 0 || p_149691_2_ >= this.field_150095_b.length)
//        {
//            p_149691_2_ = 0;
//        }
//
//        return this.field_150095_b[p_149691_2_];
//    }
//
//    /**
//     * Determines the damage on the item the block drops. Used in cloth and wood.
//     */
//    public int damageDropped(int p_149692_1_)
//    {
//        return p_149692_1_;
//    }
//
//    /**
//     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
//     */
//    @SideOnly(Side.CLIENT)
//    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
//    {
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 4));
//        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
//    }
//
//    @SideOnly(Side.CLIENT)
//    public void registerBlockIcons(IIconRegister p_149651_1_)
//    {
//        this.field_150095_b = new IIcon[field_150096_a.length];
//
//        for (int i = 0; i < this.field_150095_b.length; ++i)
//        {
//            this.field_150095_b[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150096_a[i]);
//        }
//    }
}
