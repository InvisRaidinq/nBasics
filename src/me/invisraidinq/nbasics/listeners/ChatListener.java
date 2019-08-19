package me.invisraidinq.nbasics.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ChatListener implements Listener
{
    @SuppressWarnings("deprecation")
	@EventHandler
    public void onChat(final AsyncPlayerChatEvent c) {
        c.setFormat(String.valueOf(String.valueOf(PermissionsEx.getUser(c.getPlayer()).getGroups()[0].getPrefix().replace("_", " ").replace("&", "§"))) + c.getPlayer().getName() + " §7" + c.getMessage());
    }
}