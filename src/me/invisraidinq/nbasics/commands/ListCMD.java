package me.invisraidinq.nbasics.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class ListCMD implements CommandExecutor{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("list")){
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("list_format") + Bukkit.getOnlinePlayers().length));
		}
		return true;
	}
}