package net.henderson.dweller;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.henderson.dweller.entity.ModEntities;
import net.henderson.dweller.entity.custom.DwellerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class The590dweller implements ModInitializer {
	public static final String MOD_ID = "the-590-dweller";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(ModEntities.DWELLER, DwellerEntity.setAttributes());
	}
}