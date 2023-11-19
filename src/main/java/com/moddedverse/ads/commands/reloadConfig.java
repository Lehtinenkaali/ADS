package com.moddedverse.ads.commands;

import com.moddedverse.ads.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class reloadConfig implements CommandExecutor {

    private final Main plugin;

    public reloadConfig(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (command.getName().equalsIgnoreCase("reloadConfig")) {
            startAd.stopAds();
            if (plugin.getConfig().getBoolean("commands.reloadConfig.commandMessages")) {
                commandSender.sendMessage(plugin.getConfig().getString("prefix").replace("&", "§") + plugin.getConfig().getString("commands.reloadConfig.reloadingConfig").replace("&", "§"));
                commandSender.sendMessage(plugin.getConfig().getString("prefix").replace("&", "§") + plugin.getConfig().getString("commands.reloadConfig.reloadedConfig").replace("&", "§"));
            }
            plugin.reloadConfig();
            startAd.startAds();
            return true;
        }

        return false;
    }
}
