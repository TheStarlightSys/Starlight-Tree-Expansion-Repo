package com.starlight.starlighttreeexpansion.item.custom;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.entity.custom.SeedItemEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import static com.starlight.starlighttreeexpansion.entity.custom.SeedItemEntity.SEED_SAPLING_MAP;

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

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        BlockPos pos = context.getClickedPos();
        Level level = context.getLevel();
        BlockState state = level.getBlockState(pos);


        if(attemptSeedPlanting(pos, level, state)) {
            context.getItemInHand().consume(1, context.getPlayer());
            return InteractionResult.CONSUME;
        }
        else
        {
            return InteractionResult.PASS;
        }
    }
    public boolean attemptSeedPlanting(BlockPos pPos, Level pLevel, BlockState pState)
    {
        if((
                pState.is(BlockTags.DIRT)
                        ||
                        pState.is(BlockTags.GRASS_BLOCKS)
                        ||
                        pState.is(Blocks.FARMLAND)
        )
                && pLevel.getBlockState(pPos.above()).is(Blocks.AIR))
        {
            Block b = SEED_SAPLING_MAP.get(this);

            if(b != null)
            {
                pLevel.setBlockAndUpdate(pPos.above(1), b.defaultBlockState());
                pLevel.playSound(null, pPos, SoundEvents.GRASS_PLACE, SoundSource.BLOCKS);
                return true;
            }
        }
        return false;
    }
}
