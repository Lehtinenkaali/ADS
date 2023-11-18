package com.moddedverse.ads;

import com.moddedverse.ads.commands.reloadConfig;
import com.moddedverse.ads.commands.startAd;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class Main extends JavaPlugin {



    @Override
    public void onEnable() {
        getCommand("startAds").setExecutor(new startAd(this));
        getCommand("reloadConfig").setExecutor(new reloadConfig());
        getCommand("stopAds").setExecutor(new startAd(this));
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
