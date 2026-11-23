package com.starlight.starlighttreeexpansion.block;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.block.custom.SeedlingBlock;
import com.starlight.starlighttreeexpansion.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StarlightTreeExpansion.MOD_ID);


    //common properties
    private static final float lowStrength = 0.5f;
    private static final float stdStrength = 1.5f;
    private static final float highStrength = 2f;
    private static final float deepslateStrength = 3f;
    private static final float lowExplosionResist = 0.5f;
    private static final float stdExplosionResist = 1.5f;
    private static final float highExplosionResist = 3f;
    private static final float deepslateExplosionResist = 3f;
    private static final float cannotBreakBlock = -1f;
    private static final float explosionCannotDestroy = 3600000.0f;



    public static final DeferredBlock<Block> APPLE_COBBLED_BLOCK = BLOCKS.registerSimpleBlock("apple_cobbled_block",
            ()->BlockBehaviour.Properties.of().strength(stdStrength, stdExplosionResist).requiresCorrectToolForDrops().sound(SoundType.WOOD));

    public static final DeferredBlock<Block> ORANGE_COBBLED_BLOCK = registerFuelBlock("orange_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> MANGROVE_COBBLED_BLOCK = registerFuelBlock("mangrove_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> OAK_COBBLED_BLOCK = registerFuelBlock("oak_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> SPRUCE_COBBLED_BLOCK = registerFuelBlock("spruce_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> WARPED_STEM_COBBLED_BLOCK = registerFuelBlock("warped_stem_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STEM)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> ACACIA_COBBLED_BLOCK = registerFuelBlock("acacia_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> BIRCH_COBBLED_BLOCK = registerFuelBlock("birch_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> CHERRY_COBBLED_BLOCK = registerFuelBlock("cherry_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> CRIMSON_STEM_COBBLED_BLOCK = registerFuelBlock("crimson_stem_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STEM)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> DARK_OAK_COBBLED_BLOCK = registerFuelBlock("dark_oak_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> JUNGLE_COBBLED_BLOCK = registerFuelBlock("jungle_cobbled_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(stdStrength, stdExplosionResist)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> ORANGE_LOG = registerFuelBlock("orange_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> ORANGE_WOOD = registerFuelBlock("orange_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ORANGE_LOG = registerFuelBlock("stripped_orange_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ORANGE_WOOD = registerFuelBlock("stripped_orange_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> ORANGE_PLANKS = registerFuelBlock("orange_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
            {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;

                }
            }, ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<RotatedPillarBlock> APPLE_LOG = registerFuelBlock("apple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> APPLE_WOOD = registerFuelBlock("apple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_APPLE_LOG = registerFuelBlock("stripped_apple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_APPLE_WOOD = registerFuelBlock("stripped_apple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);

    public static final DeferredBlock<Block> APPLE_PLANKS = registerFuelBlock("apple_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
            {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;

                }
            }, ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


    public static final DeferredBlock<Block> ORANGE_LEAVES = registerFuelBlock("orange_leaves",
            () -> new TintedParticleLeavesBlock(0.01f, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;

                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL);

    public static final DeferredBlock<Block> APPLE_LEAVES = registerFuelBlock("apple_leaves",
            () -> new TintedParticleLeavesBlock(0.01f, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL);


    public static final DeferredBlock<Block> ORANGE_SAPLING = registerBlock("orange_sapling",
            () -> new SaplingBlock(ModTreeGrower.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));


    public static final DeferredBlock<Block> JUNGLE_SEEDLING = registerFuelBlock("jungle_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 12;
                }
                @Override
                public float getMinTemperature()
                {
                    return 0.8f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.JUNGLE_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);



    public static final DeferredBlock<Block> ACACIA_SEEDLING = registerFuelBlock("acacia_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollision().noLootTable()
                    )
            {
                @Override
                public int getMinLightLevel()
                {
                    return 10;
                }
                @Override
                public float getMinTemperature()
                {
                    return 0.6f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.ACACIA_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);

    public static final DeferredBlock<Block> ORANGE_SEEDLING = registerFuelBlock("orange_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 12;
                }
                @Override
                public float getMinTemperature()
                {
                    return 0.75f;
                }
                @Override
                public Block getSapling()
                {
                    return ModBlocks.ORANGE_SAPLING.get();
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);

    public static final DeferredBlock<Block> SPRUCE_SEEDLING = registerFuelBlock("spruce_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 7;
                }
                @Override
                public float getMinTemperature()
                {
                    return -1f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.SPRUCE_SAPLING;
                }
                @Override
                protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
                    return pState.is(BlockTags.DIRT) || pState.is(Blocks.FARMLAND) || pState.is(Blocks.PODZOL);
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);

    public static final DeferredBlock<Block> BIRCH_SEEDLING = registerFuelBlock("birch_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 7;
                }
                @Override
                public float getMinTemperature()
                {
                    return -0.5f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.BIRCH_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);

    public static final DeferredBlock<Block> CHERRY_SEEDLING = registerFuelBlock("cherry_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 8;
                }
                @Override
                public float getMinTemperature()
                {
                    return -0.5f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.CHERRY_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);


    public static final DeferredBlock<Block> OAK_SEEDLING = registerFuelBlock("oak_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 7;
                }
                @Override
                public float getMinTemperature()
                {
                    return -0.5f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.OAK_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);

    public static final DeferredBlock<Block> DARK_OAK_SEEDLING = registerFuelBlock("dark_oak_seedling",
            () -> new SeedlingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
                    .noCollision().noLootTable())
            {
                @Override
                public int getMinLightLevel()
                {
                    return 5;
                }
                @Override
                public float getMinTemperature()
                {
                    return -1f;
                }
                @Override
                public Block getSapling()
                {
                    return Blocks.DARK_OAK_SAPLING;
                }
            }, ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL);


    public static final DeferredBlock<Block> APPLE_SAPLING = registerFuelBlock("apple_sapling",
            () -> new SaplingBlock(ModTreeGrower.APPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));



    public static void register(IEventBus pEventBus){
        BLOCKS.register(pEventBus);
    }


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T>block){
        DeferredBlock<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    private static <T extends Block> DeferredBlock<T> registerFuelBlock(String name, Supplier<T> block, ResourceKey<ContextIntProvider>  burnTime){
        DeferredBlock<T> toReturn = BLOCKS.register(name,block);

        registerFuelBlockItem(name, toReturn, burnTime);
        return toReturn;
    }
    private static <T extends Block> void registerFuelBlockItem(String name, DeferredBlock<T> block, ResourceKey<ContextIntProvider> burnTime) {

        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().cookingFuel(burnTime)));
    }
}
