package fr.silenthill99.madeinabyss.data;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.data.loot_tables.LootTableGenerator;
import fr.silenthill99.madeinabyss.data.models_and_blockstates.BlockStateGenerator;
import fr.silenthill99.madeinabyss.data.models_and_blockstates.ItemModelGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new BlockStateGenerator(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelGenerator(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new LootTableGenerator(packOutput));

    }

}
