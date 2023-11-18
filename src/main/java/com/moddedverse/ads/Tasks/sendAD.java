package com.moddedverse.ads.Tasks;

import com.moddedverse.ads.Main;
import jdk.internal.org.jline.utils.ShutdownHooks;
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
        int id = getTaskId();
        Random rand = new Random();

        int ad = rand.nextInt(8);
        switch (ad) {
            case 1:
                sendAd(1);
                break;
            case 2:
                sendAd(2);
                break;
            case 3:
                sendAd(3);
                break;
            case 4:
                sendAd(4);
                break;
            case 5:
                sendAd(5);
                break;
            case 6:
                sendAd(6);
                break;
            case 7:
                sendAd(7);
                break;
            default:
                Bukkit.getLogger().info("No ads found!");
                break;
        }

    }

        private void sendAd (int adNumber){

            TextComponent ad = Component.text(plugin.getConfig().getString("Ads." + adNumber + ".header").replace("&", "§").replace("%newLine%", "\n"))
                    .append(Component.text().content(plugin.getConfig().getString("Ads." + adNumber + ".click").replace("&", "§").replace("%newLine%", "\n"))
                            .clickEvent(ClickEvent.openUrl(plugin.getConfig().getString("Ads." + adNumber + ".url")))
                            .hoverEvent(Component.text(plugin.getConfig().getString("Ads." + adNumber + ".hover").replace("&", "§").replace("%newLine%", "\n")))
                    .append(Component.text(plugin.getConfig().getString("Ads." + adNumber + ".footer").replace("&", "§").replace("%newLine%", "\n"))));



        Bukkit.broadcast(ad);
        }


}



