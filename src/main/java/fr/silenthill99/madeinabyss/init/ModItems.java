package fr.silenthill99.madeinabyss.init;

import fr.silenthill99.madeinabyss.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);


    public static final RegistryObject<ForgeSpawnEggItem> RICO_SPAWN_EGG = ITEMS.register("rico_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.RICO, 0xFFE4B5, 0xFFCC66,
                    new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> NANACHI_SPAWN_EGG = ITEMS.register("nanachi_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.NANACHI, 0x808080, 0xffcc66,
                    new Item.Properties()));

    public static final RegistryObject<Item> ABYSSIUM = ITEMS.register("abyssium", () -> new Item(
            new Item.Properties()
    ));
}
