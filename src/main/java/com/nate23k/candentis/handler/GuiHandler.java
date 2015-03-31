package com.nate23k.candentis.handler;

import com.nate23k.candentis.client.gui.inventory.GuiLightInfusedPouch;
import com.nate23k.candentis.inventory.ContainerLightInfusedPouch;
import com.nate23k.candentis.inventory.InventoryLightInfusedPouch;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created on 3/27/2015.
 */

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z)
    {
        switch(id)
        {
            default: return null;
            case 0: return new ContainerLightInfusedPouch(entityPlayer, new InventoryLightInfusedPouch(entityPlayer.getHeldItem()));
        }
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z)
    {
        switch(id)
        {
            default: return null;
            case 0: return new GuiLightInfusedPouch(entityPlayer, new InventoryLightInfusedPouch(entityPlayer.getHeldItem()));
        }
    }
}
