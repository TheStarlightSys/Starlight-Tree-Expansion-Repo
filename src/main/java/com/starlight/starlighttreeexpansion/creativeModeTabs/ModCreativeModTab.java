package com.starlight.starlighttreeexpansion.creativeModeTabs;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.block.ModBlocks;
import com.starlight.starlighttreeexpansion.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarlightTreeExpansion.MOD_ID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TEMPLATE_ITEMS_TAB = CREATIVE_MODE_TABS.register("starlight_materials_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CHERRY_FRUIT.get()))
                    .title(Component.translatable("creativetab.starlightmaterials.starlight_materials"))
                    .displayItems((itemDisplayParameters,output)->{


                        output.accept(ModItems.ACORN.get());

                        output.accept(ModItems.DARK_ACORN.get());

                        output.accept(ModItems.BIRCH_SEED.get());
                        output.accept(ModItems.BIRCH_CATKIN.get());

                        output.accept(ModItems.APPLE_SEED.get());

                        output.accept(ModItems.ACACIA_SEED.get());
                        output.accept(ModItems.ACACIA_SEED_POD.get());

                        output.accept(ModItems.CHERRY_FRUIT.get());
                        output.accept(ModItems.CHERRY_SEED.get());

                        output.accept(ModItems.JUNGLE_SEED.get());
                        output.accept(ModItems.JUNGLE_SEED_POD.get());

                        output.accept(ModItems.SPRUCE_PINECONE.get());
                        output.accept(ModItems.SPRUCE_SEED.get());


                        //output.accept(ModItems.MANGROVE_SEED.get());

                        output.accept(ModBlocks.APPLE_SAPLING.get());
                        output.accept(ModBlocks.APPLE_LEAVES.get());
                        output.accept(ModBlocks.APPLE_PLANKS.get());
                        output.accept(ModBlocks.APPLE_WOOD.get());
                        output.accept(ModBlocks.APPLE_LOG.get());

                        output.accept(ModBlocks.STRIPPED_APPLE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_APPLE_LOG.get());

                        output.accept(ModBlocks.APPLE_COBBLED_BLOCK.get());


                        output.accept(ModBlocks.ORANGE_SAPLING.get());
                        output.accept(ModBlocks.ORANGE_LEAVES.get());
                        output.accept(ModBlocks.ORANGE_PLANKS.get());
                        output.accept(ModBlocks.ORANGE_WOOD.get());
                        output.accept(ModBlocks.ORANGE_LOG.get());

                        output.accept(ModBlocks.STRIPPED_ORANGE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_ORANGE_LOG.get());

                        output.accept(ModItems.ORANGE_SEED.get());
                        output.accept(ModItems.ORANGE_ITEM.get());
                        output.accept(ModItems.ORANGE_PEEL.get());

                        output.accept(ModBlocks.ORANGE_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.MANGROVE_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.OAK_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.SPRUCE_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.WARPED_STEM_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.ACACIA_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.BIRCH_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.CHERRY_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.CRIMSON_STEM_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.DARK_OAK_COBBLED_BLOCK.get());
                        output.accept(ModBlocks.JUNGLE_COBBLED_BLOCK.get());


                        output.accept(ModItems.WOOD_HANDAXE.get());
                        output.accept(ModItems.ACACIA_WOOD_CHUNK.get());
                        output.accept(ModItems.BIRCH_WOOD_CHUNK.get());
                        output.accept(ModItems.DARK_OAK_WOOD_CHUNK.get());
                        output.accept(ModItems.JUNGLE_WOOD_CHUNK.get());
                        output.accept(ModItems.MANGROVE_WOOD_CHUNK.get());
                        output.accept(ModItems.OAK_WOOD_CHUNK.get());
                        output.accept(ModItems.SPRUCE_WOOD_CHUNK.get());

                        output.accept(ModItems.WARPED_STEM_CHUNK.get());
                        output.accept(ModItems.CRIMSON_STEM_CHUNK.get());

        }).build());


    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
