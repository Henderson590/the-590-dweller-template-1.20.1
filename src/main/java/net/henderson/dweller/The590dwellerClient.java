package net.henderson.dweller;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.henderson.dweller.block.ModBlocks;
import net.henderson.dweller.entity.ModEntities;
import net.henderson.dweller.entity.client.DwellerRenderer;
import net.henderson.dweller.screen.LiquidizerScreen;
import net.henderson.dweller.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class The590dwellerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.DWELLER, DwellerRenderer::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INFECTED_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INFECTED_TRAPDOOR, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.LIQUIDIZER_SCREEN_HANDLER, LiquidizerScreen::new);
    }
}
