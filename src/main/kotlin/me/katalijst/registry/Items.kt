package me.katalijst.registry

import me.katalijst.OreGenIssue
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by OreGenIssue.registry {
    val CUSTOM_ORE = registerItem(Blocks.CUSTOM_ORE)
    val CUSTOM_ORE2 = registerItem(Blocks.CUSTOM_ORE2)
}