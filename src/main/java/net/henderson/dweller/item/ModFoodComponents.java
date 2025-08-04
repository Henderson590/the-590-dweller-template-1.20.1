package net.henderson.dweller.item;

import net.henderson.dweller.The590dweller;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent INFECTED_STEAK = new FoodComponent.Builder().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(The590dweller.INFECTED_EFFECT, 200), 1f).build();
}
