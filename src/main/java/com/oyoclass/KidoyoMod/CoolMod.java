package com.oyoclass.KidoyoMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = "cm", name = "Cool Mod", version = "1.1")
public class CoolMod {
	@SidedProxy(clientSide = "com.oyoclass.KidoyoMod.GrenadeClient", serverSide = "com.oyoclass.KidoyoMod.GrenadeCommon")
	public static GrenadeCommon proxy;
	public static final String MODID = "cm";
	public static Block block;

	public static Item itemCheeseBow;
	public static Block CheeseSauceBlock;
	public static ItemBucket CheeseBucket;
	public static Block msPic;
	public static Item itemToyPizza;
	public static Item itemPizza;
	public static Block Name_it;
	public static Item cheese_sword;
	public static ItemFood SC;
	public static ToolMaterial cheese;
	public static ToolMaterial REDSTONE;
	public static Item itemCheeese;
	public static Block MsPictureFrame;
	public static Block The_shirt_of_DOOM;
	public static cheese_ore Cheese_ore;
	public static Item itemCheese_stick;
	public static Block Block_of_chez;
	public static Item grenade;
	public static Item Thors_hammer;
	public static Item REDSTONE_SWORD;
	public static Item Alex;
	public static Block CHEESE_TNT;
	public static Block Cheese_obsidian;
	public static Item FlintCheese;
	public static Block CheeseGrass;
	public static ItemFood CheeseApple;
	public static Block CheeseWood;
	public static Block CheesePlanks;
	public static Block Infuser;
	public static ItemFood ItemNotchCA;

	public static Item cheeseHelmet;
	public static Item cheeseChestplate;
	public static Item cheeseLeggings;
	public static Item cheeseBoots;

	public static Item BOOM_BOOM;
	public static Item chez_pic;
	public static Item chez_spade;
	public static Item chez_axe;
	public static Item chez_HOE;
	public static Item Golden_thing;
	public static Potion customPotion;
	public static ToolMaterial cheese1;
	public static ToolMaterial FoolsGold;
	public static ToolMaterial cheese2;
	public static Item barf;
	public static CreativeTabs Random_stuff = new CreativeTabs("RandomStuff") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return itemCheeese;

			// @EventHandler/*

		}
	};
	public static final ItemArmor.ArmorMaterial cheeseArmorMaterial = EnumHelper.addArmorMaterial("cheeseArmorMaterial",
			999999999, new int[] { 200, 450, 350, 150 }, 999999999);

	// public ItemStack redDye = new ItemStack(Items.dye, 1, 2);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		grenade = new ItemGrenade();
		// ItemSword
		// item block init and registering
		// config handling
		// addEnum(ToolMaterial.class, name, harvestLevel, maxUses, efficiency,
		// damage, enchantability);

		// public static ToolMaterial addToolMaterial(name, harvestLevel,
		// maxUses, efficiency, damage, enchantability)
		// }
		cheese = new EnumHelper().addToolMaterial("CHEESE", 999999999, 999999999,
				100000000000000000000000000000000000000.0F, 999999999, 999999999);

		cheese1 = new EnumHelper().addToolMaterial("SPADE", 999999999, 999999999,
				100000000000000000000000000000000000000.0F, 299, 999999999);

		cheese2 = new EnumHelper().addToolMaterial("AXE", 999999999, 999999999,
				100000000000000000000000000000000000000.0F, 999999, 999999999);

		CheeseApple = new ItemFood(20, 10.0F, false) {
			@Override
			protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer player) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1000000, 10));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1000000, 25));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10000, 3));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1000000, 10));
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1000000, 100000));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 3000, 10));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 1000000, 10));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100000, 25));

				// Health Boost
				// player.addPotionEffect(new
				// PotionEffect(Potion.field_76434_w.id, 100000, 31));
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 100000, 4));

				// Absorbtion
				// player.addPotionEffect(new
				// PotionEffect(Potion.field_76444_x.id, 100000, 27));
				player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 100000, 4));
			}
		};
		CheeseApple.setUnlocalizedName("CA");
		CheeseApple.setTextureName("cm:CA");
		CheeseApple.setCreativeTab(CoolMod.Random_stuff);
		CheeseApple.setAlwaysEdible();

		GameRegistry.registerItem(CheeseApple, CheeseApple.getUnlocalizedName().substring(5));

		cheeseHelmet = new ItemCheeseArmor(cheeseArmorMaterial, 0, 0).setUnlocalizedName("CheeseHelmet")
				.setTextureName("cm:CheeseHead").setCreativeTab(CoolMod.Random_stuff);
		cheeseChestplate = new ItemCheeseArmor(cheeseArmorMaterial, 0, 1).setUnlocalizedName("CheeseChestplate")
				.setTextureName("cm:CheeseShirt").setCreativeTab(CoolMod.Random_stuff);
		cheeseLeggings = new ItemCheeseArmor(cheeseArmorMaterial, 0, 2).setUnlocalizedName("CheeseLeggings")
				.setTextureName("cm:CheesePants").setCreativeTab(CoolMod.Random_stuff);
		cheeseBoots = new ItemCheeseArmor(cheeseArmorMaterial, 0, 3).setUnlocalizedName("CheeseBoots")
				.setTextureName("cm:CheeseBoots").setCreativeTab(CoolMod.Random_stuff);
		// ("This is Cheese Armor!")
		// /
		// \😀
		// |>
		// / \
		GameRegistry.registerItem(cheeseHelmet, cheeseHelmet.getUnlocalizedName());
		GameRegistry.registerItem(cheeseLeggings, cheeseLeggings.getUnlocalizedName());
		GameRegistry.registerItem(cheeseChestplate, cheeseChestplate.getUnlocalizedName());
		GameRegistry.registerItem(cheeseBoots, cheeseBoots.getUnlocalizedName());

		ItemNotchCA = new ItemNotchCA(20, 10.0F, false) {

			@Override
			protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer player) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1000000, 65));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1000000, 30));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10000, 5));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1000000, 15));
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1000000, 100000));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 1000000, 14));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100000, 75));
				// Health Boost
				// player.addPotionEffect(new
				// PotionEffect(Potion.field_76434_w.id, 100000, 31));
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 100000, 9));
				// I am getting MAD
				// Absorption
				// player.addPotionEffect(new
				// PotionEffect(Potion.field_76444_x.id, 100000, 27));
				player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 100000, 14));

			}

		};
		ItemNotchCA.setUnlocalizedName("EnchantedCA");
		ItemNotchCA.setTextureName("cm:CA");
		ItemNotchCA.setCreativeTab(CoolMod.Random_stuff);
		ItemNotchCA.setAlwaysEdible();
		GameRegistry.registerItem(ItemNotchCA, ItemNotchCA.getUnlocalizedName().substring(5));

		SC = new ItemFood(0, 0.0F, false) {
			@Override
			protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer player) {
				player.addPotionEffect(new PotionEffect(Potion.harm.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.wither.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 1000000, 100));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1000000, 100));
			}
		};
		SC.setUnlocalizedName("Suicide");
		SC.setTextureName("cm:Suicide");
		SC.setCreativeTab(CoolMod.Random_stuff);
		SC.setAlwaysEdible();
		GameRegistry.registerItem(SC, SC.getUnlocalizedName().substring(5));

		FoolsGold = new EnumHelper().addToolMaterial("FOOLGOLD", 50, 50, 50.0F, 25, 1000);

		Fluid yourFluid = new Fluid("fluidname").setLuminosity(5).setDensity(1500).setViscosity(6500).setGaseous(true);
		FluidRegistry.registerFluid(yourFluid);

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

		Infuser = new BlockInfuser(true);
		Infuser.setBlockName("dig").setBlockTextureName("cm:infuser");
		GameRegistry.registerBlock(Infuser, Infuser.getUnlocalizedName().substring(5));

		Fluid Fluid = new Fluid("fluidname");
		FluidRegistry.registerFluid(Fluid);
		CheeseSauceBlock = new CheeseSauceBlock(yourFluid, Material.lava).setBlockName("CheeseSauce");
		GameRegistry.registerBlock(CheeseSauceBlock, MODID + "_" + CheeseSauceBlock.getUnlocalizedName().substring(5));
		Fluid.setUnlocalizedName(CheeseSauceBlock.getUnlocalizedName());

		Cheese_obsidian = new Cheese_obsidian(Material.rock);
		Cheese_obsidian.setBlockName("CIO").setBlockTextureName("cm:ObsidianCheese");
		GameRegistry.registerBlock(Cheese_obsidian, Cheese_obsidian.getUnlocalizedName().substring(5));

		Block_of_chez = new Block_of_chez(Material.rock);
		Block_of_chez.setBlockName("chez blok").setBlockTextureName("cm:chez blok");
		GameRegistry.registerBlock(Block_of_chez, Block_of_chez.getUnlocalizedName().substring(5));

		CheeseWood = new CheeseWood(Material.wood);
		CheeseWood.setBlockName("CheeseWood").setBlockTextureName("cm:cheese_wood");
		GameRegistry.registerBlock(CheeseWood, CheeseWood.getUnlocalizedName().substring(5));

		CheesePlanks = new CheesePlanks(Material.wood);
		CheesePlanks.setBlockName("Planks").setBlockTextureName("cm:CheesePlanks");
		GameRegistry.registerBlock(CheesePlanks, CheesePlanks.getUnlocalizedName().substring(5));

		Item CheeseBucket = new CheeseBucket(CheeseSauceBlock);
		CheeseBucket.setUnlocalizedName("CheeseBucket").setContainerItem(Items.bucket)
				.setTextureName("cm:bucket_cheese");
		GameRegistry.registerItem(CheeseBucket, "CheeseBucket");
		FluidContainerRegistry.registerFluidContainer(yourFluid, new ItemStack(CheeseBucket),
				new ItemStack(Items.bucket));
		// public void init1(FMLInitializationEvent event)
		// {
		// GameRegistry.registerItem(fe, grenade.getUnlocalizedName());
		// }{

		itemCheese_stick = new itemCheeese_stick().setUnlocalizedName("Cheeese_stick").setTextureName("cm:weird chez");
		GameRegistry.registerItem(itemCheese_stick, itemCheese_stick.getUnlocalizedName().substring(5));

		FlintCheese = new FlintCheese().setUnlocalizedName("itemFlintCheese").setTextureName("cm:Cheese_And_Steel");
		GameRegistry.registerItem(FlintCheese, FlintCheese.getUnlocalizedName().substring(5));

		chez_axe = new itemCheeese_axe(cheese2).setUnlocalizedName("Cheeese axe")
				.setTextureName("cm:Imported piskel (3)");
		GameRegistry.registerItem(chez_axe, chez_axe.getUnlocalizedName().substring(5));

		chez_spade = new itemChez_Spade(cheese1).setUnlocalizedName("Cheese shovel")
				.setTextureName("cm:Imported piskel (2)");
		GameRegistry.registerItem(chez_spade, chez_spade.getUnlocalizedName().substring(5));

		chez_pic = new chez_pic(cheese2).setUnlocalizedName("chez pickaxe").setTextureName("cm:magic");
		GameRegistry.registerItem(chez_pic, chez_pic.getUnlocalizedName().substring(5));

		itemCheeese = new itemCheeese().setUnlocalizedName("Cheeese").setTextureName("cm:cheeezey-chez");
		GameRegistry.registerItem(itemCheeese, itemCheeese.getUnlocalizedName().substring(5));

		// initialize your table, you will see red lines here!
		// itemToyPizza = new ToyPizza().setUnlocalizedName("ToyPizza");
		// itemToyPizza.setTextureName("cm:toypizza");
		// GameRegistry.registerItem(itemToyPizza,
		// itemToyPizza.getUnlocalizedName().substring(5));

		itemCheeseBow = new ItemCheeseBow().setUnlocalizedName("CheeseBow");
		itemCheeseBow.setTextureName("cm:New Piskel (6)");
		GameRegistry.registerItem(itemCheeseBow, itemCheeseBow.getUnlocalizedName().substring(5));

		GameRegistry.registerWorldGenerator(new CheeseGen(), 0);

		// barf = new ItemLightningSTICK().setUnlocalizedName("bfwkuysef");
		// barf.setTextureName("cm:pong");
		// GameRegistry.registerItem(barf,
		// barf.getUnlocalizedName().substring(5));
		// GameRegistry.registerItem(itemToyPizza,
		// itemToyPizza.getUnlocalizedName().substring(5));
		// initialize your table, you will see red lines here!
		// Name_it = new Name_it(Material.anvil);
		// Name_it.setBlockName("NameitNow!!!!").setBlockTextureName("cm:New
		// Piskel");
		// GameRegistry.registerBlock(Name_it,
		// Name_it.getUnlocalizedName().substring(5));

		cheese_sword = new CheeseSword(cheese).setUnlocalizedName("Chheeesssseeeee_SHWORD");
		cheese_sword.setTextureName("cm:cheese_sword");
		GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));

		cheese = EnumHelper.addToolMaterial("CHHHEEEZZZEE", 5, 3000, 1000000000000000.0F, 999999999, 999999999);

		// msPic = new MsPictureFrame(Material.ice);
		// msPic.setBlockName("MsPictureFrame").setBlockTextureName("cm:msPictureFrame");
		// GameRegistry.registerBlock(msPic,
		// msPic.getUnlocalizedName().substring(5));

		/* This is Not Really Grass it is a netherracky thing */
		CheeseGrass = new CheeseGrass(Material.iron);
		CheeseGrass.setBlockName("CheeseGrass").setBlockTextureName("cm:CheeseGrass");
		GameRegistry.registerBlock(CheeseGrass, CheeseGrass.getUnlocalizedName().substring(5));

		// The_shirt_of_DOOM = new The_shirt_of_DOOM(Material.ice);
		// The_shirt_of_DOOM.setBlockName("T-Shirt_dat_u_cant_ware").setBlockTextureName("cm:clothes-t-shirt-icon");
		// GameRegistry.registerBlock(The_shirt_of_DOOM,
		// The_shirt_of_DOOM.getUnlocalizedName().substring(5));

		Cheese_ore = new cheese_ore(Material.rock);
		Cheese_ore.setBlockName("Cheese ore").setBlockTextureName("cm:png.png");
		GameRegistry.registerBlock(Cheese_ore, Cheese_ore.getUnlocalizedName().substring(5));

		CHEESE_TNT = new CHEESE_TNT(Material.tnt);
		CHEESE_TNT.setBlockName("CheeseTNT").setBlockTextureName("cm:CheeseTNT");
		GameRegistry.registerBlock(CHEESE_TNT, CHEESE_TNT.getUnlocalizedName().substring(5));

		// CheeseApple = new CheeseApple(999999999, 999999999,
		// false).setUnlocalizedName("CA");
		// CheeseApple.setTextureName("cm:pong");
		// GameRegistry.registerItem(CheeseApple,
		// CheeseApple.getUnlocalizedName().substring(5));

		// CheeseApple( CA, 20,
		// 1000000, true,
		// PotionEffect... 1);

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
		 * (Exception e) { System.err.println(
		 * "Severe error, please report this to the mod author:" );
		 * System.err.println(e); } }
		 */

		CheeseWither.register();

	}

	private void setHardness() {

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
		// MinecraftForge.EVENT_BUS.register(new VillagerThing());
		// MinecraftForge.EVENT_BUS.register(new CreeperReinforcement());
		// MinecraftForge.EVENT_BUS.register(new SkeletonReinforcements());
		MinecraftForge.EVENT_BUS.register(CheeseSword.getSoundListener());
		// MinecraftForge.EVENT_BUS.register(new FlamingPigs());

		// Proxy, titleEntity, GUI, and Packet Registering
		GameRegistry.addRecipe(new ItemStack(cheese_sword),
				new Object[] { " C ", " C ", " S ", 'S', CoolMod.itemCheese_stick, 'C', CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(msPic), new Object[] { "PPP", "PPP", "PPP", 'P', Items.painting });

		GameRegistry.addRecipe(new ItemStack(The_shirt_of_DOOM),
				new Object[] { "G G", "GGG", "GGG", 'G', Blocks.wool });

		GameRegistry.addRecipe(new ItemStack(Golden_thing),
				new Object[] { "GGG", "SSS", "SSS", 'G', Items.gold_ingot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(itemCheeese), new Object[] { "BBB", "BBB", "BBB", 'B', Blocks.bedrock });
		// GameRegestry
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { " C ", " C ", "   ", 'C', CoolMod.CheesePlanks });
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { "   ", " C ", " C ", 'C', CoolMod.CheesePlanks });
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { "C  ", "C  ", "   ", 'C', CoolMod.CheesePlanks });
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { "  C", "  C", "   ", 'C', CoolMod.CheesePlanks });
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { "   ", "  C", "  C", 'C', CoolMod.CheesePlanks });
		GameRegistry.addRecipe(new ItemStack(itemCheese_stick, 2),
				new Object[] { "   ", "C  ", "C  ", 'C', CoolMod.CheesePlanks });

		GameRegistry.addRecipe(new ItemStack(Block_of_chez),
				new Object[] { "BBB", "BBB", "BBB", 'B', CoolMod.itemCheeese });

		GameRegistry.addRecipe(new ItemStack(grenade),
				new Object[] { " T ", " B ", "   ", 'B', CoolMod.itemCheeese, 'T', Blocks.tnt });

		GameRegistry.addSmelting(new ItemStack(Items.baked_potato, 1, 1), new ItemStack(Items.bed, 1, 1), 0.1F);

		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock),
				new Object[] { "BBB", "BBB", "BBB", 'B', Blocks.obsidian });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_spade),
				new Object[] { " C ", " S ", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_spade),
				new Object[] { "CC ", " S ", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_HOE),
				new Object[] { " CC", " S ", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_axe),
				new Object[] { "CC ", "CS ", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_axe),
				new Object[] { " CC", " SC", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });

		GameRegistry.addRecipe(new ItemStack(CoolMod.chez_pic),
				new Object[] { "CCC", " S ", " S ", 'C', CoolMod.itemCheeese, 'S', CoolMod.itemCheese_stick });
		GameRegistry.addRecipe(new ItemStack(CoolMod.REDSTONE_SWORD),
				new Object[] { " C ", " C ", " S ", 'S', Items.stick, 'C', Blocks.redstone_block });
		GameRegistry.addRecipe(new ItemStack(CoolMod.Cheese_obsidian),
				new Object[] { "CCC", "CSC", "CCC", 'S', CoolMod.itemCheeese, 'C', Blocks.obsidian });

		GameRegistry.addRecipe(new ItemStack(CoolMod.CheeseApple),
				new Object[] { "SSS", "SCS", "SSS", 'S', CoolMod.itemCheeese, 'C', Items.golden_apple });

		ItemStack CheeseStack = new ItemStack(CoolMod.itemCheeese);

		GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.FlintCheese, 1), new ItemStack(CoolMod.itemCheeese));
		new ItemStack(Items.iron_ingot);
		// new ItemStack(Items.iron_ingot);
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(CoolMod.FlintCheese,1));
		// GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,64, new
		// ItemStack(Blocks.sand)));
		// ItemFlintAndSteel BlockWood
		GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.FlintCheese),
				new Object[] { Items.iron_ingot, new ItemStack(CoolMod.itemCheeese, 1, 4) });
		GameRegistry.addSmelting(CoolMod.Cheese_ore, new ItemStack(CoolMod.itemCheeese), 5000.0F);
		GameRegistry.addShapelessRecipe(new ItemStack(CoolMod.CheesePlanks, 4), new ItemStack(CoolMod.CheeseWood));
		GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());

		// Register the given class so Forge can use it
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 4, this, 80, 3, true);

		proxy.registerRenderThings();
		proxy.registerSounds();
		// ItemPotion
	};
}