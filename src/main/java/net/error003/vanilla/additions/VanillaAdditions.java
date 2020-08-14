package net.error003.vanilla.additions;

import net.error003.vanilla.additions.registry.blocks;
import net.error003.vanilla.additions.registry.entities;
import net.error003.vanilla.additions.registry.items;
import net.fabricmc.api.ModInitializer;

public class VanillaAdditions implements ModInitializer {

    private static final String MODID = "vanillaadditions";

    @Override
    public void onInitialize()
    {
        items.init();
        blocks.init();
        entities.init();
    }

    public static String getModID()
    {
        return MODID;
    }
}
