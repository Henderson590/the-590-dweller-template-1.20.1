package net.henderson.dweller;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.henderson.dweller.block.ModBlocks;
import net.henderson.dweller.effect.InfectedEffect;
import net.henderson.dweller.entity.ModEntities;
import net.henderson.dweller.entity.custom.DwellerEntity;
import net.henderson.dweller.item.ModItemGroups;
import net.henderson.dweller.item.ModItems;
import net.henderson.dweller.sounds.ModSounds;
import net.henderson.dweller.util.ModLootTableModifiers;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class The590dweller implements ModInitializer {
	public static final String MOD_ID = "the-590-dweller";
	public static final StatusEffect INFECTED_EFFECT = new InfectedEffect();
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		Registry.register(Registries.STATUS_EFFECT, new Identifier("the-590-dweller", "infected"), INFECTED_EFFECT);

		ModLootTableModifiers.modifyLootTables();
		ModSounds.registerSounds();


		FabricDefaultAttributeRegistry.register(ModEntities.DWELLER, DwellerEntity.setAttributes());
	}
}