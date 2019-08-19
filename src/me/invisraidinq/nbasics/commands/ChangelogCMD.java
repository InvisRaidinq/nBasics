package me.invisraidinq.nbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class ChangelogCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("changelog")) {
			if(!sender.hasPermission("nbasics.changelog")) {
				sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("no_perm_message")));
				return true;
			}
			sender.sendMessage(ColorUtils.chat("&7&m------------------------------"));
			sender.sendMessage(ColorUtils.chat("&b&lChangelog"));
			sender.sendMessage(ColorUtils.chat("&7&m------------------------------"));
			sender.sendMessage(ColorUtils.chat("&f&lVersion 1.0"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/changelog &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded a &fchat listener"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/discord &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/store &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/forums &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/ts &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/reply &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/msg &bcommand"));
			sender.sendMessage(ColorUtils.chat(""));
			sender.sendMessage(ColorUtils.chat("&f&lVersion 1.1"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/help &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/twitter &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/broadcast &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/clearchat &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/list &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/setrank &bcommand"));
			sender.sendMessage(ColorUtils.chat("&bAdded the &f/owner &bcommand"));
		}
		return false;
	}

}

