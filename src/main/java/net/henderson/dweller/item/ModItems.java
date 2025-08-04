package net.henderson.dweller.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.henderson.dweller.The590dweller;
import net.henderson.dweller.sounds.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item CASSETTE_TAPE_ONE = registerItem("cassette_tape_one",
            new MusicDiscItem(7, ModSounds.CASSETTE_TAPE_ONE, new  FabricItemSettings().maxCount(1), 34));

    public static final Item GLOB_OF_INFECTION = registerItem("glob_of_infection",
            new Item(new FabricItemSettings()));

    public static final Item INFECTED_STEAK = registerItem("infected_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.INFECTED_STEAK)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(GLOB_OF_INFECTION);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(The590dweller.MOD_ID, name), item);
    }

    public static void registerModItems() {
        The590dweller.LOGGER.info("Registering Mod Items for " + The590dweller.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
