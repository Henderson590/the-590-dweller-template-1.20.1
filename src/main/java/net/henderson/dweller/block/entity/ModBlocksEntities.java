package net.henderson.dweller.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.henderson.dweller.The590dweller;
import net.henderson.dweller.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocksEntities {
    public static final BlockEntityType<LiquidizerMachineBlockEntity> LIQUIDIZER_MACHINE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(The590dweller.MOD_ID, "liquidizer_machine_be"),
                    FabricBlockEntityTypeBuilder.create(LiquidizerMachineBlockEntity::new,
                            ModBlocks.LIQUIDIZER_MACHINE).build());

    public static void registerBlockEntities() {
        The590dweller.LOGGER.info("Registering Block Entities for " + The590dweller.MOD_ID);
    }
}
