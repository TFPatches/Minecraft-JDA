package me.zeroepoch1969.jda;

import org.bukkit.plugin.java.JavaPlugin;

public class JDA extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("Successfully loaded JDA.");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Successfully unloaded JDA.");
    }
}