package net.henderson.dweller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.henderson.dweller.block.ModBlocks;
import net.henderson.dweller.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool infectedPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INFECTION_BLOCK);

        infectedPool.stairs(ModBlocks.INFECTED_STAIRS);
        infectedPool.slab(ModBlocks.INFECTED_SLAB);
        infectedPool.button(ModBlocks.INFECTED_BUTTON);
        infectedPool.pressurePlate(ModBlocks.INFECTED_PRESSURE_PLATE);
        infectedPool.fence(ModBlocks.INFECTED_FENCE);
        infectedPool.fenceGate(ModBlocks.INFECTED_FENCE_GATE);
        infectedPool.wall(ModBlocks.INFECTED_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.INFECTED_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.INFECTED_TRAPDOOR);

        blockStateModelGenerator.registerSimpleState(ModBlocks.LIQUIDIZER_MACHINE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GLOB_OF_INFECTION, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASSETTE_TAPE_ONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFECTED_STEAK, Models.GENERATED);
    }
}
