package fr.silenthill99.madeinabyss.data.models_and_blockstates;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockStateGenerator extends BlockStateProvider {

    private String path;

    public BlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.ABYSSIUM_ORE.get(), cubeAll(ModBlocks.ABYSSIUM_ORE.get()));
        simpleBlockWithItem(ModBlocks.ABYSSIUM_BLOCK.get(), cubeAll(ModBlocks.ABYSSIUM_BLOCK.get()));
        logBlock((RotatedPillarBlock) ModBlocks.ABYSSWOOD_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.ABYSSWOOD_WOOD.get(),
                blockTexture(ModBlocks.ABYSSWOOD_LOG.get()),
                blockTexture(ModBlocks.ABYSSWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ABYSSWOOD_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ABYSSWOOD_WOOD.get(),
                blockTexture(ModBlocks.STRIPPED_ABYSSWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ABYSSWOOD_LOG.get()));
        leavesBlock((LeavesBlock) ModBlocks.ABYSSWOOD_LEAVES.get());
        simpleBlockWithItem(ModBlocks.ABYSSWOOD_PLANKS.get(), cubeAll(ModBlocks.ABYSSWOOD_PLANKS.get()));
    }

    @Override
    public void logBlock(RotatedPillarBlock block) {
        super.logBlock(block);
        path = ForgeRegistries.BLOCKS.getKey(block).getPath();
        simpleBlockItem(block, new ModelFile.UncheckedModelFile(modLoc("block/" + path)));
    }

    @Override
    public void axisBlock(RotatedPillarBlock block, ResourceLocation side, ResourceLocation end) {
        super.axisBlock(block, side, end);
        path = ForgeRegistries.BLOCKS.getKey(block).getPath();
        simpleBlockItem(block, new ModelFile.UncheckedModelFile(modLoc("block/" + path)));
    }

    private void leavesBlock(LeavesBlock block) {
        path = ForgeRegistries.BLOCKS.getKey(block).getPath();
        simpleBlockWithItem(block, models().singleTexture(path, mcLoc("block/leaves"),
                "all", blockTexture(block)).renderType("cutout"));
    }
}
