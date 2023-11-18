package com.moddedverse.ads.commands;

import com.moddedverse.ads.Main;
import com.moddedverse.ads.Tasks.sendAD;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;



public class startAd implements CommandExecutor {
    //Instance of the main class
    public final Main plugin;
    public static int taskID;

    public startAd(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (command.getName().equalsIgnoreCase("startAds")) {
            startAds();
            plugin.saveConfig();
            return true;
        } else if (command.getName().equalsIgnoreCase("stopAds")) {
            commandSender.sendMessage("§6§lStopping ads...");
            stopAds();
            commandSender.sendMessage("§6§lAds stopped!");
            plugin.saveConfig();
            return true;
        }

        return false;
    }
    public static void startAds(){
        sendAD.ads = new sendAD(Main.getPlugin(Main.class));
        sendAD.ads.runTaskTimer(Main.getPlugin(Main.class), 0, 20L * 60L * Main.getPlugin(Main.class).getConfig().getInt("Ads.interval"));
        taskID = sendAD.ads.getTaskId();
    }

    public static void stopAds(){
        Bukkit.getScheduler().cancelTask(taskID);
    }


}
