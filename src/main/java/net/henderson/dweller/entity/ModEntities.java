package net.henderson.dweller.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.henderson.dweller.The590dweller;
import net.henderson.dweller.entity.custom.DwellerEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<DwellerEntity> DWELLER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(The590dweller.MOD_ID, "dweller"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DwellerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
