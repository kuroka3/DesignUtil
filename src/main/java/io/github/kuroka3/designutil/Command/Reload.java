package io.github.kuroka3.designutil.Command;

import io.github.kuroka3.designutil.DesignUtil;
import io.github.kuroka3.designutil.Designs;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(args.length != 1) {
            sender.sendMessage(ChatColor.RED + "usage missed");
            return true;
        }

        if(args[0].equalsIgnoreCase("usage")) {
            sender.sendMessage("File in DesignUtil Folder");
            sender.sendMessage("<<Player>> : Player's name");
            sender.sendMessage("(only chat) <<message>> : Chat message");
        } else if(args[0].equalsIgnoreCase("reload") && sender.isOp()) {
            Designs.load();
            sender.sendMessage("Reloaded");
        }
        return true;
    }
}
