package org.akhilk999.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() { // Plugin startup logic
        System.out.println("Started");
        //enables Listener class (PlayerMovementListener) to be used by the server
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
    }

    @Override
    public void onDisable() { // Plugin shutdown logic
        System.out.println("Ended");
    }
}
