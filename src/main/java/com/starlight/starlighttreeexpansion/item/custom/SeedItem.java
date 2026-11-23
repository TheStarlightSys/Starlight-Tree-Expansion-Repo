package com.starlight.starlighttreeexpansion.item.custom;

import com.starlight.starlighttreeexpansion.entity.custom.SeedItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class SeedItem extends Item {

    public SeedItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hasCustomEntity(ItemStack stack) {
        return true;
    }

    @Override
    public @Nullable Entity createEntity(Level level, Entity location, ItemStack stack) {

        return new SeedItemEntity(level, location.position().x, location.position().y, location.position().z, stack);
    }
}
