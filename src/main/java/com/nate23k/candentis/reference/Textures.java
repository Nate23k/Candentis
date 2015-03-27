package com.nate23k.candentis.reference;

import com.nate23k.candentis.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created on 3/27/2015.
 */

public final class Textures
{
    public static final String RESOURCE_PREFIX = Reference.LOWERCASE_MOD_ID + ":";

    public static final class Gui
    {
        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
        public static final ResourceLocation ALCHEMICAL_BAG_SMALL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_small.png");
        public static final ResourceLocation ALCHEMICAL_BAG_MEDIUM = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_medium.png");
        public static final ResourceLocation ALCHEMICAL_BAG_LARGE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_large.png");
    }
}
