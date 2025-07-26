package net.henderson.dweller.entity.client;

import net.henderson.dweller.The590dweller;
import net.henderson.dweller.entity.custom.DwellerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DwellerRenderer extends GeoEntityRenderer<DwellerEntity> {
    public DwellerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new DwellerModel());
    }

    @Override
    public Identifier getTexture(DwellerEntity animatable) {
        return new Identifier(The590dweller.MOD_ID, "textures/entity/590.png");
    }
}
