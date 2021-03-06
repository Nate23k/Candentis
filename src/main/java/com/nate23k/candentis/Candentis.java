package com.nate23k.candentis;

/**
 * Created on 3/24/2015.
 */

import com.nate23k.candentis.handler.ConfigurationHandler;
import com.nate23k.candentis.handler.GuiHandler;
import com.nate23k.candentis.init.ModBlocks;
import com.nate23k.candentis.init.ModItems;
import com.nate23k.candentis.init.ModTileEntity;
import com.nate23k.candentis.init.Recipes;
import com.nate23k.candentis.item.tools.swords.ItemKaylesSword;
import com.nate23k.candentis.network.PacketHandler;
import com.nate23k.candentis.proxy.IProxy;
import com.nate23k.candentis.reference.Reference;
import com.nate23k.candentis.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Candentis
{

    @Mod.Instance(Reference.MOD_ID)
    public static Candentis instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();
        PacketHandler.init();
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());



        Recipes.init();

        ModTileEntity.init();

        proxy.registerProxies();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
