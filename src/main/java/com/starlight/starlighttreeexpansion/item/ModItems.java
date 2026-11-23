package com.starlight.starlighttreeexpansion.item;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.item.custom.SeedItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StarlightTreeExpansion.MOD_ID);

    public static final DeferredItem<Item>ORANGE_PEEL = ITEMS.registerSimpleItem("orange_peel_item");

    public static final DeferredItem<Item>CHERRY_SEED = ITEMS.register("cherry_seed",
            () -> new SeedItem(new Item.Properties()));

    public static final DeferredItem<Item> ACORN = ITEMS.register("acorn",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_NUT)));

    public static final DeferredItem<Item> DARK_ACORN = ITEMS.register("dark_acorn",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_NUT)));

    public static final DeferredItem<Item> BIRCH_SEED = ITEMS.register("birch_seed",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_SEED)));

    public static final DeferredItem<Item> BIRCH_CATKIN = ITEMS.registerSimpleItem("birch_catkin");

    public static final DeferredItem<Item> APPLE_SEED = ITEMS.register("apple_seed",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_SEED)));

    public static final DeferredItem<Item>  ACACIA_SEED = ITEMS.register("acacia_seed",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_SEED)));

    public static final DeferredItem<Item> ACACIA_SEED_POD = ITEMS.registerSimpleItem("acacia_seed_pod");

    public static final DeferredItem<Item> CHERRY_FRUIT = ITEMS.register("cherry_fruit",
            () -> new Item( new Item.Properties().food(ModFoodProperties.CHERRY)));

    public static final DeferredItem<Item> ORANGE_ITEM = ITEMS.register("orange_item",
            () -> new Item( new Item.Properties().food(ModFoodProperties.ORANGE).usingConvertsTo(ModItems.ORANGE_PEEL.get())));

    public static final DeferredItem<Item> ORANGE_SEED = ITEMS.register("orange_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_SEED)));

    public static final DeferredItem<Item> JUNGLE_SEED = ITEMS.register("jungle_seed",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_NUT)));

    public static final DeferredItem<Item> JUNGLE_SEED_POD = ITEMS.registerSimpleItem("jungle_seed_pod");

    public static final DeferredItem<Item> SPRUCE_PINECONE = ITEMS.registerSimpleItem("spruce_pinecone");

    public static final DeferredItem<Item> SPRUCE_SEED = ITEMS.register("spruce_seed",
            () -> new SeedItem( new Item.Properties().food(ModFoodProperties.GENERIC_SEED)));




    //stem chunks
    public static final DeferredItem<Item> WARPED_STEM_CHUNK = ITEMS.register("warped_stem_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_STEM_CHUNK = ITEMS.register("crimson_stem_chunk", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WOOD_HANDAXE = ITEMS.register("wood_handaxe", () -> new Item(new Item.Properties().axe(ToolMaterial.WOOD, 5, -3.0f).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)));

    //wood chunks

    public static final DeferredItem<Item> ACACIA_WOOD_CHUNK = ITEMS.register("acacia_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> BIRCH_WOOD_CHUNK = ITEMS.register("birch_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));

    public static final DeferredItem<Item> CHERRY_WOOD_CHUNK = ITEMS.register("cherry_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> DARK_OAK_WOOD_CHUNK = ITEMS.register("dark_oak_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> JUNGLE_WOOD_CHUNK = ITEMS.register("jungle_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> MANGROVE_WOOD_CHUNK = ITEMS.register("mangrove_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> OAK_WOOD_CHUNK = ITEMS.register("oak_wood_chunk",  () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> SPRUCE_WOOD_CHUNK = ITEMS.register("spruce_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> ORANGE_WOOD_CHUNK = ITEMS.register("orange_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));
    public static final DeferredItem<Item> APPLE_WOOD_CHUNK = ITEMS.register("apple_wood_chunk", () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL)));


    public static void register(IEventBus pEventBus){
        ITEMS.register(pEventBus);
    }
}
