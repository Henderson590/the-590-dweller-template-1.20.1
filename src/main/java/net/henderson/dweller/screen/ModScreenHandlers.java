package net.henderson.dweller.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.henderson.dweller.The590dweller;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<LiquidizerScreenHandler> LIQUIDIZER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(The590dweller.MOD_ID, "liquidizer_machine"),
                    new ExtendedScreenHandlerType<>(LiquidizerScreenHandler::new));

            public static void registerScreenHandlers() {
                The590dweller.LOGGER.info("Registering Screen Handlers for " + The590dweller.MOD_ID);
            }
}
