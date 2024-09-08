package kr.apo2073.aLib.Etc

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.util.io.BukkitObjectInputStream

fun txt(text:String):Component {
    return Component.text(text)
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