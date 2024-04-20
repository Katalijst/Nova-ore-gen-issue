package me.katalijst.registry

import me.katalijst.OreGenIssue
import net.minecraft.world.level.levelgen.VerticalAnchor
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight
import xyz.xenondevs.nova.addon.registry.worldgen.FeatureRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.generation.ExperimentalWorldGen

@OptIn(ExperimentalWorldGen::class)
@Init(stage = InitStage.POST_PACK_PRE_WORLD)
object PlacedFeatures : FeatureRegistry by OreGenIssue.registry {
    
    val ORE_CUSTOM_ORE2 = placedFeature("ore_custom_ore2", ConfiguredFeatures.ORE_CUSTOM_ORE2)
        .count(30)
        .inSquareSpread()
        .heightRange(UniformHeight.of(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))
        .biomeFilter()
        .register()

}