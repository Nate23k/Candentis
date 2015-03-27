package com.nate23k.candentis.handler;

import com.nate23k.candentis.client.gui.inventory.GuiAlchemicalBag;
import com.nate23k.candentis.inventory.ContainerAlchemicalBag;
import com.nate23k.candentis.inventory.InventoryAlchemicalBag;
import com.nate23k.candentis.inventory.*;
import com.nate23k.candentis.reference.GUIs;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.awt.*;

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
            case 0: return new ContainerAlchemicalBag(entityPlayer, new InventoryAlchemicalBag(entityPlayer.getHeldItem()));
        }
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z)
    {
        switch(id)
        {
            default: return null;
            case 0: return new GuiAlchemicalBag(entityPlayer, new InventoryAlchemicalBag(entityPlayer.getHeldItem()));
        }
    }
}
