package com.hpeanutly.medievalitems.init;

import com.hpeanutly.medievalitems.block.BlockArrowSlitMiddle;
import com.hpeanutly.medievalitems.block.BlockMI;
import com.hpeanutly.medievalitems.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMI arrowSlitMiddle = new BlockArrowSlitMiddle();

    public static void init()
    {
        GameRegistry.registerBlock(arrowSlitMiddle, "arrowSlitMiddle");
    }
}


