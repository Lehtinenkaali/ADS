package com.moddedverse.ads.Tasks;

import com.moddedverse.ads.Main;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class sendAD extends BukkitRunnable {
    private final Main plugin;
    public static BukkitRunnable ads = new sendAD(Main.getPlugin(Main.class));


    public sendAD(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        Random rand = new Random();

        int adCount = plugin.getConfig().getInt("ads_amount");
        if (adCount > 0) {
            int adIndex = rand.nextInt(adCount);
            sendAd(adIndex);
        } else {
            Bukkit.getLogger().info("No ads found!");
        }

    }

        private void sendAd (int adNumber){

            TextComponent ad = Component.text(plugin.getConfig().getString("ads." + adNumber + ".header").replace("&", "§").replace("%newLine%", "\n"))
                    .append(Component.text().content(plugin.getConfig().getString("ads." + adNumber + ".click").replace("&", "§").replace("%newLine%", "\n"))
                            .clickEvent(ClickEvent.openUrl(plugin.getConfig().getString("ads." + adNumber + ".url")))
                            .hoverEvent(Component.text(plugin.getConfig().getString("ads." + adNumber + ".hover").replace("&", "§").replace("%newLine%", "\n")))
                    .append(Component.text(plugin.getConfig().getString("ads." + adNumber + ".footer").replace("&", "§").replace("%newLine%", "\n"))));



        Bukkit.broadcast(ad);
        }


}



