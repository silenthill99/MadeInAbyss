package fr.silenthill99.madeinabyss.custom.entities.nanachi;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.custom.entities.MobModelLayer;
import fr.silenthill99.madeinabyss.custom.entities.models.HumanEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NanachiRenderer extends MobRenderer<NanachiEntity, HumanEntityModel<NanachiEntity>> {

    public NanachiRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HumanEntityModel<>(pContext.bakeLayer(MobModelLayer.NANACHI)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(NanachiEntity nanachiEntity) {
        return new ResourceLocation(Main.MODID, "textures/entities/nanachi.png");
    }
}
