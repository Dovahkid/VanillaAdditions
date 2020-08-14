package net.error003.vanilla.additions.registry;

import net.error003.vanilla.additions.VanillaAdditions;
import net.error003.vanilla.additions.blocks.CustomFurnaceBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blocks {

    public static String MODID;

    public static final Block NETHERRACK_FURNACE = new CustomFurnaceBlock(FabricBlockSettings.copy(Blocks.FURNACE));

    public static final Block PURPLE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES, 2).hardness(4f).resistance(10f).requiresTool());



    public static void init()
    {
        MODID = VanillaAdditions.getModID();

        Registry.register(Registry.BLOCK, new Identifier(MODID, "netherrack_furnace"), NETHERRACK_FURNACE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "netherrack_furnace"),
                new BlockItem(NETHERRACK_FURNACE, new Item.Settings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_diamond_ore"), PURPLE_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_ore"),
                new BlockItem(PURPLE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
