package net.error003.vanilla.additions.foods;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CalamariFood extends Item
{
    public CalamariFood() {
        super(new Settings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).meat().snack().build())
                .maxCount(64));
    }
}
