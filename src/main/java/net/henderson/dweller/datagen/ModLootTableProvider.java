package net.henderson.dweller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.henderson.dweller.block.ModBlocks;
import net.henderson.dweller.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.INFECTION_BLOCK, copperLikeOreDrops(ModBlocks.INFECTION_BLOCK, ModItems.GLOB_OF_INFECTION));

        addDrop(ModBlocks.INFECTED_STAIRS);
        addDrop(ModBlocks.INFECTED_FENCE);
        addDrop(ModBlocks.INFECTED_FENCE_GATE);
        addDrop(ModBlocks.INFECTED_SLAB, slabDrops(ModBlocks.INFECTED_SLAB));
        addDrop(ModBlocks.INFECTED_WALL);
        addDrop(ModBlocks.INFECTED_DOOR, doorDrops(ModBlocks.INFECTED_DOOR));
        addDrop(ModBlocks.INFECTED_TRAPDOOR);
        addDrop(ModBlocks.INFECTED_PRESSURE_PLATE);
        addDrop(ModBlocks.INFECTED_BUTTON);
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                .create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
