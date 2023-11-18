package com.moddedverse.ads.commands;

import com.moddedverse.ads.Main;
import com.moddedverse.ads.Tasks.sendAD;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

public class reloadConfig implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (command.getName().equalsIgnoreCase("reloadConfig")) {
            startAd.stopAds();
            commandSender.sendMessage("§6§lReloading config...");
            Main.getPlugin(Main.class).reloadConfig();
            commandSender.sendMessage("§6§lConfig reloaded!");
            startAd.startAds();
            Main.getPlugin(Main.class).saveConfig();
            return true;
        }

        return false;
    }
}
