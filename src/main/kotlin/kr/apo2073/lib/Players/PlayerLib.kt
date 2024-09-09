package kr.apo2073.lib.Players

import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

fun Player.isInventoryFull(): Boolean {
    return this.inventoryIsFull()
}
fun Player.inventoryIsFull(): Boolean {
    val inv: Inventory = this.inventory
    for (slot in inv.contents) {
        if (slot == null) return false
        if (!slot.type.isAir) continue
        if (slot.amount < slot.maxStackSize) return false
    }
    return true
}