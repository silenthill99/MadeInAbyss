package fr.silenthill99.madeinabyss.data.loot_tables;

import fr.silenthill99.madeinabyss.data.loot_tables.blocks.BlockLootTablesGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class LootTableGenerator extends LootTableProvider {
    public LootTableGenerator(PackOutput packOutput) {
        super(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(BlockLootTablesGenerator::new,
                LootContextParamSets.BLOCK)));
    }
}
