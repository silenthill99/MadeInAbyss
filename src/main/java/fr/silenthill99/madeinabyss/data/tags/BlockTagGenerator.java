package fr.silenthill99.madeinabyss.data.tags;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.ABYSSIUM_ORE.get(),
                ModBlocks.ABYSSIUM_BLOCK.get()
        );
        tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.ABYSSIUM_ORE.get(),
                ModBlocks.ABYSSIUM_BLOCK.get()
        );
        tag(BlockTags.LOGS_THAT_BURN).add(
                ModBlocks.ABYSSWOOD_LOG.get(),
                ModBlocks.ABYSSWOOD_WOOD.get(),
                ModBlocks.STRIPPED_ABYSSWOOD_LOG.get(),
                ModBlocks.STRIPPED_ABYSSWOOD_WOOD.get()
        );
        tag(BlockTags.PLANKS).add(
                ModBlocks.ABYSSWOOD_PLANKS.get()
        );
    }
}
