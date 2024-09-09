package kr.apo2073.lib.Etc

import jdk.jshell.SourceCodeAnalysis.Suggestion
import kr.apo2073.lib.ALib
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Bukkit

fun txt(text:String):Component {
    return Component.text(text)
}

fun cmp(text: String, color: TextColor, decoration: TextDecoration): Component {
    return Component.text(text).color(color).decorate(decoration)
}

fun bcast(text: String) {
    Bukkit.broadcast(Component.text(text))
}
fun broadcast(text: String) {
    Bukkit.broadcast(Component.text(text))
}

fun log(msg: String) {
    Bukkit.getLogger().info(msg)
}

fun warning(msg: String) {
    Bukkit.getLogger().warning(msg)
}

class MsgPerfix() {
    fun Default():String {
        return "§l[§a*§f]§r"
    }
    fun Error():String {
        return "§l[§c*§f]§r"
    }
    fun Suggestion():String {
        return "§l[§d*§f]§r"
    }
    fun Warning():String {
        return "§l[§6*§f]§r"
    }
}