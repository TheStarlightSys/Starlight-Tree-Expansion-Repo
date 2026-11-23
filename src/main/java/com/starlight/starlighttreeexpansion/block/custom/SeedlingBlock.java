package com.starlight.starlighttreeexpansion.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;


public class SeedlingBlock extends BushBlock implements BonemealableBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    public static final BooleanProperty IS_ALIVE = BooleanProperty.create("is_alive");
    public static final int MAX_AGE = 7;

    public SeedlingBlock(Properties pProperties)
    {
        super(pProperties);

        this.registerDefaultState(
                this.stateDefinition
                        .any()
                        .setValue(AGE, 0)
                        .setValue(IS_ALIVE, Boolean.TRUE));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE, IS_ALIVE);
    }

    @Override
    protected void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom)
    {
        super.randomTick(pState, pLevel, pPos, pRandom);

        attemptGrow(pLevel, pRandom, pPos, pState);
    }
    public int getMinLightLevel()
    {
        return 9;
    }
    public float getMinTemperature()
    {
        return 0.5f;
    }
    public Block getSapling()
    {
        return null;
    }
    @Override
    protected boolean isRandomlyTicking(BlockState pState) {
        return true;
    }

    private float getHeightAdjustedTemperature(BlockPos pPos, Biome pBiome)
    {
        float f = pBiome.getModifiedClimateSettings().temperatureModifier().modifyTemperature(pPos, pBiome.getBaseTemperature());

        if (pPos.getY() > 80)
        {
            return f - (1f + (float) pPos.getY() - 80.0F) * 0.05F / 40.0F;
        }
        else
        {
            return f;
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.DIRT) || pState.is(Blocks.FARMLAND) || pState.is(Blocks.GRASS_BLOCK);
    }

    public void attemptGrow(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState)
    {

        int age = pState.getValue(AGE);

        if(!mayPlaceOn(pLevel.getBlockState(pPos.below()), pLevel, pPos.below()))
        {
            if(age < 4) {
                pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
                pLevel.playSound(null, pPos, SoundEvents.CROP_BREAK, SoundSource.BLOCKS);
            }
            else
            {
                pLevel.setBlockAndUpdate(pPos, pState.setValue(IS_ALIVE, false));
                pLevel.playSound(null, pPos, SoundEvents.COMPOSTER_READY, SoundSource.BLOCKS);
            }
            return;
        }
        Biome biome = pLevel.getBiome(pPos).value();


        BlockState bState;

        if(pState.getValue(IS_ALIVE)) {
            //increase age based on temperature and light levels
            if (pLevel.getRawBrightness(pPos, 0) >= getMinLightLevel()
                    && pLevel.isBrightOutside()
                    && pState.getValue(IS_ALIVE)) {
                if (getHeightAdjustedTemperature(pPos, biome) >= this.getMinTemperature()) {


                    if (age < MAX_AGE) {
                        bState = pState.setValue(AGE, Math.min(MAX_AGE, age + 1));

                        pLevel.setBlockAndUpdate(pPos, bState);
                        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(null, bState));
                    } else {
                        bState = getSapling().defaultBlockState();
                        pLevel.setBlockAndUpdate(pPos, bState);
                        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(null, bState));
                    }
                } else {
                    //temperature too low, kill seedling
                    if (age > 3) {
                        bState = pState.setValue(IS_ALIVE, false);

                        pLevel.setBlockAndUpdate(pPos, bState);
                        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(null, bState));
                    } else {
                        bState = Blocks.AIR.defaultBlockState();
                        pLevel.setBlockAndUpdate(pPos, bState);
                        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(null, bState));

                    }
                }
            }
        }
    }

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
        return 60;

    }
}
