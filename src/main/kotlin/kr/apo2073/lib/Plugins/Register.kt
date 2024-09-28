package kr.apo2073.lib.Plugins

import org.bukkit.command.CommandExecutor
import org.bukkit.command.TabCompleter
import org.bukkit.command.TabExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class Register(private var plugin: JavaPlugin) {
    fun resistEventListener(listener: Listener): Register {
        plugin.server.pluginManager.registerEvents(listener, plugin)
        return this
    }
    fun resistCommandExecutor(command:String, commandExecutor: CommandExecutor):Register {
        plugin.getCommand(command)?.setExecutor(commandExecutor)
        return this
    }
    fun resistTabCompleter(command: String, tabCompleter: TabCompleter):Register {
        plugin.getCommand(command)?.tabCompleter=tabCompleter
        return this
    }
    fun resistTabExecutor(command: String, tabExecutor: TabExecutor):Register {
        plugin.getCommand(command)?.setExecutor(tabExecutor)
        plugin.getCommand(command)?.tabCompleter=tabExecutor
        return this
    }
}