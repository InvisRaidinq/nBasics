package me.invisraidinq.nbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class TeamspeakCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("teamspeak")) {
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("teamspeak_link")));
			return true;
		}
		return false;
	}

}