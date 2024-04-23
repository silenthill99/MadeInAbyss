package fr.silenthill99.madeinabyss.data.models_and_blockstates;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MODID, existingFileHelper);
    }

    String path;

    @Override
    protected void registerModels() {
        templateSpawnEgg(ModItems.RICO_SPAWN_EGG.get());
    }

    private void templateSpawnEgg(ForgeSpawnEggItem item) {
        path = ForgeRegistries.ITEMS.getKey(item).getPath();
        withExistingParent(path, mcLoc("item/template_spawn_egg"));
    }
}
