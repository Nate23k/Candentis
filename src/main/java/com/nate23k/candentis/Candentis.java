package com.nate23k.candentis;

/**
 * Created on 3/24/2015.
 */

import com.nate23k.candentis.proxy.IProxy;
import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Candentis
{
    @Mod.Instance("Candentis")
    public static Candentis instance;

    @SidedProxy(clientSide = "com.nate23k.candentis.proxy.ClientProxy", serverSide = "com.nate23k.candentis.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
