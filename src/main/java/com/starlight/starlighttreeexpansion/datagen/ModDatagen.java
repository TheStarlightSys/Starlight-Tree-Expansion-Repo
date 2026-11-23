package com.starlight.starlighttreeexpansion.datagen;

import com.starlight.starlighttreeexpansion.StarlightTreeExpansion;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = StarlightTreeExpansion.MOD_ID)
public class ModDatagen {

    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client pEvent)
    {

        DataGenerator gen = pEvent.getGenerator();
        PackOutput packOut = gen.getPackOutput();

        gen.addProvider(true, new ModModelProvider(packOut));
    }
}
