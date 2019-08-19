package me.invisraidinq.nbasics.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class SetRankCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("setrank")) {
			if(sender.hasPermission("nbasics.setrank")) {
			if(args.length != 2) {
				sender.sendMessage(ColorUtils.chat("&cUsage: /setrank <player> <rank>"));
			}
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set " + args[1]);
			sender.sendMessage(ColorUtils.chat("&7" + args[0] + "'s rank has been set to " + args[1]));
			return true;
		} else {
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("no_perm_message")));
		}
		}
		return false;
	}

}
