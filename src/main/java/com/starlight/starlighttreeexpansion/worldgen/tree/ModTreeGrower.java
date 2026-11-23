package com.starlight.starlighttreeexpansion.worldgen.tree;

import com.starlight.starlighttreeexpansion.worldgen.ModFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.Feature;

public class ModTreeGrower {

    public static final TreeGrower ORANGE = new TreeGrower(
            "orange_tree",
            WeightedList.<ResourceKey<Feature>>builder().add(ModFeatures.ORANGE_TREE_KEY).build(),
            WeightedList.<ResourceKey<Feature>>builder().build(),
            WeightedList.<ResourceKey<Feature>>builder().build(),
            ModFeatures.ORANGE_TREE_KEY);

    public static final TreeGrower APPLE = new TreeGrower(
            "apple_tree",
            WeightedList.<ResourceKey<Feature>>builder().add(ModFeatures.APPLE_TREE_KEY).build(),
            WeightedList.<ResourceKey<Feature>>builder().build(),
            WeightedList.<ResourceKey<Feature>>builder().build(),
            ModFeatures.APPLE_TREE_KEY);
}
