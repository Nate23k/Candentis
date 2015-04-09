package com.nate23k.candentis.network;

import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created on 4/8/2015.
 */

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.LOWERCASE_MOD_ID);

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityLightInfuser.class, MessageTileEntityLightInfuser.SimpleMessage.class, 0, Side.CLIENT);
    }
}
