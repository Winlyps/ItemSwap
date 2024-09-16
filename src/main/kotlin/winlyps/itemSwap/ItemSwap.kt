package winlyps.itemSwap

import org.bukkit.plugin.java.JavaPlugin

class ItemSwap : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(ItemSwapListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}