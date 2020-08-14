package net.error003.vanilla.additions.registry;

import net.error003.vanilla.additions.VanillaAdditions;
import net.error003.vanilla.additions.blocks.CustomFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class entities {

    public static String MODID;

    public static BlockEntityType<CustomFurnaceBlockEntity> CUSTOM_FURNACE_ENTITY;

    public static void init()
    {
        MODID = VanillaAdditions.getModID();

        CUSTOM_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MODID,"nether_furnace_blockentity"), BlockEntityType.Builder.create(CustomFurnaceBlockEntity::new, blocks.NETHERRACK_FURNACE).build(null));
    }
}
