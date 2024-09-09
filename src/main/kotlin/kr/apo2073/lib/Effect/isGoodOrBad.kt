package kr.apo2073.lib.Effect

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityPotionEffectEvent
import org.bukkit.event.entity.PotionSplashEvent
import org.bukkit.potion.PotionEffectType

fun PotionEffectType.getHarmful(): ArrayList<PotionEffectType> {
    val harmList = arrayListOf<PotionEffectType>()
    harmList.add(PotionEffectType.POISON)
    harmList.add(PotionEffectType.DAMAGE_RESISTANCE)
    harmList.add(PotionEffectType.WITHER)
    harmList.add(PotionEffectType.SLOW)
    harmList.add(PotionEffectType.WEAKNESS)
    harmList.add(PotionEffectType.BLINDNESS)
    harmList.add(PotionEffectType.CONFUSION)
    harmList.add(PotionEffectType.SLOW_DIGGING)
    harmList.add(PotionEffectType.HUNGER)
    harmList.add(PotionEffectType.LEVITATION)
    harmList.add(PotionEffectType.BAD_OMEN)
    return harmList
}

fun PotionEffectType.getHelpful(): ArrayList<PotionEffectType> {
    val helpfulList= arrayListOf<PotionEffectType>()
    helpfulList.add(PotionEffectType.ABSORPTION)
    helpfulList.add(PotionEffectType.CONDUIT_POWER)
    helpfulList.add(PotionEffectType.DOLPHINS_GRACE)
    helpfulList.add(PotionEffectType.FIRE_RESISTANCE)
    helpfulList.add(PotionEffectType.FAST_DIGGING)
    helpfulList.add(PotionEffectType.HEALTH_BOOST)
    helpfulList.add(PotionEffectType.HERO_OF_THE_VILLAGE)
    helpfulList.add(PotionEffectType.HEAL)
    helpfulList.add(PotionEffectType.INVISIBILITY)
    helpfulList.add(PotionEffectType.JUMP)
    helpfulList.add(PotionEffectType.LUCK)
    helpfulList.add(PotionEffectType.NIGHT_VISION)
    helpfulList.add(PotionEffectType.REGENERATION)
    helpfulList.add(PotionEffectType.DAMAGE_RESISTANCE)
    helpfulList.add(PotionEffectType.SATURATION)
    helpfulList.add(PotionEffectType.SPEED)
    helpfulList.add(PotionEffectType.SLOW_FALLING)
    helpfulList.add(PotionEffectType.CONDUIT_POWER)
    helpfulList.add(PotionEffectType.WATER_BREATHING)
    return helpfulList
}

fun PotionEffectType.isHarmful(): Boolean {
    val list= this.getHarmful()
    return list.contains(this)
}

fun PotionEffectType.isHelpful():Boolean {
    val list=this.getHelpful()
    return list.contains(this)
}