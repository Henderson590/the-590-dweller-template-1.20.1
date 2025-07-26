package net.henderson.dweller.entity.client;

import net.henderson.dweller.The590dweller;
import net.henderson.dweller.entity.custom.DwellerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DwellerModel extends GeoModel<DwellerEntity> {
    @Override
    public Identifier getModelResource(DwellerEntity dwellerEntity) {
        return new Identifier(The590dweller.MOD_ID, "geo/the_590.geo.json");
    }

    @Override
    public Identifier getTextureResource(DwellerEntity dwellerEntity) {
        return new Identifier(The590dweller.MOD_ID, "textures/entity/590.png");
    }

    @Override
    public Identifier getAnimationResource(DwellerEntity dwellerEntity) {
        return new Identifier(The590dweller.MOD_ID, "animations/the_590.animation.json");
    }

    public void setCustomAnimations(DwellerEntity animatable, long instanceId, AnimationState<DwellerEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
