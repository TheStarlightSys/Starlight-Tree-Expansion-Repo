package com.starlight.starlighttreeexpansion.block.util;

import com.starlight.starlighttreeexpansion.block.ModBlocks;
import com.starlight.starlighttreeexpansion.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public record LeafBlockSeedData(Item pSeedItem, int pSpawnChances) {

    public static LeafBlockSeedData getSeedDataFromSheet(BlockState pState)
    {
        return LEAF_DROPS.get(pState.getBlock());
    }

    public static final Map<Block, LeafBlockSeedData> LEAF_DROPS = Map.of(
            Blocks.OAK_LEAVES, new LeafBlockSeedData(ModItems.ACORN.get(), 16),
            Blocks.SPRUCE_LEAVES,  new LeafBlockSeedData(ModItems.SPRUCE_PINECONE.get(), 32),
            Blocks.BIRCH_LEAVES,  new LeafBlockSeedData(ModItems.BIRCH_CATKIN.get(), 16),
            Blocks.JUNGLE_LEAVES,  new LeafBlockSeedData(ModItems.JUNGLE_SEED_POD.get(), 36),
            Blocks.ACACIA_LEAVES,  new LeafBlockSeedData(ModItems.ACACIA_SEED_POD.get(), 48),
            Blocks.CHERRY_LEAVES,  new LeafBlockSeedData(ModItems.CHERRY_FRUIT.get(), 24),
            ModBlocks.APPLE_LEAVES.get(),  new LeafBlockSeedData(Items.APPLE, 48),
            ModBlocks.ORANGE_LEAVES.get(),  new LeafBlockSeedData(ModItems.ORANGE_ITEM.get(), 48));
}
