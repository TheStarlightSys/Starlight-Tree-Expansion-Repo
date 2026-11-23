package com.starlight.starlighttreeexpansion.worldgen;


public class ModConfiguredFeatures {
//
//    public static final ResourceKey<Feature> ORANGE_TREE_KEY = registerKey("orange_tree");
//    public static final ResourceKey<Feature> APPLE_TREE_KEY = registerKey("apple_tree");
//
//    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){
//
//
//        TreeConfiguration orangeTreeConfig = new TreeConfiguration.TreeConfigurationBuilder(
//                BlockStateProvider.simple(ModBlocks.ORANGE_LOG.get()),
//                new StraightTrunkPlacer(3,1,3),
//
//                BlockStateProvider.simple(ModBlocks.ORANGE_LEAVES.get()),
//                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
//
//                new TwoLayersFeatureSize(1, 0, 2)).build();
//
//        TreeConfiguration appleTreeConfig = new TreeConfiguration.TreeConfigurationBuilder(
//                BlockStateProvider.simple(ModBlocks.APPLE_LOG.get()),
//                new StraightTrunkPlacer(3, 1, 3),
//
//                BlockStateProvider.simple(ModBlocks.APPLE_LEAVES.get()),
//
//                new BlobFoliagePlacer(ConstantInt.of(2),ConstantInt.of(1), 3) {
//                },
//
//                new TwoLayersFeatureSize(2, 1, 2)).build();
//
//
//        context.register(ORANGE_TREE_KEY, new ConfiguredFeature<>(Feature.TREE, orangeTreeConfig));
//
//        context.register(APPLE_TREE_KEY, new ConfiguredFeature<>(Feature.TREE, appleTreeConfig));
//
//
//    }
//
//    public static ResourceKey<Feature> registerKey(String name){
//        return ResourceKey.create(Registries.FEATURE, ResouceLo.fromNamespaceAndPath(StarlightMaterials.MOD_ID, name));
//    }
//
//    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
//                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
//        context.register(key, new ConfiguredFeature<>(feature, configuration));
//    }
}