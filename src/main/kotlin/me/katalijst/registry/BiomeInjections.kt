package me.katalijst.registry

import fr.ateastudio.NovaAdventureCraft
import net.minecraft.tags.BiomeTags
import net.minecraft.world.level.levelgen.GenerationStep.Decoration
import xyz.xenondevs.nova.addon.registry.worldgen.BiomeRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.generation.ExperimentalWorldGen

@OptIn(ExperimentalWorldGen::class)
@Init(stage = InitStage.POST_PACK_PRE_WORLD)
object BiomeInjections : BiomeRegistry by OreGenIssue.registry {
    
    private val OVERWORLD = biomeInjection("overworld")
        .biomes(BiomeTags.IS_OVERWORLD)
        .feature(Decoration.UNDERGROUND_ORES, PlacedFeatures.ORE_CUSTOM_ORE2)
        .register()
    
}
