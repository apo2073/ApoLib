package kr.apo2073.lib.Plugins

import io.papermc.paper.plugin.PermissionManager
import net.kyori.adventure.permission.PermissionChecker
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.event.HoverEventSource
import org.bukkit.command.CommandSender
import org.bukkit.permissions.Permission

class PermissionMessenger {
    private lateinit var per: Permission
    private lateinit var perm:String
    private var sender: CommandSender
    constructor(sender: CommandSender, permission: Permission) {
        this.sender=sender
        this.per=permission
        if (sender.hasPermission(per)) return
        sender.sendMessage(
            Component.text("§l[§c*§f]§r 명령어를 실행할 권한이 없습니다.")
                .hoverEvent(HoverEventSource {
                    HoverEvent.showText(Component.text("§l[ 권한 :: §c${per.name} §f]"))
                })
        )
    }
    constructor(sender: CommandSender, permission: String) {
        this.sender=sender
        this.perm=permission
        if (sender.hasPermission(perm)) return
        sender.sendMessage(
            Component.text("§l[§c*§f]§r 명령어를 실행할 권한이 없습니다.")
            .hoverEvent(HoverEventSource {
                HoverEvent.showText(Component.text("§l[ 권한 :: §c${perm} §f]"))
            })
        )
    }
}