package me.invisraidinq.nbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class HelpCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("help")) {
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_one")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_two")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_three")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_four")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_five")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_six")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_seven")));
			sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("help_eight")));
		}
		return false;
	}

}
