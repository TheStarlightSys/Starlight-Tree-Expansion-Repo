package com.starlight.starlighttreeexpansion.datagen;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.block.ModBlocks;
import com.starlight.starlighttreeexpansion.block.custom.SeedlingBlock;
import com.starlight.starlighttreeexpansion.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, StarlightTreeExpansion.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        //block models
        blockModels.createTrivialCube(ModBlocks.APPLE_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ORANGE_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MANGROVE_COBBLED_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.OAK_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.SPRUCE_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.WARPED_STEM_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ACACIA_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.BIRCH_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CHERRY_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CRIMSON_STEM_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DARK_OAK_COBBLED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.JUNGLE_COBBLED_BLOCK.get());


        blockModels.woodProvider(ModBlocks.STRIPPED_APPLE_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_APPLE_LOG.get()).wood(ModBlocks.STRIPPED_APPLE_WOOD.get());
        blockModels.woodProvider(ModBlocks.APPLE_LOG.get()).logWithHorizontal(ModBlocks.APPLE_LOG.get()).wood(ModBlocks.APPLE_WOOD.get());

        blockModels.woodProvider(ModBlocks.STRIPPED_ORANGE_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_ORANGE_LOG.get()).wood(ModBlocks.STRIPPED_ORANGE_WOOD.get());
        blockModels.woodProvider(ModBlocks.ORANGE_LOG.get()).logWithHorizontal(ModBlocks.ORANGE_LOG.get()).wood(ModBlocks.ORANGE_WOOD.get());

        blockModels.createTrivialCube(ModBlocks.ORANGE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.APPLE_PLANKS.get());
        blockModels.createTintedLeaves(ModBlocks.ORANGE_LEAVES.get(), TexturedModel.LEAVES, -12012264);
        blockModels.createTintedLeaves(ModBlocks.APPLE_LEAVES.get(), TexturedModel.LEAVES, -12012264);

        blockModels.createCrossBlockWithDefaultItem(ModBlocks.ORANGE_SAPLING.get(), BlockModelGenerators.PlantType.TINTED);
        blockModels.createCrossBlockWithDefaultItem(ModBlocks.APPLE_SAPLING.get(), BlockModelGenerators.PlantType.TINTED);

        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.CHERRY_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.JUNGLE_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.ACACIA_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.ORANGE_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.SPRUCE_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.BIRCH_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.OAK_SEEDLING.get());
        this.createSeedlingBlockBlockNoItem(blockModels, ModBlocks.DARK_OAK_SEEDLING.get());

        //item models
        itemModels.generateFlatItem(ModItems.CHERRY_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CHERRY_FRUIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ACORN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DARK_ACORN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BIRCH_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BIRCH_CATKIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.APPLE_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ACACIA_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ACACIA_SEED_POD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ORANGE_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ORANGE_PEEL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ORANGE_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.JUNGLE_SEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.JUNGLE_SEED_POD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SPRUCE_PINECONE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SPRUCE_SEED.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.WOOD_HANDAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.ACACIA_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BIRCH_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CHERRY_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DARK_OAK_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.JUNGLE_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MANGROVE_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OAK_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SPRUCE_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ORANGE_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.APPLE_WOOD_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WARPED_STEM_CHUNK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRIMSON_STEM_CHUNK.get(), ModelTemplates.FLAT_ITEM);

    }
    public void createSeedlingBlockBlockNoItem(BlockModelGenerators blockModels, Block block) {
        BlockModelGenerators.PlantType plantType = BlockModelGenerators.PlantType.TINTED;

       Property<Integer> ageProperty = SeedlingBlock.AGE;

        int[] stages = {0, 1, 2, 3, 4, 5, 6, 7};

       if (ageProperty.getPossibleValues().size() != stages.length)
        {
            throw new IllegalArgumentException("missing values for property: " + String.valueOf(ageProperty));
        } else
        {
            blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block)
                    .with(PropertyDispatch.initial(ageProperty).generate((i) -> {
                        int var10000 = stages[i];
                        String suffix = "_stage_" + var10000;
                        TextureMapping texture = TextureMapping.cross(TextureMapping.getBlockTexture(block, suffix));
                        return plainVariant(plantType.getCross().createWithSuffix(block, suffix, texture, blockModels.modelOutput));
                    })));
        }
    }
    public void createNonSimpleBlock(BlockModelGenerators blockModels, Block block, String textureName) {

        TexturedModel.Provider provider = new TexturedModel.Provider() {
            @Override
            public TexturedModel get(Block block) {
                Material material = new Material(Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "block/" + textureName));
                return TexturedModel.createAllSame(material);
            }
        };
        blockModels.createTrivialBlock(block, provider);
    }
}