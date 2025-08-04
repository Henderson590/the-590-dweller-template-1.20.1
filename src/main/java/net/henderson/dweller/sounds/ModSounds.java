package net.henderson.dweller.sounds;

import net.henderson.dweller.The590dweller;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent CASSETTE_TAPE_ONE = registerSoundEvent("cassette_tape_one");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(The590dweller.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() { The590dweller.LOGGER.info("Registering Sounds for " + The590dweller.MOD_ID); }
}
