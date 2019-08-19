package me.invisraidinq.nbasics.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.invisraidinq.nbasics.extra.ColorUtils;
import me.invisraidinq.nbasics.extra.MessageEvent;

public class MessageCMD implements CommandExecutor
{
	
public static List<String> toggle = new ArrayList<String>();
public static HashMap<CommandSender, Player> reply = new HashMap<CommandSender, Player>();
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
{
  if (sender instanceof Player)
  {
    if (args.length <= 1)
    {
      sender.sendMessage(ColorUtils.chat("&cUsage: /msg <player> <message>"));
    }
    else if (Bukkit.getPlayer(args[0]) == null)
    {
      sender.sendMessage(ColorUtils.chat("&cCould not find that player"));
    }
    else if (Bukkit.getPlayer(args[0]).getName() == sender.getName())
    {
      sender.sendMessage(ColorUtils.chat("&cYou cannot message yourself"));
    }
    else if ((toggle.contains(Bukkit.getPlayer(args[0]).getDisplayName())) && (!sender.hasPermission("nbasics.*")))
    {
      sender.sendMessage(MessageEvent.format("&b" + Bukkit.getPlayer(args[0]).getName() + "&f has their messages toghled"));
    }
    else
    {
      String msgto = MessageEvent.format("&7(&7To " + "&f" + Bukkit.getPlayer(args[0]).getName() + "&7)&7 " + MessageEvent.toString(args, 1));
      sender.sendMessage(msgto);
      
      String msgrecieve = MessageEvent.format("&7(&7From &f" + sender.getName() + "&7) &7" + MessageEvent.toString(args, 1));
      Bukkit.getPlayer(args[0]).sendMessage(msgrecieve);
      reply.put(sender, Bukkit.getPlayer(args[0]));
      reply.put(Bukkit.getPlayer(args[0]), (Player)sender);
      return true;
    }
    if(!(sender instanceof Player)) {
    	sender.sendMessage(MessageEvent.format("&cYou must be a player to use this"));
    }
  }
  return false;
}
}
