package net.henderson.dweller.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.henderson.dweller.The590dweller;
import net.henderson.dweller.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup INFECTED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(The590dweller.MOD_ID, "glob_of_infection"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.infected"))
                    .icon(() -> new ItemStack(ModItems.GLOB_OF_INFECTION)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GLOB_OF_INFECTION);
                        entries.add(ModBlocks.INFECTION_BLOCK);

                        entries.add(ModItems.INFECTED_STEAK);
                        entries.add(ModItems.CASSETTE_TAPE_ONE);

                        entries.add(ModBlocks.INFECTED_DOOR);
                        entries.add(ModBlocks.INFECTED_STAIRS);
                        entries.add(ModBlocks.INFECTED_SLAB);
                        entries.add(ModBlocks.INFECTED_TRAPDOOR);
                        entries.add(ModBlocks.INFECTED_FENCE);
                        entries.add(ModBlocks.INFECTED_FENCE_GATE);
                        entries.add(ModBlocks.INFECTED_BUTTON);
                        entries.add(ModBlocks.INFECTED_PRESSURE_PLATE);
                        entries.add(ModBlocks.INFECTED_WALL);

                        entries.add(ModBlocks.LIQUIDIZER_MACHINE);


                    }).build());

    public static void registerItemGroups() {
        The590dweller.LOGGER.info("Registering Item Groups for " + The590dweller.MOD_ID);
    }
}