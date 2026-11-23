package com.starlight.starlighttreeexpansion.item;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.item.custom.SeedItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
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
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_SEED).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "cherry_seed")))));

    public static final DeferredItem<Item> ACORN = ITEMS.register("acorn",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "acorn")))));

    public static final DeferredItem<Item> DARK_ACORN = ITEMS.register("dark_acorn",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "dark_acorn")))));

    public static final DeferredItem<Item> BIRCH_SEED = ITEMS.register("birch_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "birch_seed")))));

    public static final DeferredItem<Item> BIRCH_CATKIN = ITEMS.registerSimpleItem("birch_catkin");

    public static final DeferredItem<Item> APPLE_SEED = ITEMS.register("apple_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "apple_seed")))));

    public static final DeferredItem<Item>  ACACIA_SEED = ITEMS.register("acacia_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "acacia_seed")))));


    public static final DeferredItem<Item> ACACIA_SEED_POD = ITEMS.registerSimpleItem("acacia_seed_pod");

    public static final DeferredItem<Item> CHERRY_FRUIT = ITEMS.register("cherry_fruit",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "cherry_fruit")))));


    public static final DeferredItem<Item> ORANGE_ITEM = ITEMS.register("orange_item",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "orange_item")))));


    public static final DeferredItem<Item> ORANGE_SEED = ITEMS.register("orange_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "orange_seed")))));


    public static final DeferredItem<Item> JUNGLE_SEED = ITEMS.register("jungle_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "jungle_seed")))));


    public static final DeferredItem<Item> JUNGLE_SEED_POD = ITEMS.registerSimpleItem("jungle_seed_pod");

    public static final DeferredItem<Item> SPRUCE_PINECONE = ITEMS.registerSimpleItem("spruce_pinecone");

    public static final DeferredItem<Item> SPRUCE_SEED = ITEMS.register("spruce_seed",
            () -> new SeedItem(new Item.Properties().food(ModFoodProperties.GENERIC_NUT).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "spruce_seed")))));



    //stem chunks
    public static final DeferredItem<Item> WARPED_STEM_CHUNK = ITEMS.register("warped_stem_chunk",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "warped_stem_chunk")))));

    public static final DeferredItem<Item> CRIMSON_STEM_CHUNK = ITEMS.register("crimson_stem_chunk",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "crimson_stem_chunk")))));

    public static final DeferredItem<Item> WOOD_HANDAXE = ITEMS.register("wood_handaxe", () -> new Item(new Item.Properties().axe(ToolMaterial.WOOD, 5, -3.0f)
            .cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "wood_handaxe")))));

    //wood chunks
    public static final DeferredItem<Item> ACACIA_WOOD_CHUNK = ITEMS.register("acacia_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "acacia_wood_chunk")))));

    public static final DeferredItem<Item> BIRCH_WOOD_CHUNK = ITEMS.register("birch_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "birch_wood_chunk")))));

    public static final DeferredItem<Item> CHERRY_WOOD_CHUNK = ITEMS.register("cherry_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "cherry_wood_chunk")))));

    public static final DeferredItem<Item> DARK_OAK_WOOD_CHUNK = ITEMS.register("dark_oak_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "dark_oak_wood_chunk")))));

    public static final DeferredItem<Item> JUNGLE_WOOD_CHUNK = ITEMS.register("jungle_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "jungle_wood_chunk")))));

    public static final DeferredItem<Item> MANGROVE_WOOD_CHUNK = ITEMS.register("mangrove_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "mangrove_wood_chunk")))));

    public static final DeferredItem<Item> OAK_WOOD_CHUNK = ITEMS.register("oak_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "oak_wood_chunk")))));

    public static final DeferredItem<Item> SPRUCE_WOOD_CHUNK = ITEMS.register("spruce_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "spruce_wood_chunk")))));

    public static final DeferredItem<Item> ORANGE_WOOD_CHUNK = ITEMS.register("orange_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "orange_wood_chunk")))));

    public static final DeferredItem<Item> APPLE_WOOD_CHUNK = ITEMS.register("apple_wood_chunk",
            () -> new Item(new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_SMALL).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "apple_wood_chunk")))));


    public static void register(IEventBus pEventBus){
        ITEMS.register(pEventBus);
    }
}
