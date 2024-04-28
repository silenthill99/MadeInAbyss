package fr.silenthill99.madeinabyss;

import fr.silenthill99.madeinabyss.custom.entities.MobModelLayer;
import fr.silenthill99.madeinabyss.custom.entities.models.HumanEntityModel;
import fr.silenthill99.madeinabyss.custom.entities.nanachi.NanachiEntity;
import fr.silenthill99.madeinabyss.custom.entities.nanachi.NanachiRenderer;
import fr.silenthill99.madeinabyss.custom.entities.reg.RegEntity;
import fr.silenthill99.madeinabyss.custom.entities.reg.RegRenderer;
import fr.silenthill99.madeinabyss.custom.entities.rico.RicoEntity;
import fr.silenthill99.madeinabyss.custom.entities.rico.RicoRenderer;
import fr.silenthill99.madeinabyss.init.ModBlocks;
import fr.silenthill99.madeinabyss.init.ModEntityTypes;
import fr.silenthill99.madeinabyss.init.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "made_in_abyss";

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::addCreativeTab);
        bus.addListener(this::addEntityAttributeCreation);
        bus.addListener(this::registerLayer);
        ModItems.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }

    private void setup(FMLCommonSetupEvent event) {
        EntityRenderers.register(ModEntityTypes.RICO.get(), RicoRenderer::new);
        EntityRenderers.register(ModEntityTypes.NANACHI.get(), NanachiRenderer::new);
        EntityRenderers.register(ModEntityTypes.REG.get(), RegRenderer::new);
    }

    private void clientSetup(FMLClientSetupEvent event) {}

    private void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.RICO_SPAWN_EGG);
            event.accept(ModItems.NANACHI_SPAWN_EGG);
        }
    }

    private void addEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RICO.get(), RicoEntity.createAttributes().build());
        event.put(ModEntityTypes.NANACHI.get(), NanachiEntity.createAttributes().build());
        event.put(ModEntityTypes.REG.get(), RegEntity.createAttributes().build());
    }

    private void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MobModelLayer.RICO, HumanEntityModel::createBodyLayer);
        event.registerLayerDefinition(MobModelLayer.NANACHI, HumanEntityModel::createBodyLayer);
        event.registerLayerDefinition(MobModelLayer.REG, HumanEntityModel::createBodyLayer);
    }
}
