package kr.apo2073.aLib

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.plugin.java.JavaPlugin

class ALib : JavaPlugin() {
    override fun onEnable() {
        if (Instance!=null) return
        Instance=this

        logger.info(
            Component.text("Made By.아포칼립스").color(TextColor.color(0xB9AAFF)).decorate(
                TextDecoration.BOLD).content())

    }

    companion object {
        var Instance:ALib?=null
    }

    override fun onDisable() {

    }
}
