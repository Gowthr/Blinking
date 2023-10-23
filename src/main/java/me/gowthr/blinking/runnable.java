package me.gowthr.blinking;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import static org.bukkit.Bukkit.getServer;

public class runnable extends BukkitRunnable {

    public runnable(Blinking plugin) {}


    @Override
    public void run() {

        for(Player p : getServer().getOnlinePlayers()) {p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20, 255));}}}
