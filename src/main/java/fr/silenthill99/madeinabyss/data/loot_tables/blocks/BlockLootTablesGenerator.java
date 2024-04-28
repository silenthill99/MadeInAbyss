package fr.silenthill99.madeinabyss.data.loot_tables.blocks;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class BlockLootTablesGenerator extends BlockLootSubProvider {
    public BlockLootTablesGenerator() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

    }
}
