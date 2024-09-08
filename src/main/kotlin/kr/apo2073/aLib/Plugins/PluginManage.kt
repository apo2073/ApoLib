package kr.apo2073.aLib.Plugins

import org.bukkit.Bukkit
import org.bukkit.Server
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin

fun PluginManager.reloadPlugin(plugin: JavaPlugin) {
    disablePlugin(plugin)
    enablePlugin(plugin)
}