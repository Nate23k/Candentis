package com.nate23k.candentis;

import net.minecraft.tileentity.TileEntity;

/**
 * Created on 3/31/2015.
 */

public class TileEntityCandentis extends TileEntity
{
    public void markForUpdate()
    {
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }
}
