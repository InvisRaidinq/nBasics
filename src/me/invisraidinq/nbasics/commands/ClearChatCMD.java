package me.invisraidinq.nbasics.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.Base;
import me.invisraidinq.nbasics.extra.ColorUtils;

public class ClearChatCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (cmd.getName().equalsIgnoreCase("clearchat")) {
            if (!sender.hasPermission("nbasics.clearchat")) {
                sender.sendMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("no_perm_message")));
                return true;
            }
            for (int i = 0; i < 100; ++i) {
                Bukkit.broadcastMessage(" ");
            }
            Bukkit.broadcastMessage(ColorUtils.chat(Base.getPlugin(Base.class).getConfig().getString("clearchat_format")));
        }
        return true;
    }
}
