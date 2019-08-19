package me.invisraidinq.nbasics.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class BroadCastCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("broadcast")) {
			String a = "";
			if (sender.hasPermission("nbasics.broadcast")) {
				if (args.length > 0) {
					for (int i = 0; i < args.length; i++) {
						a = a + args[i] + " ";
					}
					Bukkit.broadcastMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("broadcast_format") + a));
				} else {
					sender.sendMessage(ChatColor.GRAY + "Usage: /broadcast <message>");
				}
			} else {
				sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("no_perm_message")));
			}
		}
		return true;
	}

}
