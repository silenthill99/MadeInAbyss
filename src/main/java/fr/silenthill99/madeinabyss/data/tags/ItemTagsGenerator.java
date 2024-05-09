package fr.silenthill99.madeinabyss.data.tags;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagsGenerator extends ItemTagsProvider {
    public ItemTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTags, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.LOGS_THAT_BURN).add(
                ModBlocks.ABYSSWOOD_LOG.get().asItem(),
                ModBlocks.ABYSSWOOD_WOOD.get().asItem(),
                ModBlocks.STRIPPED_ABYSSWOOD_LOG.get().asItem(),
                ModBlocks.STRIPPED_ABYSSWOOD_WOOD.get().asItem()
        );
        tag(ItemTags.PLANKS).add(
                ModBlocks.ABYSSWOOD_PLANKS.get().asItem()
        );
    }
}
