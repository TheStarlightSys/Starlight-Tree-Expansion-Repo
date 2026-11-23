package com.starlight.starlighttreeexpansion.worldgen;


import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModFeatures {

    public static final ResourceKey<Feature> ORANGE_TREE_KEY = registerKey("orange_tree");
    public static final ResourceKey<Feature> APPLE_TREE_KEY = registerKey("apple_tree");

    public static void bootstrap(BootstrapContext<Feature> context){


        TreeFeature orangeTreeConfig = new TreeFeature.Builder(
                BlockStateProvider.of(ModBlocks.ORANGE_LOG.get()),
                        new StraightTrunkPlacer(3, 1, 2),

                        BlockStateProvider.of(ModBlocks.ORANGE_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3), new TwoLayersFeatureSize(1, 0, 2), null
                        ).build();

        TreeFeature appleTreeConfig = new TreeFeature.Builder(
                BlockStateProvider.of(ModBlocks.APPLE_LOG.get()),
                new StraightTrunkPlacer(2, 1, 2),

                BlockStateProvider.of(ModBlocks.APPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(1, 0, 2), null
        ).build();


        context.register(ORANGE_TREE_KEY, orangeTreeConfig);
        context.register(APPLE_TREE_KEY, appleTreeConfig);

        }

    public static ResourceKey<Feature> registerKey(String name){
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, name));
    }
}