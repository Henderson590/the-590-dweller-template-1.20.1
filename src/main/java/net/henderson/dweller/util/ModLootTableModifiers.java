package net.henderson.dweller.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.henderson.dweller.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier COW_ID =
            new Identifier("minecraft", "entities/cow");

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) ->  {
            if(VILLAGE_PLAINS_HOUSE_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.GLOB_OF_INFECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                builder.pool(poolBuilder.build());
            }

            if(COW_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.GLOB_OF_INFECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                builder.pool(poolBuilder.build());
            }

        });
    }
}
