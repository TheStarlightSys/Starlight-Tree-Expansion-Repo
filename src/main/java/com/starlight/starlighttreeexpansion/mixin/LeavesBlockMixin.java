package com.starlight.starlighttreeexpansion.mixin;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import com.starlight.starlighttreeexpansion.block.util.LeafBlockSeedData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(LeavesBlock.class)
public abstract class LeavesBlockMixin
{


    @Inject(method = "randomTick", at = @At("HEAD"))
    protected void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom, CallbackInfo ci)
    {
        StarlightTreeExpansion.LOGGER.atInfo().log("injected random tick");

        //check if adjacent to air block below, have random chance to drop fruit/seed (and play leaves breaking sound?)

        LeafBlockSeedData seedData;

        if(pLevel.getBlockState(pPos.below()).is(Blocks.AIR)
            && (seedData = LeafBlockSeedData.getSeedDataFromSheet(pState)) != null
            &&(seedData.pSpawnChances() > 1 && pRandom.nextInt(seedData.pSpawnChances()-1) == 0))
        {
            StarlightTreeExpansion.LOGGER.atInfo().log("is in correct position for random drop: " + seedData.toString());


            SimpleContainer C = new SimpleContainer(1);
            C.addItem(new ItemStack(seedData.pSeedItem(), 1));
            Containers.dropContents(pLevel, pPos.below(), C);
        }

    }
    /**
     * @author starlight
     * @reason conditions for isRandomlyTicking are same as in the randomtick method itself, and it prevents my code from running
     */
    @Overwrite
    protected boolean isRandomlyTicking(BlockState pState) {
        return true;
    }


}
