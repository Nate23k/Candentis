package com.nate23k.candentis.utility;

import com.nate23k.candentis.reference.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Createdon 3/27/2015.
 */

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }
    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.LOWERCASE_MOD_ID, path);
    }
}
