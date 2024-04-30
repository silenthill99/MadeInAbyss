package fr.silenthill99.madeinabyss.utils;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class CustomToolTiers {

    public static final Tier ABYSSIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 400, 40, 40, 5,
                    ModTags.ModBlockTags.NEEDS_ABYSSIUM_TOOLS, () -> Ingredient.of(ModItems.ABYSSIUM.get())),
            new ResourceLocation(Main.MODID, "abyssium"), List.of(Tiers.NETHERITE), List.of()
    );

}
