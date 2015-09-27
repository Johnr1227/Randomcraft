package com.oyoclass.KidoyoMod;

import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {

	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		if (event.block == Blocks.dirt) {
			event.getPlayer()
					.addChatMessage(
							new ChatComponentText(EnumChatFormatting.DARK_RED
									+ "You Just Murdered an innocent Dirt Block >:("));

		}
	}
}
