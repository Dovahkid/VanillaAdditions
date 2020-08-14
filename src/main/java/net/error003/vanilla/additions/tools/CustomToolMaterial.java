package net.error003.vanilla.additions.tools;

import net.error003.vanilla.additions.VanillaAdditions;
import net.error003.vanilla.additions.registry.items;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.error003.vanilla.additions.VanillaAdditions;

public enum CustomToolMaterial implements ToolMaterial
{
    QUARTZ(2, 250, 6f, -1, 30, Ingredient.ofItems(Items.QUARTZ)),
    GLASS(0, 1, 0, -1, 0, null),
    PURPLE_DIAMOND(3, 1600, 8F, -1, 22, Ingredient.ofItems(items.PURPLE_DIAMOND));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    CustomToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient)
    {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

}
