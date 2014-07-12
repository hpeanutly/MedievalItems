package com.hpeanutly.medievalitems;

import com.hpeanutly.medievalitems.handler.ConfigurationHandler;
import com.hpeanutly.medievalitems.init.ModBlocks;
import com.hpeanutly.medievalitems.init.ModItems;
import com.hpeanutly.medievalitems.proxy.IProxy;
import com.hpeanutly.medievalitems.reference.Reference;
import com.hpeanutly.medievalitems.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_Name, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MedievalItems
{
    @Mod.Instance(Reference.MOD_ID)
    public static MedievalItems instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre-Initialization starting!");
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre-Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        LogHelper.info("Post-Initialization complete!");
    }
}
