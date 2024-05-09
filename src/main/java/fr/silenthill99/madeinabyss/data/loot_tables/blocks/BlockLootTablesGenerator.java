package fr.silenthill99.madeinabyss.data.loot_tables.blocks;

import fr.silenthill99.madeinabyss.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootTablesGenerator extends BlockLootSubProvider {
    public BlockLootTablesGenerator() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ABYSSIUM_ORE.get());
        dropSelf(ModBlocks.ABYSSIUM_BLOCK.get());
        dropSelf(ModBlocks.ABYSSWOOD_LOG.get());
        dropSelf(ModBlocks.ABYSSWOOD_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ABYSSWOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ABYSSWOOD_WOOD.get());
        dropSelf(ModBlocks.ABYSSWOOD_PLANKS.get());
        add(ModBlocks.ABYSSWOOD_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.ABYSSWOOD_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(RegistryObject::get)::iterator;
    }
}
