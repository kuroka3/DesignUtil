package io.github.kuroka3.designutil.Apply;

import io.github.kuroka3.designutil.Designs;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if(!Designs.chat.equalsIgnoreCase("default")) {
            e.setCancelled(true);

            String message = Designs.chat;

            message = message.replaceAll("<<Player>>", e.getPlayer().getName());
            message = message.replaceAll("<<message>>", e.getMessage());
            message = message.replaceAll("\\n", "\n");
            message = message.replaceAll("&", "§");

            Bukkit.getServer().broadcast(Component.text(message));
        }
    }
}
