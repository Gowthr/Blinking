package me.gowthr.blinking;

import org.bukkit.plugin.java.JavaPlugin;

public final class Blinking extends JavaPlugin {
    @Override
    public void onEnable() {runnable runnable = new runnable(this);runnable.runTaskTimer(this,0,100);}}
