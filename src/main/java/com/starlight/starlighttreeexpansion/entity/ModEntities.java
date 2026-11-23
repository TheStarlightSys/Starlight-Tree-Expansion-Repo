package com.starlight.starlighttreeexpansion.entity;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.entity.custom.SeedItemEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jspecify.annotations.Nullable;

import java.util.function.Supplier;

public class ModEntities {

    public static final DeferredRegister.Entities ENTITIES = DeferredRegister.createEntities(StarlightTreeExpansion.MOD_ID);
//
//
//    public static final ResourceKey<EntityType<?>> SEED_ITEM_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
//            Identifier.fromNamespaceAndPath(StarlightTreeExpansion.MOD_ID, "seed_item"));

    public static final Supplier<EntityType<SeedItemEntity>> SEED_ITEM_ENTITY = ENTITIES.registerEntityType("seed_item_entity", new EntityType.EntityFactory<SeedItemEntity>() {
        @Override
        public @Nullable SeedItemEntity create(EntityType<SeedItemEntity> entityType, Level level) {
            return new SeedItemEntity(entityType, level);
        }
    }, MobCategory.MISC,
            t-> t.sized(0.6f, 0.6f));

//
//    public static final Supplier<EntityType<SeedItemEntity>> SEED_ITEM = ENTITIES.registerEntityType("seed_item_entity",
//            () -> EntityType.Builder.of(SeedItemEntity::new).sized(0.6f, 0.6f).build(SEED_ITEM_KEY));


    public static void register(IEventBus pEventBus){
        ENTITIES.register(pEventBus);
    }
}
