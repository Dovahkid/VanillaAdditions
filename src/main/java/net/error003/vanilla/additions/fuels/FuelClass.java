package net.error003.vanilla.additions.fuels;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class FuelClass extends Item
{
    public final int ticks;

    public FuelClass(int ticks)
    {
        super(new Settings().group(ItemGroup.MISC));
        this.ticks = ticks;
    }


}
