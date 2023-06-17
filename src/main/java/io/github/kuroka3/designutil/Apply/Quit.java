package io.github.kuroka3.designutil.Apply;

import io.github.kuroka3.designutil.Designs;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Quit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if(!Designs.quit.equalsIgnoreCase("default")) {
            String message = Designs.quit;

            message = message.replaceAll("<<Player>>", e.getPlayer().getName());
            message = message.replaceAll("\\n", "\n");
            message = message.replaceAll("&", "§");

            e.setQuitMessage(message);
        }
    }
}
