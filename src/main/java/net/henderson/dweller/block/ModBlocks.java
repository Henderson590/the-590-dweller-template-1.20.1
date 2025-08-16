package net.henderson.dweller.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.henderson.dweller.The590dweller;
import net.henderson.dweller.block.custom.LiquidizerMachineBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block INFECTION_BLOCK = registerBlock("infection_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.HONEY)));

    public static final Block INFECTED_STAIRS = registerBlock("infected_stairs",
            new StairsBlock(ModBlocks.INFECTION_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.HONEY)));
    public static final Block INFECTED_SLAB = registerBlock("infected_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.HONEY)));

    public static final Block INFECTED_BUTTON = registerBlock("infected_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.WARPED, 10, true));
    public static final Block INFECTED_PRESSURE_PLATE = registerBlock("infected_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),
                    BlockSetType.WARPED));

    public static final Block INFECTED_FENCE = registerBlock("infected_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.HONEY)));
    public static final Block INFECTED_FENCE_GATE = registerBlock("infected_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.WARPED));

    public static final Block INFECTED_WALL = registerBlock("infected_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.HONEY)));
    public static final Block INFECTED_DOOR = registerBlock("infected_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.WARPED));
    public static final Block INFECTED_TRAPDOOR = registerBlock("infected_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.WARPED));

    public static final Block LIQUIDIZER_MACHINE = registerBlock("liquidizer_machine",
            new LiquidizerMachineBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(The590dweller.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(The590dweller.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        The590dweller.LOGGER.info("Registering ModBlocks for " + The590dweller.MOD_ID);
    }
}
