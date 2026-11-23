package com.starlight.starlighttreeexpansion.entity.custom;

import com.starlight.starlighttreeexpansion.block.ModBlocks;
import com.starlight.starlighttreeexpansion.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class SeedItemEntity extends ItemEntity
{
    public static final Map<Item, Block> SEED_SAPLING_MAP =
            Map.of(
                    ModItems.ACORN.get(), ModBlocks.OAK_SEEDLING.get(),
                    ModItems.DARK_ACORN.get(), ModBlocks.DARK_OAK_SEEDLING.get(),
                    ModItems.BIRCH_SEED.get(), ModBlocks.BIRCH_SEEDLING.get(),
                    ModItems.ACACIA_SEED.get(), ModBlocks.ACACIA_SEEDLING.get(),
                    ModItems.CHERRY_SEED.get(), ModBlocks.CHERRY_SEEDLING.get(),
                    ModItems.JUNGLE_SEED.get(), ModBlocks.JUNGLE_SEEDLING.get(),
                    ModItems.SPRUCE_SEED.get(), ModBlocks.SPRUCE_SEEDLING.get(),
                    ModItems.ORANGE_SEED.get(), ModBlocks.ORANGE_SEEDLING.get(),
                    ModItems.APPLE_SEED.get(), ModBlocks.APPLE_SAPLING.get()
            );

    public SeedItemEntity(EntityType<? extends ItemEntity> pEntityType, Level pLevel)
    {
        super(pEntityType, pLevel);
    }
    public SeedItemEntity(Level pLevel, double pPosX, double pPosY, double pPosZ, ItemStack pItemStack)
    {
        super(pLevel, pPosX, pPosY, pPosZ, pItemStack);

    }
    public SeedItemEntity(
            Level pLevel, double pPosX, double pPosY, double pPosZ, ItemStack pItemStack, double pDeltaX, double pDeltaY, double pDeltaZ
    )
    {
        this(EntityTypes.ITEM, pLevel);
        this.setPos(pPosX, pPosY, pPosZ);
        this.setItem(pItemStack);
        setPickUpDelay(40);

        this.lifespan = (pItemStack.getItem() == null ? 6000 : pItemStack.getEntityLifespan(pLevel));

        if(getOwner() != null)
        {
            float f1 = Mth.sin(getOwner().getXRot() * (float) (Math.PI / 180.0));
            float f2 = Mth.cos(getOwner().getXRot() * (float) (Math.PI / 180.0));
            float f3 = Mth.sin(getOwner().getYRot() * (float) (Math.PI / 180.0));
            float f4 = Mth.cos(getOwner().getYRot() * (float) (Math.PI / 180.0));
            float f5 = this.random.nextFloat() * (float) (Math.PI * 2);
            float f6 = 0.02F * this.random.nextFloat();
            this.setDeltaMovement(
                    (double)(-f3 * f2 * 0.3F) + Math.cos((double)f5) * (double)f6,
                    (double)(-f1 * 0.3F + 0.1F + (this.random.nextFloat() - this.random.nextFloat()) * 0.1F),
                    (double)(f4 * f2 * 0.3F) + Math.sin((double)f5) * (double)f6);
        }
        else
        {
            System.out.println("owner null?");
        }
    }

    @Override
    protected void checkSupportingBlock(boolean pOnGround, @Nullable Vec3 pMovement)
    {
        super.checkSupportingBlock(pOnGround, pMovement);

        //is on ground
        //is ground a dirt/grass block?
        //plant tree seedling/sapling block
        if(onGround())
        {
            BlockPos pos = this.getOnPos();
            BlockState state = this.level().getBlockState(pos);
            if((
                    state.is(BlockTags.DIRT)
                    ||
                    state.is(Blocks.FARMLAND)
            )
            &&
            this.level().getBlockState(pos.above()).is(Blocks.AIR))
            {
                Block b = SEED_SAPLING_MAP.get(this.getItem().getItem());

                if(b != null)
                {
                    this.level().setBlockAndUpdate(this.getOnPos().above(1), b.defaultBlockState());

                    if(this.level() instanceof ServerLevel serverLevel)
                        this.kill(serverLevel);
                }
            }
        }
    }
}
