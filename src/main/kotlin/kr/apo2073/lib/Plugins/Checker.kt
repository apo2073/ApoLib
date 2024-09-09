package kr.apo2073.lib.Plugins

import org.bukkit.Bukkit

fun checkPlugin(plugin: String): Boolean {
    return Bukkit.getPluginManager().getPlugin(plugin) != null
}
