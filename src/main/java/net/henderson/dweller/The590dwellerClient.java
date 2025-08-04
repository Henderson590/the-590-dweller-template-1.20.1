package net.henderson.dweller;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.henderson.dweller.entity.ModEntities;
import net.henderson.dweller.entity.client.DwellerRenderer;

public class The590dwellerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.DWELLER, DwellerRenderer::new);
    }
}
