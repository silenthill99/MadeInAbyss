package fr.silenthill99.madeinabyss.init;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.custom.entities.rico.RicoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Main.MODID);

    public static final RegistryObject<EntityType<RicoEntity>> RICO = ENTITY_TYPES.register("rico",
            () -> EntityType.Builder.of(RicoEntity::new, MobCategory.AMBIENT).sized(1, 2).build(
                    new ResourceLocation(Main.MODID, "rico").toString()));

}
