package com.nate23k.candentis.inventory;

import com.nate23k.candentis.machine.TileEntityLightInfuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

/**
 * Created on 4/1/2015.
 */
public class ContainerLightInfuser extends Container
{
    private TileEntityLightInfuser tileEntityLightInfuser;

    public ContainerLightInfuser(InventoryPlayer inventoryPlayer, TileEntityLightInfuser tileEntityLightInfuser)
    {
        this.tileEntityLightInfuser = tileEntityLightInfuser;

        this.addSlotToContainer(new Slot(tileEntityLightInfuser, 0, 27, 32));
        this.addSlotToContainer(new Slot(tileEntityLightInfuser, 1, 85, 32));

        for(int i = 0; i < 9; i++)
        {
            this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + (18 * i), 142));
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                this.addSlotToContainer(new Slot(inventoryPlayer, 9 + j + (i * 9), 8 + (18 * j), 84 + (18 * i)));
            }
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}
