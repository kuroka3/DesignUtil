package io.github.kuroka3.designutil.Apply;

import io.github.kuroka3.designutil.Designs;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if(!Designs.join.equalsIgnoreCase("default")) {
            String message = Designs.join;

            message = message.replaceAll("<<Player>>", e.getPlayer().getName());
            message = message.replaceAll("\\n", "\n");
            message = message.replaceAll("&", "§");

            e.setJoinMessage(message);
        }
    }
}
