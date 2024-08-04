package kr.apo2073.aLib.Plugins

import org.bukkit.Bukkit

fun CheckPlugin(plugin:String) :Boolean {
    if (Bukkit.getPluginManager().getPlugin(plugin)!=null) return true
    else return false
}