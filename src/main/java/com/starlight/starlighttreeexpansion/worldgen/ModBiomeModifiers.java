package com.starlight.starlighttreeexpansion.worldgen;


import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
//
//
//    public static final ResourceKey<BiomeModifier> ADD_ORANGE_TREE = registerKey("add_orange_tree");
//    public static final ResourceKey<BiomeModifier> ADD_APPLE_TREE = registerKey("add_apple_tree");
//
//
//    public static void bootstrap(BootstrapContext<BiomeModifier> context){
//        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
//        var biomes = context.lookup(Registries.BIOME);
//
//
//        context.register(ADD_ORANGE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//               HolderSet.direct(
//                       biomes.getOrThrow(Biomes.FOREST),
//                       biomes.getOrThrow(Biomes.FLOWER_FOREST),
//                        biomes.getOrThrow(Biomes.SAVANNA),
//                        biomes.getOrThrow(Biomes.SAVANNA_PLATEAU),
//                        biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA),
//                        biomes.getOrThrow(Biomes.JUNGLE)),
//                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ORANGE_TREE_PLACED_KEY)),
//                GenerationStep.Decoration.VEGETAL_DECORATION));
//
//        context.register(ADD_APPLE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//               HolderSet.direct(
//                       biomes.getOrThrow(Biomes.FOREST),
//                       biomes.getOrThrow(Biomes.FLOWER_FOREST),
//                        biomes.getOrThrow(Biomes.SAVANNA),
//                        biomes.getOrThrow(Biomes.SAVANNA_PLATEAU),
//                        biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA),
//                        biomes.getOrThrow(Biomes.JUNGLE)),
//                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.APPLE_TREE_PLACED_KEY)),
//                GenerationStep.Decoration.VEGETAL_DECORATION));
//
//    }
//
//    private static ResourceKey<BiomeModifier> registerKey(String name){
//        return ResourceKey.create(NeoForgeRegistries.BIOME_MODIFIER_SERIALIZERS, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, name));
//    }
}
