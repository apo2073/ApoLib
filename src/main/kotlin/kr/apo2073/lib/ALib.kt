package kr.apo2073.lib

import kr.apo2073.lib.Etc.log
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.plugin.java.JavaPlugin

class ALib : JavaPlugin() {
    override fun onEnable() {
        if (Instance!=null) return
        Instance=this

        logger.info(
            Component.text("ApoLib By.아포칼립스").color(TextColor.color(0xB9AAFF)).decorate(
                TextDecoration.BOLD).content())


    }

    companion object {
        lateinit var Instance:ALib
            private set
    }

    fun getInstance():ALib {
        return Instance
    }

    override fun onDisable() {
        logger.info(
            Component.text("ApoLib By.아포칼립스").color(TextColor.color(0xB9AAFF)).decorate(
                TextDecoration.BOLD).content())
    }
}
