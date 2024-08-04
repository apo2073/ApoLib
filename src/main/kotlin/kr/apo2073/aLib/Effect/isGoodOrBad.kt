package kr.apo2073.aLib.Effect

import org.bukkit.potion.PotionEffectType

fun PotionEffectType.getHarmful(): ArrayList<PotionEffectType> {
    val harmList = arrayListOf<PotionEffectType>()
    harmList.add(PotionEffectType.POISON)
    harmList.add(PotionEffectType.INSTANT_DAMAGE)
    harmList.add(PotionEffectType.WITHER)
    harmList.add(PotionEffectType.SLOWNESS)
    harmList.add(PotionEffectType.WEAKNESS)
    harmList.add(PotionEffectType.BLINDNESS)
    harmList.add(PotionEffectType.NAUSEA)
    harmList.add(PotionEffectType.MINING_FATIGUE)
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
    helpfulList.add(PotionEffectType.HASTE)
    helpfulList.add(PotionEffectType.HEALTH_BOOST)
    helpfulList.add(PotionEffectType.HERO_OF_THE_VILLAGE)
    helpfulList.add(PotionEffectType.INSTANT_HEALTH)
    helpfulList.add(PotionEffectType.INVISIBILITY)
    helpfulList.add(PotionEffectType.JUMP_BOOST)
    helpfulList.add(PotionEffectType.LUCK)
    helpfulList.add(PotionEffectType.NIGHT_VISION)
    helpfulList.add(PotionEffectType.REGENERATION)
    helpfulList.add(PotionEffectType.RESISTANCE)
    helpfulList.add(PotionEffectType.SATURATION)
    helpfulList.add(PotionEffectType.SPEED)
    helpfulList.add(PotionEffectType.SLOW_FALLING)
    helpfulList.add(PotionEffectType.STRENGTH)
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