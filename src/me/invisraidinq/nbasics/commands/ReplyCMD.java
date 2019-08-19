package me.invisraidinq.nbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.invisraidinq.nbasics.extra.ColorUtils;
import me.invisraidinq.nbasics.extra.MessageEvent;

public class ReplyCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ColorUtils.chat("&cUsage: /r <message>"));
        }
        else if (MessageCMD.reply.get(sender) == null) {
            sender.sendMessage(ColorUtils.chat("&cYou have nobody to reply to."));
        }
        else if (MessageCMD.reply.get(sender).getName() == sender.getName()) {
            sender.sendMessage(ColorUtils.chat("&cYou cannot message yourself."));
        }
        else if (args[0].equalsIgnoreCase("who")) {
            sender.sendMessage(MessageEvent.format(ColorUtils.chat("&eYou are currently in a conversation with &a" + MessageCMD.reply.get(sender).getName())));
        }
        else {
            if (!MessageCMD.toggle.contains(MessageCMD.reply.get(sender).getName()) || sender.hasPermission("nbasics.*")) {
                final String msgto = MessageEvent.format(ColorUtils.chat("&7(&7To &7" + MessageCMD.reply.get(sender).getName() + "&7)&7 " + MessageEvent.toString(args, 0)));
                sender.sendMessage(msgto);
                final String msgget = MessageEvent.format(ColorUtils.chat("&7(&7From &7" + sender.getName() + "&7)&7 " + MessageEvent.toString(args, 0)));
                MessageCMD.reply.get(sender).sendMessage(MessageEvent.format(msgget));
                return true;
            }
            sender.sendMessage(MessageEvent.format(ColorUtils.chat("&a" + MessageCMD.reply.get(sender).getName() + " &ehas their messages toggled")));
        }
        return false;
    }
}