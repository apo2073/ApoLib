package kr.apo2073.lib.Plugins

import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin

fun PluginManager.reloadPlugin(plugin: JavaPlugin) {
    try {
        disablePlugin(plugin)
        enablePlugin(plugin)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}