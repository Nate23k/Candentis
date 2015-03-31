package com.nate23k.candentis.machine;

import com.nate23k.candentis.utility.LogHelper;
import net.minecraft.tileentity.TileEntity;

/**
 * Created on 3/30/2015.
 */
public class TileEntityLightInfuser extends TileEntity
{
    public int maxLight = 10000;
    public float light = 0;
    public float lightPerTick = 0.1F;

    public void updateEntity()
    {
        if(canSeeSun())
        {
            lightPerTick = 5;

            light = light + lightPerTick;
        }
        if(light > maxLight)
        {
            light = maxLight;
        }

        LogHelper.info(light);
    }

    boolean canSeeSun()
    {
        return worldObj.canBlockSeeTheSky(xCoord, yCoord, zCoord);
    }
}
