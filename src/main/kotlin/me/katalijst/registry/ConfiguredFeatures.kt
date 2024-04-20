package me.katalijst.registry

import me.katalijst.OreGenIssue
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.levelgen.feature.Feature
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest
import xyz.xenondevs.nova.addon.registry.worldgen.FeatureRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.generation.ExperimentalWorldGen
import xyz.xenondevs.nova.world.generation.wrapper.WrapperBlockState

@OptIn(ExperimentalWorldGen::class)
@Init(stage = InitStage.POST_PACK_PRE_WORLD)
object ConfiguredFeatures : FeatureRegistry by OreGenIssue.registry {
    
    val ORE_CUSTOM_ORE2 = registerConfiguredFeature(
        "ore_custom_ore2",
        Feature.ORE,
        OreConfiguration(
            listOf(
                OreConfiguration.target(
                    TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                    WrapperBlockState(Blocks.CUSTOM_ORE2)
                )
            ),
            4,
            0.0f
        )
    )
}
