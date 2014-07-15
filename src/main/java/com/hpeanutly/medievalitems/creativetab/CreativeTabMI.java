package com.hpeanutly.medievalitems.creativetab;

import com.hpeanutly.medievalitems.init.ModItems;
import com.hpeanutly.medievalitems.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMI
{
    public static final CreativeTabs MI_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.broadSword;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return Reference.MOD_Name;
        }
    };
}
