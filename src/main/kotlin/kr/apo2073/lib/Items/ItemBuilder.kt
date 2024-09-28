package kr.apo2073.lib.Items

import kr.apo2073.lib.Plugins.txt
import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta
import org.bukkit.inventory.meta.SkullMeta

class ItemBuilder {
    private var material:Material
    private var amount: Int = 1
    constructor(material: Material, amount: Int=1) {
        this.material=material
        this.amount=amount
        this.item=ItemStack(material, amount)
        this.meta=this.item.itemMeta
    }
    constructor(itemStack: ItemStack) {
        this.material=itemStack.type
        this.item=itemStack
        this.meta=this.item.itemMeta
    }
    private var item:ItemStack
    private var meta:ItemMeta

    fun setDisplayName(displayName: String):ItemBuilder {
        meta.displayName(txt(displayName.replace("&","§")))
        return this
    }

    fun setItemName(itemName: Component): ItemBuilder {
        meta.displayName(itemName)
        return this
    }

    fun setLore(lore:List<String>):ItemBuilder {
        meta.lore=lore
        return this
    }

    fun setDescription(lore:List<Component>):ItemBuilder {
        meta.lore(lore)
        return this
    }

    fun setAmount(amount:Int):ItemBuilder {
        item.amount=amount
        return this
    }

    fun setCustomModelData(customModelData:Int):ItemBuilder {
        meta.setCustomModelData(customModelData)
        return this
    }

    /*
    fun setMaxStackSize(stack:Int):ItemBuilder {
        meta.setMaxStackSize(stack)
        return this
    }

    fun setRarity(rarity: ItemRarity):ItemBuilder {
        meta.setRarity(rarity)
        return this
    }

     */

    fun addEnchantment(enchantment: Enchantment, level:Int, boolean: Boolean):ItemBuilder {
        meta.addEnchant(enchantment,level,boolean)
        return this
    }

    fun addItemFlag(flag: ItemFlag):ItemBuilder {
        meta.addItemFlags(flag)
        return this
    }

    fun setUnbreakable(unBreakable:Boolean):ItemBuilder {
        meta.isUnbreakable=unBreakable
        return this
    }

    fun setOwner(owner: String):ItemBuilder {
        if (!item.isSkull()) return this
        val skull:SkullMeta=meta as SkullMeta
        skull.setOwningPlayer(Bukkit.getPlayer(owner))
        return this
    }

    fun setMaterial(material: Material):ItemBuilder {
        item.type=material
        return this
    }

    fun build():ItemStack {
        item.itemMeta=meta
        return item
    }
    fun apply(): ItemStack {
        item.itemMeta=meta
        return item
    }
}

fun ItemStack.asItemBuilder():ItemBuilder {
    return ItemBuilder(this)
}