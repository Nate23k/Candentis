package com.nate23k.candentis.machine;

import com.nate23k.candentis.TileEntityCandentis;
import com.nate23k.candentis.utility.LogHelper;

/**
 * Created on 3/30/2015.
 */

public class TileEntityLightInfuser extends TileEntityCandentis
{
    public int maxLight = 10000;
    public float light = 0;
    public float lightPerTick = 1.0F;

    @Override
    public void updateEntity()
    {
        if(worldObj == null || worldObj.isRemote) {
            return;
        }
        collectLight();
    }

    private void collectLight()
    {
        if(canSeeSun() && isDaytime())
        {
            light += lightPerTick;
            light = Math.round(light);
        }
        if(light > maxLight)
        {
            light = maxLight;
        }
    }

    boolean canSeeSun()
    {
        return worldObj.canBlockSeeTheSky(xCoord, yCoord + 1, zCoord);
    }

    boolean isDaytime()
    {
        return worldObj.isDaytime();
    }
}
