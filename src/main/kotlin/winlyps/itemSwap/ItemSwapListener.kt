package winlyps.itemSwap

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerToggleSneakEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.Plugin

class ItemSwapListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onPlayerToggleSneak(event: PlayerToggleSneakEvent) {
        if (event.isSneaking) {
            val player = event.player
            val mainHandItem = player.inventory.itemInMainHand
            val offHandItem = player.inventory.itemInOffHand

            // Swap items
            player.inventory.setItemInMainHand(offHandItem)
            player.inventory.setItemInOffHand(mainHandItem)
        }
    }
}