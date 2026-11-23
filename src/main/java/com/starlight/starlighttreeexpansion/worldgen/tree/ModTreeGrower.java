package com.starlight.starlighttreeexpansion.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrower {

    public static final TreeGrower ORANGE = new TreeGrower(
            "orange_tree",
            0F,
            Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY),
            Optional.empty(),
            Optional.empty()
    );
    public static final TreeGrower APPLE = new TreeGrower(
            "apple_tree",
            0F,
            Optional.of(ModConfiguredFeatures.APPLE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.APPLE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.APPLE_TREE_KEY),
            Optional.of(ModConfiguredFeatures.APPLE_TREE_KEY),
            Optional.empty(),
            Optional.empty()
    );
}
