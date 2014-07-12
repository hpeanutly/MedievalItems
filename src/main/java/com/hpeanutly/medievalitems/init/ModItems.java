package com.hpeanutly.medievalitems.init;

import com.hpeanutly.medievalitems.item.ItemBroadSword;
import com.hpeanutly.medievalitems.item.ItemMI;
import com.hpeanutly.medievalitems.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMI broadSword = new ItemBroadSword();

    public static void init()
    {
        GameRegistry.registerItem(broadSword, "broadSword");
    }
}
