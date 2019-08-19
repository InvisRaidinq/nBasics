package me.invisraidinq.nbasics;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.invisraidinq.nbasics.commands.BroadCastCMD;
import me.invisraidinq.nbasics.commands.ChangelogCMD;
import me.invisraidinq.nbasics.commands.ClearChatCMD;
import me.invisraidinq.nbasics.commands.DiscordCMD;
import me.invisraidinq.nbasics.commands.ForumsCMD;
import me.invisraidinq.nbasics.commands.HelpCMD;
import me.invisraidinq.nbasics.commands.ListCMD;
import me.invisraidinq.nbasics.commands.MessageCMD;
import me.invisraidinq.nbasics.commands.OwnerCMD;
import me.invisraidinq.nbasics.commands.ReplyCMD;
import me.invisraidinq.nbasics.commands.SetRankCMD;
import me.invisraidinq.nbasics.commands.StoreCMD;
import me.invisraidinq.nbasics.commands.TeamspeakCMD;
import me.invisraidinq.nbasics.commands.TwitterCMD;
import me.invisraidinq.nbasics.listeners.ChatListener;
import net.md_5.bungee.api.ChatColor;

public class Base extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + ChatColor.STRIKETHROUGH.toString() + "------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "nBasics version 1.1 by InvisRaidinq has been ENABLED");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + " - Registering Commands");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + " - Registering Listeners");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + " - Loaded config.yml");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Please message InvisRaidinq#1150 if you encounter issues");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + ChatColor.STRIKETHROUGH.toString() + "------------------------------");
		this.registerCommands();
		this.registerListeners();
		saveDefaultConfig();
		
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + ChatColor.STRIKETHROUGH.toString() + "------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "nBasics version 1.1 by InvisRaidinq has been DISABLED");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + ChatColor.STRIKETHROUGH.toString() + "------------------------------");
	}
	
	public void registerCommands() {
		this.getCommand("changelog").setExecutor(new ChangelogCMD());
		this.getCommand("discord").setExecutor(new DiscordCMD());
		this.getCommand("store").setExecutor(new StoreCMD());
		this.getCommand("forums").setExecutor(new ForumsCMD());
		this.getCommand("teamspeak").setExecutor(new TeamspeakCMD());
		this.getCommand("msg").setExecutor(new MessageCMD());
		this.getCommand("reply").setExecutor(new ReplyCMD());
		this.getCommand("help").setExecutor(new HelpCMD());
		this.getCommand("twitter").setExecutor(new TwitterCMD());
		this.getCommand("broadcast").setExecutor(new BroadCastCMD());
		this.getCommand("clearchat").setExecutor(new ClearChatCMD());
		this.getCommand("list").setExecutor(new ListCMD());
		this.getCommand("setrank").setExecutor(new SetRankCMD());
		this.getCommand("owner").setExecutor(new OwnerCMD());
	}
	
	public void registerListeners() {
	    final PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents((Listener)new ChatListener(), (Plugin)this);
	}
}