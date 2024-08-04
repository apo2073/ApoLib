package kr.apo2073.aLib.Inventorys

import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

fun Inventory.isFull():Boolean {
    val inv: Inventory = this
    for (slot in inv.contents) {
        if (slot == null) return false
        if (!slot.type.isAir) continue
        if (slot.amount < slot.maxStackSize) return false
    }
    return true
}

infix fun Inventory.add(item:ItemStack) {
    this.addItem(item)
}

fun Inventory.take(item: ItemStack, amount:Int) {
    for (i in this.contents) {
        if (i==null) continue
        if (i.type == item.type) {
            i.amount-=amount
            break
        }
    }
}
