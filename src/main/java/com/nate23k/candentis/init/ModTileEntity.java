package com.nate23k.candentis.init;

import com.nate23k.candentis.machine.TileEntityLightInfuser;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 3/30/2015.
 */
public class ModTileEntity
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityLightInfuser.class, "tileEntityLightInfuser");
    }
}
