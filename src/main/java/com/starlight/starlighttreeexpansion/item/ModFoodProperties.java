package com.starlight.starlighttreeexpansion.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {


    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(4).saturationModifier(2f).build();

    public static final FoodProperties CHERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(2f).build();

    public static final FoodProperties GENERIC_SEED = new FoodProperties.Builder().nutrition(1).saturationModifier(1f).build();

    public static final FoodProperties GENERIC_NUT = new FoodProperties.Builder().nutrition(2).saturationModifier(4f).build();


}
