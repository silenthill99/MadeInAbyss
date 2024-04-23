package fr.silenthill99.madeinabyss.custom.entities.rico;

import fr.silenthill99.madeinabyss.Main;
import fr.silenthill99.madeinabyss.custom.entities.MobModelLayer;
import fr.silenthill99.madeinabyss.custom.entities.models.HumanEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RicoRenderer extends MobRenderer<RicoEntity, HumanEntityModel<RicoEntity>> {
    public RicoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HumanEntityModel<>(pContext.bakeLayer(MobModelLayer.RICO)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(RicoEntity ricoEntity) {
        return new ResourceLocation(Main.MODID, "textures/entities/rico.png");
    }
}
