package fr.silenthill99.madeinabyss.data.recipes;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import fr.silenthill99.madeinabyss.init.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ABYSSIUM_ORE.get()), RecipeCategory.MISC,
                        ModItems.ABYSSIUM.get(), 0.3f, 200)
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ABYSSIUM_ORE.get()))
                .save(consumer);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.ABYSSIUM_ORE.get()), RecipeCategory.MISC,
                        ModItems.ABYSSIUM.get(), 0.3f, 200)
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ABYSSIUM_ORE.get()))
                .save(consumer, new ResourceLocation(Main.MODID,
                        ForgeRegistries.ITEMS.getKey(ModItems.ABYSSIUM.get()).getPath() + "_smelting"));
    }
    
}
