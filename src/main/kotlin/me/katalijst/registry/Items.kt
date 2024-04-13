package me.katalijst.registry

import fr.ateastudio.NovaAdventureCraft
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.item.behavior.Damageable
import xyz.xenondevs.nova.item.behavior.Enchantable
import xyz.xenondevs.nova.item.behavior.Tool

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by OreGenIssue.registry {
    val CUSTOM_ORE = registerItem(Blocks.CUSTOM_ORE)
    val CUSTOM_ORE2 = registerItem(Blocks.CUSTOM_ORE2)
}