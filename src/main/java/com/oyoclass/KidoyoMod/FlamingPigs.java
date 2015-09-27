package com.oyoclass.KidoyoMod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FlamingPigs implements ICommand {

	private List aliases = new ArrayList();
	private int numberOfPigs = 0;

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/flamingpigs <number of pigs>";
	}

	@Override
	public List getCommandAliases() {
		return aliases;
	}

	@Override
	// This is called execute() in Forge 1.8
	public void processCommand(ICommandSender sender, String[] args) {
		if (args.length != 1) {
			sendErrorMessage(sender, "Invalid number of arguments!!!!!!! :D");
			return;
		}
		try {
			numberOfPigs = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			sendErrorMessage(sender, "The Argument \"" + args[0] + "\" is not a valid number!");
		}
		EntityPlayer player = (EntityPlayer) sender;
		for (int i = 0; i < numberOfPigs; i++) {
			EntityPig pig = new EntityPig(player.worldObj);
			pig.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
			pig.setFire(10000);
			player.worldObj.spawnEntityInWorld(pig);
		}
	}

	private void sendErrorMessage(ICommandSender sender, String message) {
		sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + message));
	}

	@Override
	public String getCommandName() {
		return "flamingpigs";
	}

	@Override // Called canCommandSenderUse in Forge 1.8
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return sender instanceof EntityPlayer;
	}
		
	@Override //	Forge 1.8: public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockP
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}
	

}
