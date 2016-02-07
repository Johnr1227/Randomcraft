package com.oyoclass.KidoyoMod;

import java.util.LinkedList;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.PlaySoundEvent17;

import com.google.common.collect.Multimap;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CheeseSword extends ItemSword {

	private float weaponDamage;

	public CheeseSword(ToolMaterial cheese) {
		super(cheese);
		this.weaponDamage = 1000000000;

		
		this.setCreativeTab(CoolMod.Random_stuff);

	}

	public float getDamageVsEntity() {
		return this.weaponDamage;

	}

	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(
				field_111210_e, "Weapon modifier", (double) this.weaponDamage, 0));
		return multimap;
	}

	boolean isEquipped = false;
	boolean currentItemWasCheeseSword = false;

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int inventorySlot, boolean newEquipped) {
		super.onUpdate(itemStack, world, entity, inventorySlot, newEquipped);
		boolean currentItemIsCheeseSword = false;
		InventoryPlayer inventory = null;
		if (entity instanceof EntityClientPlayerMP) {
			inventory = ((EntityClientPlayerMP) entity).inventory;
		} else if (entity instanceof EntityPlayerMP) {
			inventory = ((EntityPlayerMP) entity).inventory;
		}
		if (inventory != null) {
			ItemStack currentItem = inventory.getCurrentItem();
			if (currentItem != null) {
				currentItemIsCheeseSword = (currentItem.getItem().getClass() == CheeseSword.class);
			}
		}
		if (isEquipped && !newEquipped && !currentItemIsCheeseSword && currentItemWasCheeseSword) {
			System.out.println(this + " You put the cheese sword away! " + inventorySlot + " stack: " + itemStack);
			soundListener.stopAllRecentDoraSounds();
		} else if (!isEquipped && newEquipped && currentItemIsCheeseSword && !currentItemWasCheeseSword) {
			System.out.println(this + " You just equipped the cheese sword! " + inventorySlot + " stack: " + itemStack);
			System.out.println("Entity: " + entity);
			System.out.println("ItemStack: " + itemStack);

			float soundVolume = 10000.0f;
			float soundSpeed = 1.0f;
			soundListener.stopAllRecentDoraSounds();
		    world.playSoundAtEntity(entity, "cm:Hallelujah", soundVolume, soundSpeed);
		}
		isEquipped = newEquipped;
		currentItemWasCheeseSword = currentItemIsCheeseSword;
	}

	private static final SoundListener soundListener = new SoundListener();

	public static final class SoundListener {
		LinkedList<PlaySoundEvent17> lastSoundEvents = new LinkedList<PlaySoundEvent17>();

		public void stopAllRecentDoraSounds() {
			LinkedList<PlaySoundEvent17> soundEventsToStop = lastSoundEvents;
			lastSoundEvents = new LinkedList<PlaySoundEvent17>();
			if (soundEventsToStop != null) {
				for (PlaySoundEvent17 eventToStop : soundEventsToStop) {
				//	System.out.println("Stopping the sound: " + eventToStop.sound);
					eventToStop.manager.stopSound(eventToStop.sound);
				}
			} else {
				//System.out.println("No Sound to stop!");
			}
		}

		@SubscribeEvent
		public void soundStartedPlaying(PlaySoundEvent17 soundEvent) {
			//System.out.println("Sound started: " + soundEvent.name);
			if (soundEvent.name.equals("Hallelujah")) {
			
				this.lastSoundEvents.add(soundEvent);
			}
		}
	}

	public static SoundListener getSoundListener() {
		return soundListener;
	}
	
	public boolean hasEffect(ItemStack par1ItemStack, int pass) {
		// This means it will look "special" in the inventory
		return true;

}}
// ItemBow
// ItemPotion