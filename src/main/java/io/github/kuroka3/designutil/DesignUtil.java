package io.github.kuroka3.designutil;

import io.github.kuroka3.designutil.Apply.Chat;
import io.github.kuroka3.designutil.Apply.Join;
import io.github.kuroka3.designutil.Apply.Quit;
import io.github.kuroka3.designutil.Command.Reload;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class DesignUtil extends JavaPlugin {

    @Override
    public void onEnable() {
        if(!this.getDataFolder().isFile()) {
            this.getDataFolder().mkdir();
        }

        getServer().getPluginManager().registerEvents(new Chat(), this);
        getServer().getPluginManager().registerEvents(new Join(), this);
        getServer().getPluginManager().registerEvents(new Quit(), this);

        getCommand("designutil").setExecutor(new Reload());

        getLogger().log(Level.INFO, "Designs Applied");
        Designs.load();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
