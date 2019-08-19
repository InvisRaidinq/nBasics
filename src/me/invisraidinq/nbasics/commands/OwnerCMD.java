package me.invisraidinq.nbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class OwnerCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("owner")) {
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("owner_format")));
		}
		return false;
	}

}
