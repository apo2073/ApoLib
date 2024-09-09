package kr.apo2073.lib.Items

import org.bukkit.Material
import org.bukkit.inventory.ItemStack


fun ItemStack.isEnchantable(): Boolean {
    if (this.isArmor()) return true
    if (this.isStuff()) return true
    return false
}

fun ItemStack.isStuffOrArmor(): Boolean {
    if (this.isArmor()) return true
    if (this.isStuff()) return true
    return false
}

fun ItemStack.isSkull():Boolean {
    return if (this.type==Material.PLAYER_HEAD || this.type==Material.PLAYER_WALL_HEAD) true
    else false
}

fun ItemStack.isArmor(): Boolean {
    val material = this.type
    if (material == Material.LEATHER_BOOTS) return true
    if (material == Material.LEATHER_LEGGINGS) return true
    if (material == Material.LEATHER_CHESTPLATE) return true
    if (material == Material.LEATHER_HELMET) return true
    if (material == Material.IRON_BOOTS) return true
    if (material == Material.IRON_LEGGINGS) return true
    if (material == Material.IRON_CHESTPLATE) return true
    if (material == Material.IRON_HELMET) return true
    if (material == Material.GOLDEN_BOOTS) return true
    if (material == Material.GOLDEN_LEGGINGS) return true
    if (material == Material.GOLDEN_CHESTPLATE) return true
    if (material == Material.GOLDEN_HELMET) return true
    if (material == Material.DIAMOND_BOOTS) return true
    if (material == Material.DIAMOND_LEGGINGS) return true
    if (material == Material.DIAMOND_CHESTPLATE) return true
    if (material == Material.DIAMOND_HELMET) return true
    if (material == Material.NETHERITE_BOOTS) return true
    if (material == Material.NETHERITE_LEGGINGS) return true
    if (material == Material.NETHERITE_CHESTPLATE) return true
    if (material == Material.NETHERITE_HELMET) return true
    return false
}

fun ItemStack.isHelmet(): Boolean {
    val material = this.type
    if (material == Material.LEATHER_HELMET) return true
    if (material == Material.IRON_HELMET) return true
    if (material == Material.GOLDEN_HELMET) return true
    if (material == Material.DIAMOND_HELMET) return true
    if (material == Material.NETHERITE_HELMET) return true
    return false
}

fun ItemStack.isChestplate(): Boolean {
    val material = this.type
    if (material == Material.LEATHER_CHESTPLATE) return true
    if (material == Material.IRON_CHESTPLATE) return true
    if (material == Material.GOLDEN_CHESTPLATE) return true
    if (material == Material.DIAMOND_CHESTPLATE) return true
    if (material == Material.NETHERITE_CHESTPLATE) return true
    return false
}

fun ItemStack.isLeggings(): Boolean {
    val material = this.type
    if (material == Material.LEATHER_LEGGINGS) return true
    if (material == Material.IRON_LEGGINGS) return true
    if (material == Material.GOLDEN_LEGGINGS) return true
    if (material == Material.DIAMOND_LEGGINGS) return true
    if (material == Material.NETHERITE_LEGGINGS) return true
    return false
}

fun ItemStack.isBoots(): Boolean {
    val material = this.type
    if (material == Material.LEATHER_BOOTS) return true
    if (material == Material.IRON_BOOTS) return true
    if (material == Material.GOLDEN_BOOTS) return true
    if (material == Material.DIAMOND_BOOTS) return true
    if (material == Material.NETHERITE_BOOTS) return true
    return false
}
fun ItemStack.isStuff(): Boolean {
    val material = this.type
    if (material == Material.WOODEN_SWORD) return true
    if (material == Material.STONE_SWORD) return true
    if (material == Material.IRON_SWORD) return true
    if (material == Material.GOLDEN_SWORD) return true
    if (material == Material.DIAMOND_SWORD) return true
    if (material == Material.NETHERITE_SWORD) return true

    if (material == Material.WOODEN_AXE) return true
    if (material == Material.STONE_AXE) return true
    if (material == Material.IRON_AXE) return true
    if (material == Material.GOLDEN_AXE) return true
    if (material == Material.DIAMOND_AXE) return true
    if (material == Material.NETHERITE_AXE) return true

    if (material == Material.WOODEN_PICKAXE) return true
    if (material == Material.STONE_PICKAXE) return true
    if (material == Material.IRON_PICKAXE) return true
    if (material == Material.GOLDEN_PICKAXE) return true
    if (material == Material.DIAMOND_PICKAXE) return true
    if (material == Material.NETHERITE_PICKAXE) return true

    if (material == Material.WOODEN_SHOVEL) return true
    if (material == Material.STONE_SHOVEL) return true
    if (material == Material.IRON_SHOVEL) return true
    if (material == Material.GOLDEN_SHOVEL) return true
    if (material == Material.DIAMOND_SHOVEL) return true

    if (material == Material.NETHERITE_SHOVEL) return true
    if (material == Material.WOODEN_HOE) return true
    if (material == Material.STONE_HOE) return true
    if (material == Material.IRON_HOE) return true
    if (material == Material.GOLDEN_HOE) return true
    if (material == Material.DIAMOND_HOE) return true
    if (material == Material.NETHERITE_HOE) return true

    if (material == Material.FISHING_ROD) return true
    if (material == Material.BOW) return true
    if (material == Material.CROSSBOW) return true
    if (material == Material.TRIDENT) return true
    if (material == Material.FLINT_AND_STEEL) return true
    if (material == Material.SHEARS) return true
    //if (material== Material.MACE) return true
    return false
}