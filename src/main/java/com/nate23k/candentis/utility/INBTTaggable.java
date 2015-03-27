package com.nate23k.candentis.utility;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Created on 3/27/2015.
 */

public interface INBTTaggable
{
    void readFromNBT(NBTTagCompound nbtTagCompound);
    void writeToNBT(NBTTagCompound nbtTagCompound);
    String getTagLabel();
}
