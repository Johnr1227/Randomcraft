package com.oyoclass.KidoyoMod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class CheeseWither extends EntityMob implements IBossDisplayData, IRangedAttackMob {

	public static final int TRACKING_RANGE = 1000000000;
	public static final Class ENTITY_CLASS = CheeseWither.class;
	public static final int SPAWN_PROBABILITY = 92;
	public static final int EGG_COLOR = 0xE68A00;
	public static final int SPOT_COLOR = 0xFF6600;
	public static final float HEALTH = 100000000000f;
	
	public static void register() {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(ENTITY_CLASS, "Cheese Wither", randomId);
		EntityRegistry.registerModEntity(ENTITY_CLASS, "Cheese Wither", randomId, CoolMod.MODID, TRACKING_RANGE, 1000,
				true);
		EntityRegistry.addSpawn(ENTITY_CLASS, SPAWN_PROBABILITY, 1, 2, EnumCreatureType.monster, BiomeGenBase.hell);

		createEgg(randomId, EGG_COLOR, SPOT_COLOR);

		RenderingRegistry.registerEntityRenderingHandler(CheeseWither.class, new CheeseWitherRenderer(
				new CheeseWitherModel(), 0F));
	}

	private static void createEgg(int randomId, int eggColor, int spotColor) {
		EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, eggColor, spotColor));
	}

	/** Selector used to determine the entities a wither boss should attack. */
	private static final IEntitySelector attackEntitySelector = new IEntitySelector() {
		private static final String __OBFID = "CL_00001662";

		/**
		 * Return whether the specified entity is applicable to this filter.
		 */
		public boolean isEntityApplicable(Entity p_82704_1_) {
			return p_82704_1_ instanceof EntityLivingBase
					&& ((EntityLivingBase) p_82704_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD;
		}
	};

	public CheeseWither(World world) {
		super(world);
		this.setHealth(HEALTH);
		this.setAIMoveSpeed(1.7F);
		this.isImmuneToFire = true;
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(0, new EntityAIWander(this, 1.0D)); // 15D
//		this.tasks.addTask(1, new EntityAISwimming(this));
//		this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, 40, 20.0F));
//		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
//		this.tasks.addTask(4, new EntityAILookIdle(this));
//		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
		this.setSize(2.0F, 4.0F);
//		this.tasks.addTask(5, new EntityAIArrowAttack(this, 1.0D, 40, 20.0F));
		this.eatGrassBonus();
		this.getShadowSize();
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false,
				attackEntitySelector));
		this.experienceValue = 150000;
	}

	@Override
	protected void applyEntityAttributes() {
		// TODO Auto-generated method stub
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9999999999999999D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(100);
	}
	

	{
		this.dropItem(CoolMod.itemCheeese, 15);
		this.dropItem(Items.nether_star, 50);
	}
	 protected void dropRareDrop(int p_70600_1_)
	    {
	        switch (this.rand.nextInt(3))
	        {
	            case 0:
	                this.dropItem(Items.diamond, 1000);
	                break;
	            case 1:
	                this.dropItem(Items.ender_pearl, 1000);
	                break;
	            case 2:
	                this.dropItem(Items.coal, 1000);
	                break;
	        }}
	 

	    /**
	     * This method gets called when the entity kills another one.
	     */
	    
	@Override
	protected String getDeathSound() {
		return "mob.ghast.death";
	}

	protected String getLivingSound() {
		return "mob.wolf.growl";
	}

	public static int getSpawnProbability() {
		return SPAWN_PROBABILITY;
	}

	@Override
	protected String getHurtSound() {
		return "mob.endermen.scream";
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82s196_2_) {
		System.out.println("attackEntityWithRangedAttack !!!!! " + p_82196_1_);

		this.func_82216_a(0, p_82196_1_);
	}

	private void func_82216_a(int p_82216_1_, EntityLivingBase p_82216_2_) {
		this.func_82209_a(p_82216_1_, p_82216_2_.posX, p_82216_2_.posY + (double) p_82216_2_.getEyeHeight() * 0.5D,
				p_82216_2_.posZ, p_82216_1_ == 0 && this.rand.nextFloat() < 0.001F);
	}

	private void func_82209_a(int p_82209_1_, double p_82209_2_, double p_82209_4_, double p_82209_6_,
			boolean p_82209_8_) {
		this.worldObj.playAuxSFXAtEntity((EntityPlayer) null, 1014, (int) this.posX, (int) this.posY, (int) this.posZ,
				0);
		double d3 = this.func_82214_u(p_82209_1_);
		double d4 = this.func_82208_v(p_82209_1_);
		double d5 = this.func_82213_w(p_82209_1_);
		double d6 = p_82209_2_ - d3;
		double d7 = p_82209_4_ - d4;
		double d8 = p_82209_6_ - d5;
		EntityWitherSkull entitywitherskull = new EntityWitherSkull(this.worldObj, this, d6, d7, d8);

		if (p_82209_8_) {
			entitywitherskull.setInvulnerable(true);
		}

		entitywitherskull.posY = d4;
		entitywitherskull.posX = d3;
		entitywitherskull.posZ = d5;
		this.worldObj.spawnEntityInWorld(entitywitherskull);
	}

	private double func_82214_u(int p_82214_1_) {
		if (p_82214_1_ <= 0) {
			return this.posX;
		} else {
			float f = (this.renderYawOffset + (float) (180 * (p_82214_1_ - 1))) / 180.0F * (float) Math.PI;
			float f1 = MathHelper.cos(f);
			return this.posX + (double) f1 * 1.3D;
		}
	}

	private double func_82208_v(int p_82208_1_) {
		return p_82208_1_ <= 0 ? this.posY + 3.0D : this.posY + 2.2D;
	}

	private double func_82213_w(int p_82213_1_) {
		if (p_82213_1_ <= 0) {
			return this.posZ;
		} else {
			float f = (this.renderYawOffset + (float) (180 * (p_82213_1_ - 1))) / 180.0F * (float) Math.PI;
			float f1 = MathHelper.sin(f);
			return this.posZ + (double) f1 * 1.3D;
		}
		
	
		
		
	}
}
