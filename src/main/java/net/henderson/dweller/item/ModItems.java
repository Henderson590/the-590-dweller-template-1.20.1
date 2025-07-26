package net.henderson.dweller.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.henderson.dweller.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

import static software.bernie.example.registry.ItemRegistry.registerItem;

public class ModItems {
    public static final Item DWELLER_SPAWN_EGG = registerItem("590_dweller_spawn_egg",
            new SpawnEggItem(ModEntities.DWELLER, 0xFFFFFF, 0x000000,
                    new FabricItemSettings()));
}
