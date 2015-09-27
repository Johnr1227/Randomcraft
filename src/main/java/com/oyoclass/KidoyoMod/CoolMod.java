package com.oyoclass.KidoyoMod;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "cm", name = "Cool Mod", version = "1.0")
public class CoolMod {
	@SidedProxy(clientSide = "com.oyoclass.KidoyoMod.GrenadeClient", serverSide = "com.oyoclass.KidoyoMod.GrenadeCommon")
	public static GrenadeCommon proxy;
	public static final String MODID = "cm";
	public static Block block;
	public static Item itemCheeseBow;
	public static Block msPic;
	public static Item itemToyPizza;
	public static Item itemPizza;
	public static Block Name_it;
	public static Item cheese_sword;
	public static ToolMaterial cheese;
	public static ToolMaterial REDSTONE;
	public static Item itemCheeese;
	public static Block MsPictureFrame;
	public static Block The_shirt_of_DOOM;
	public static Block Cheese_ore;
	public static Item itemCheese_stick;
	public static Block Block_of_chez;
	public static Item grenade;
	public static Item Thors_hammer;
	public static Item REDSTONE_SWORD;
	public static Item Alex;
	public static Item PiratesBooty;
	public static Block CHEESE_TNT;
	public static Block Cheese_obsidian;
	public static Item FlintCheese;
	public static Block CheeseGrass;

	public static Item BOOM_BOOM;
	public static Item chez_pic;
	public static Item chez_spade;
	public static Item chez_axe;
	public static Item chez_HOE;
	public static Item Golden_thing;
	public static Potion customPotion;
	public static CreativeTabs Random_stuff_;
	public static ToolMaterial FoolsGold;
	public static Item barf;
	public static CreativeTabs Random_stuff = new CreativeTabs("RandomStuff") {
		

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return itemCheeese;

			// @EventHandler/*

		}
	};

	public ItemStack redDye = new ItemStack(Items.dye, 1, 2);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		grenade = new ItemGrenade();
		// ItemSword
		// item block init and registering
		// config handling
		// addEnum(ToolMaterial.class, name, harvestLevel, maxUses, efficiency,
		// damage, enchantability);
		cheese = new EnumHelper().addToolMaterial("CHEESE", 999999999, 999999999,
				100000000000000000000000000000000000000.0F, 999999999, 999999999);

		new PiratesBooty(15, 1.0F, true);

		REDSTONE = new EnumHelper().addToolMaterial("REDSTONE", 100, 10000, 10000000000000.0F, 15, 100000);

		final ItemArmor.ArmorMaterial chezArmorMaterial = EnumHelper.addArmorMaterial("chez", 999999999, new int[] {
				50, 1000, 1000, 200 }, 999999999);

		FoolsGold = new EnumHelper().addToolMaterial("FOOLGOLD", 50, 50, 50.0F, 25, 1000);

		Golden_thing = new GoldenThing(FoolsGold).setUnlocalizedName("axe o' gold").setTextureName("cm:Gold-Axe-icon");
		GameRegistry.registerItem(Golden_thing, Golden_thing.getUnlocalizedName().substring(5));
		Thors_hammer = new Thors_hammer(FoolsGold).setUnlocalizedName("mjolnir");
		Thors_hammer.setTextureName("cm:mjölnir");
		GameRegistry.registerItem(Thors_hammer, Thors_hammer.getUnlocalizedName().substring(5));

		chez_HOE = new chez_HOE(cheese).setUnlocalizedName("chez hoe").setTextureName("cm:Imported piskel (4)");
		GameRegistry.registerItem(chez_HOE, chez_HOE.getUnlocalizedName().substring(5));

		itemPizza = new Pizza("Pizza", 8, 1.0F, true);
		GameRegistry.registerItem(itemPizza, itemPizza.getUnlocalizedName().substring(5));

		block = new OyoBlock(Material.anvil);
		block.setBlockName("KidOyoBlock").setBlockTextureName("cm:kb");
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
		Cheese_obsidian = new Cheese_obsidian(Material.anvil);
		Cheese_obsidian.setBlockName("CIO").setBlockTextureName("cm:ObsidianCheese");
		GameRegistry.registerBlock(Cheese_obsidian, Cheese_obsidian.getUnlocalizedName().substring(5));

		Block_of_chez = new Block_of_chez(Material.ice);
		block.setBlockName("chez blok").setBlockTextureName("cm:chez blok");
		GameRegistry.registerBlock(Block_of_chez, Block_of_chez.getUnlocalizedName().substring(5));

		// public void init1(FMLInitializationEvent event)
		// {
		// GameRegistry.registerItem(fe, grenade.getUnlocalizedName());
		// }{

		itemCheese_stick = new itemCheeese_stick().setUnlocalizedName("Cheeese_stick").setTextureName("cm:weird chez");
		GameRegistry.registerItem(itemCheese_stick, itemCheese_stick.getUnlocalizedName().substring(5));

		FlintCheese = new FlintCheese().setUnlocalizedName("itemFlintCheese").setTextureName("cm:Cheese_And_Steel");
		GameRegistry.registerItem(FlintCheese, FlintCheese.getUnlocalizedName().substring(5));

		REDSTONE_SWORD = new REDSTONE_SWORD(REDSTONE).setUnlocalizedName("REDSTONESWORD").setTextureName(
				"cm:redstoneSword");
		GameRegistry.registerItem(REDSTONE_SWORD, REDSTONE_SWORD.getUnlocalizedName().substring(5));

		chez_axe = new itemCheeese_axe(cheese).setUnlocalizedName("Cheeese axe").setTextureName(
				"cm:Imported piskel (3)");
		GameRegistry.registerItem(chez_axe, chez_axe.getUnlocalizedName().substring(5));

		chez_spade = new itemChez_Spade(cheese).setUnlocalizedName("Cheese shovel").setTextureName(
				"cm:Imported piskel (2)");
		GameRegistry.registerItem(chez_spade, chez_spade.getUnlocalizedName().substring(5));

		chez_pic = new chez_pic(cheese).setUnlocalizedName("Chez pickaxe").setTextureName("cm:chez pic");
		GameRegistry.registerItem(chez_pic, chez_pic.getUnlocalizedName().substring(5));

		itemCheeese = new itemCheeese().setUnlocalizedName("Cheeese").setTextureName("cm:cheeezey-chez");
		GameRegistry.registerItem(itemCheeese, itemCheeese.getUnlocalizedName().substring(5));

		// initialize your table, you will see red lines here!
		itemToyPizza = new ToyPizza().setUnlocalizedName("ToyPizza");
		itemToyPizza.setTextureName("cm:toypizza");
		GameRegistry.registerItem(itemToyPizza, itemToyPizza.getUnlocalizedName().substring(5));
		
		
		itemCheeseBow = new ItemCheeseBow().setUnlocalizedName("CheeseBow");
		itemCheeseBow.setTextureName("cm:New Piskel (6)");
		GameRegistry.registerItem(itemCheeseBow, itemCheeseBow.getUnlocalizedName().substring(5));

		// BOOM_BOOM = new BOOM_BOOM().setUnlocalizedName("RIGHT CLICK ME");
		// BOOM_BOOM.setTextureName("cm:toypizza");
		//GameRegistry.registerItem(itemToyPizza, itemToyPizza.getUnlocalizedName().substring(5));
		//barf = new ItemLightningSTICK().setUnlocalizedName("barf");
		 //barf.setTextureName("cm:pong");
		
		barf = new ItemLightningSTICK().setUnlocalizedName("bfwkuysef");
		barf.setTextureName("cm:pong");
		GameRegistry.registerItem(barf, barf.getUnlocalizedName().substring(5));
		 GameRegistry.registerItem(itemToyPizza, itemToyPizza.getUnlocalizedName().substring(5));
		// initialize your table, you will see red lines here!
		Name_it = new Name_it(Material.anvil);
		Name_it.setBlockName("NameitNow!!!!").setBlockTextureName("cm:New Piskel");
		GameRegistry.registerBlock(Name_it, Name_it.getUnlocalizedName().substring(5));
		cheese_sword = new CheeseSword(cheese).setUnlocalizedName("Chheeesssseeeee_SHWORD");
		cheese_sword.setTextureName("cm:cheese_sword");
		GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
		cheese = EnumHelper.addToolMaterial("CHHHEEEZZZEE", 5, 3000, 1000000000000000.0F, 999999999, 999999999);

		msPic = new MsPictureFrame(Material.ice);
		msPic.setBlockName("MsPictureFrame").setBlockTextureName("cm:msPictureFrame");
		GameRegistry.registerBlock(msPic, msPic.getUnlocalizedName().substring(5));
		
		CheeseGrass = new CheeseGrass();
		CheeseGrass.setBlockName("CheeseGrass").setBlockTextureName("cm:CheeseGrass");
		GameRegistry.registerBlock(CheeseGrass, CheeseGrass.getUnlocalizedName().substring(5));

		The_shirt_of_DOOM = new The_shirt_of_DOOM(Material.ice);
		The_shirt_of_DOOM.setBlockName("T-Shirt_dat_u_cant_ware").setBlockTextureName("cm:clothes-t-shirt-icon");
		GameRegistry.registerBlock(The_shirt_of_DOOM, The_shirt_of_DOOM.getUnlocalizedName().substring(5));

		Cheese_ore = new cheese_ore(Material.ice);
		Cheese_ore.setBlockName("Cheese ore").setBlockTextureName("cm:png.png");
		GameRegistry.registerBlock(Cheese_ore, Cheese_ore.getUnlocalizedName().substring(5));

		CHEESE_TNT = new CHEESE_TNT(Material.ice);
		CHEESE_TNT.setBlockName("CheeseTNT").setBlockTextureName("cm:CheeseTNT");
		GameRegistry.registerBlock(CHEESE_TNT, CHEESE_TNT.getUnlocalizedName().substring(5));

		/*
		 * Potion[] potionTypes = null;
		 * 
		 * for (Field f : Potion.class.getDeclaredFields()) {
		 * f.setAccessible(true); try { if (f.getName().equals("potionTypes") ||
		 * f.getName().equals("field_76425_a")) { Field modfield =
		 * Field.class.getDeclaredField("modifiers");
		 * modfield.setAccessible(true); modfield.setInt(f, f.getModifiers() &
		 * ~Modifier.FINAL);
		 * 
		 * potionTypes = (Potion[])f.get(null); final Potion[] newPotionTypes =
		 * new Potion[256]; System.arraycopy(potionTypes, 0, newPotionTypes, 0,
		 * potionTypes.length); f.set(null, newPotionTypes); } } catch
		 * (Exception e) {
		 * System.err.println("Severe error, please report this to the mod author:"
		 * ); System.err.println(e); } }
		 */

		CheeseWither.register();

	}

	private void setHardness() {
		// TODO Auto-generated method stub

	}

	@EventHandler
	public void init(FMLServerStartingEvent event) {
		event.registerServerCommand(new FlamingPigs());
	}
	
	public void init1(FMLServerStartingEvent event1) {
		event1.registerServerCommand(new Nuke());
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
		MinecraftForge.EVENT_BUS.register(new SkeletonWar());
		//MinecraftForge.EVENT_BUS.register(new VillagerThing());
		//MinecraftForge.EVENT_BUS.register(new CreeperReinforcement());
		//MinecraftForge.EVENT_BUS.register(new SkeletonReinforcements());
		MinecraftForge.EVENT_BUS.register(CheeseSword.getSoundListener());
//		MinecraftForge.EVENT_BUS.register(new FlamingPigs());
		
		
		
		// Proxy, titleEntity, GUI, and Packet Registering
		GameRegistry.addRecipe(new ItemStack(cheese_sword), new Object[] { " C ", " C ", " S ", 'S',
				CoolMod.itemCheese_stick, 'C', CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(msPic), new Object[] { "PPP", "PPP", "PPP", 'P', Items.painting });

		GameRegistry
				.addRecipe(new ItemStack(The_shirt_of_DOOM), new Object[] { "G G", "GGG", "GGG", 'G', Blocks.wool });

		GameRegistry.addRecipe(new ItemStack(Golden_thing), new Object[] { "GGG", "SSS", "SSS", 'G', Items.gold_ingot,
				'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(itemCheeese), new Object[] { "BBB", "BBB", "BBB", 'B', Blocks.bedrock });

		GameRegistry.addRecipe(new ItemStack(itemCheese_stick), new Object[] { " C ", " C ", "   ", 'C',
				CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(Block_of_chez), new Object[] { "BBB", "BBB", "BBB", 'B',
				CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(grenade), new Object[] { " T ", " B ", "   ", 'B', CoolMod.itemCheeese,
				'T', Blocks.tnt });

		GameRegistry.addSmelting(new ItemStack(Items.baked_potato, 1, 1), new ItemStack(Items.bed, 1, 1), 0.1F);

		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock),
				new Object[] { "BBB", "BBB", "BBB", 'B', Blocks.obsidian });

		GameRegistry.addRecipe(new ItemStack(CoolMod.PiratesBooty), new Object[] { "BCB", "BCB", "BBB", 'B',
				Blocks.wool, 'C', CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_spade), new Object[] { " C ", " S ", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_spade), new Object[] { "CC ", " S ", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_HOE), new Object[] { " CC", " S ", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_axe), new Object[] { "CC ", "CS ", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_axe), new Object[] { " CC", " SC", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_pic), new Object[] { "CCC", " S ", " S ", 'C',
				CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });
		GameRegistry.addRecipe(new ItemStack(CoolMod.REDSTONE_SWORD), new Object[] { " C ", " C ", " S ", 'S',
				Items.stick, 'C', Items.redstone });
		GameRegistry.addRecipe(new ItemStack(CoolMod.Cheese_obsidian), new Object[] { "CCC", "CSC", "CCC", 'S',
				CoolMod.itemCheeese, 'C', Blocks.obsidian });
		
		ItemStack CheeseStack = new ItemStack(CoolMod.itemCheeese);
		ItemStack cobbleStack = new ItemStack(Items.iron_ingot);
		//GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.FlintCheese,1), new ItemStack(CoolMod.itemCheeese));
		//GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.FlintCheese,1));
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,64, new ItemStack(Blocks.sand)));
		// ItemFlintAndSteel
		GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.FlintCheese), new Object[] {Items.iron_ingot, new ItemStack(CoolMod.itemCheeese, 1, 4)});
		GameRegistry.addSmelting(CoolMod.Cheese_ore, new ItemStack(CoolMod.itemCheeese), 5000.0F);
		
		GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());

		// Register the given class so Forge can use it
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 4, this, 80, 3, true);

		proxy.registerRenderThings();
		proxy.registerSounds();

	}
}
// Lenny:

// ( ͠° ͟ʖ ͡°)
// ( ͠° ͟ʖ ͡°)
// ( ͠° ͟ʖ ͡°)
// ( ͡° ͜ʖ ͡°)
// ( ͡° ͜ʖ ͡°)
// ( ͡° ͜ʖ ͡°)
// ( ͡o ͜ʖ ͡o)
// ( ͡o ͜ʖ ͡o)
// ( ͡o ͜ʖ ͡o)

// ╚═( ͡° ͜ʖ ͡°)═╝
// ╚═(███)═╝
// ╚═(███)═╝
// .╚═(███)═╝
// ..╚═(███)═╝
// …╚═(███)═╝
// …╚═(███)═╝
// ..╚═(███)═╝
// .╚═(███)═╝
// ╚═(███)═╝
// .╚═(███)═╝
// ..╚═(███)═╝
// …╚═(███)═╝
// …╚═(███)═╝
// …..╚(███)╝
// ……╚(██)╝
// ………(█)
