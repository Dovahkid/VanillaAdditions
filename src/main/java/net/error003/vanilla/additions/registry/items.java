package net.error003.vanilla.additions.registry;

import net.error003.vanilla.additions.VanillaAdditions;
import net.error003.vanilla.additions.armor.CustomArmorMaterial;
import net.error003.vanilla.additions.foods.CalamariFood;
import net.error003.vanilla.additions.fuels.FuelClass;
import net.error003.vanilla.additions.tools.*;
import net.error003.vanilla.additions.fuels.FuelClass;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items
{
    public static String MODID;

    public static final Item CALAMARI = new CalamariFood();
    public static final FuelClass GLOWSTONE_FUEL = new FuelClass(3200);

    public static final Item QUARTZ_HELMET = new ArmorItem(CustomArmorMaterial.QUARTZ, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item QUARTZ_CHESTPLATE = new ArmorItem(CustomArmorMaterial.QUARTZ, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item QUARTZ_LEGGINGS = new ArmorItem(CustomArmorMaterial.QUARTZ, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item QUARTZ_BOOTS = new ArmorItem(CustomArmorMaterial.QUARTZ, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final Item QUARTZ_SWORD = new SwordClass(CustomToolMaterial.QUARTZ, 6, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item QUARTZ_PICKAXE = new PickaxeClass(CustomToolMaterial.QUARTZ, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item QUARTZ_SHOVEL = new ShovelClass(CustomToolMaterial.QUARTZ, 4.5f, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item QUARTZ_AXE = new AxeClass(CustomToolMaterial.QUARTZ, 9, -3.1f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item QUARTZ_HOE = new HoeClass(CustomToolMaterial.QUARTZ, 1, -1f, new Item.Settings().group(ItemGroup.TOOLS));

    public static final Item PURPLE_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Item PURPLE_DIAMOND_HELMET = new ArmorItem(CustomArmorMaterial.PURPLE_DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_DIAMOND_CHESTPLATE = new ArmorItem(CustomArmorMaterial.PURPLE_DIAMOND, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_DIAMOND_LEGGINGS = new ArmorItem(CustomArmorMaterial.PURPLE_DIAMOND, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_DIAMOND_BOOTS = new ArmorItem(CustomArmorMaterial.PURPLE_DIAMOND, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final Item PURPLE_DIAMOND_SWORD = new SwordClass(CustomToolMaterial.PURPLE_DIAMOND, 7, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_DIAMOND_PICKAXE = new PickaxeClass(CustomToolMaterial.PURPLE_DIAMOND, 5, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PURPLE_DIAMOND_SHOVEL = new ShovelClass(CustomToolMaterial.PURPLE_DIAMOND, 5.5f, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PURPLE_DIAMOND_AXE = new AxeClass(CustomToolMaterial.PURPLE_DIAMOND, 9, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PURPLE_DIAMOND_HOE = new HoeClass(CustomToolMaterial.PURPLE_DIAMOND, 1, 0f, new Item.Settings().group(ItemGroup.TOOLS));

    public static void init()
    {
        MODID = VanillaAdditions.getModID();

        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond"), PURPLE_DIAMOND);

        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_helmet"), PURPLE_DIAMOND_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_chestplate"), PURPLE_DIAMOND_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_leggings"), PURPLE_DIAMOND_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_boots"), PURPLE_DIAMOND_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_shovel"), PURPLE_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_pickaxe"), PURPLE_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_axe"), PURPLE_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_hoe"), PURPLE_DIAMOND_HOE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_diamond_sword"), PURPLE_DIAMOND_SWORD);

        // Quartz Tools
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_shovel"), QUARTZ_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_pickaxe"), QUARTZ_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_axe"), QUARTZ_AXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_hoe"), QUARTZ_HOE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_sword"), QUARTZ_SWORD);

        // Quartz Armor
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_helmet"), QUARTZ_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_chestplate"), QUARTZ_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_leggings"), QUARTZ_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_boots"), QUARTZ_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(MODID, "glass_cannon_sword"), new SwordClass(CustomToolMaterial.GLASS, 19, 0, new Item.Settings().group(ItemGroup.COMBAT)));

        Registry.register(Registry.ITEM, new Identifier(MODID, "calamari"), CALAMARI);

        Registry.register(Registry.ITEM, new Identifier(MODID, "glowstone_fuel"), GLOWSTONE_FUEL);
        FuelRegistry.INSTANCE.add(GLOWSTONE_FUEL, GLOWSTONE_FUEL.ticks);
    }
}
