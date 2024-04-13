package me.katalijst.registry

import fr.ateastudio.NovaAdventureCraft
import fr.ateastudio.registry.ore.AzuriteOre
import fr.ateastudio.registry.ore.EnderiteOre
import fr.ateastudio.registry.ore.NetheriteOre
import fr.ateastudio.registry.ore.OceaniteOre
import fr.ateastudio.registry.ore.RubyOre
import fr.ateastudio.registry.ore.UraniumOre
import org.bukkit.Material
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.item.options.BlockOptions
import xyz.xenondevs.nova.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.item.tool.VanillaToolTiers
import xyz.xenondevs.nova.world.block.sound.SoundGroup

@Init(stage = InitStage.PRE_PACK)
object Blocks : BlockRegistry by OreGenIssue.registry {
    // Block options
    private val DIAMOND_BLOCK = BlockOptions(5.0, VanillaToolCategories.PICKAXE, VanillaToolTiers.IRON, true, SoundGroup.STONE, Material.STONE)
    val CUSTOM_ORE = block("custom_ore").blockOptions(DIAMOND_BLOCK).register()
    val CUSTOM_ORE2 = block("custom_ore2").blockOptions(DIAMOND_BLOCK).register()
    
}