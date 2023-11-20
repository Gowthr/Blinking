package me.gowthr.nomorepearl;

import org.bukkit.ChatColor;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoMorePearl extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerThrow(ProjectileLaunchEvent launchEvent){
        Projectile projectile = launchEvent.getEntity();
        if(projectile instanceof EnderPearl){
            launchEvent.setCancelled(true);
            Player player = (Player) projectile.getShooter();
            assert player != null;
            player.sendMessage(ChatColor.RED + "Ender Pearl's are not enabled on this server!");
        }
    }
}
