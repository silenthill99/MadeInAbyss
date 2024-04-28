package fr.silenthill99.madeinabyss.init;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.custom.entities.nanachi.NanachiEntity;
import fr.silenthill99.madeinabyss.custom.entities.reg.RegEntity;
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

    public static final RegistryObject<EntityType<NanachiEntity>> NANACHI = ENTITY_TYPES.register("nanachi",
            () -> EntityType.Builder.of(NanachiEntity::new, MobCategory.AMBIENT).sized(1, 2).build(
                    new ResourceLocation(Main.MODID, "nanachi").toString()));

    public static final RegistryObject<EntityType<RegEntity>> REG = ENTITY_TYPES.register("reg",
            () -> EntityType.Builder.of(RegEntity::new, MobCategory.AMBIENT).sized(1, 2).build(
                    new ResourceLocation(Main.MODID, "reg").toString()));

}
