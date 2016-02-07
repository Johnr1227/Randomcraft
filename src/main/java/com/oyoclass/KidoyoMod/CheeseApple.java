/*package com.oyoclass.KidoyoMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class CheeseApple extends ItemFood {

    public CheeseApple(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
    }
        private PotionEffect[] effects;
        
        public CheeseApple(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
            super(healAmount, saturationModifier, wolvesFavorite);
            this.setUnlocalizedName(unlocalizedName);
            this.setTextureName("cm:CA");
            this.setCreativeTab(CoolMod.Random_stuff);
            this.effects = effects;
            
            @Override
            protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
                super.onFoodEaten(stack, world, player);
                    
                for (int i = 0; i < effects.length; i ++) {
                    if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
                        player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
                }
            }
    }
}*/