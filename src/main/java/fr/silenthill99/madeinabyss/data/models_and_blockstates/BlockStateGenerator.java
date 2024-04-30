package fr.silenthill99.madeinabyss.data.models_and_blockstates;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGenerator extends BlockStateProvider {
    public BlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.ABYSSIUM_ORE.get(), cubeAll(ModBlocks.ABYSSIUM_ORE.get()));
        simpleBlockWithItem(ModBlocks.ABYSSIUM_BLOCK.get(), cubeAll(ModBlocks.ABYSSIUM_BLOCK.get()));
    }
}
