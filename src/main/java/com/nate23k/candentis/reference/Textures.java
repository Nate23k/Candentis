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
        public static final ResourceLocation LIGHT_INFUSED_POUCH_SMALL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "lightInfusedPouch_small.png");
        public static final ResourceLocation LIGHT_INFUSED_POUCH_MEDIUM = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "lightInfusedPouch_medium.png");
        public static final ResourceLocation LIGHT_INFUSED_POUCH_LARGE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "lightInfusedPouch_large.png");
        public static final ResourceLocation LIGHT_INFUSER = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "lightInfuser.png");
    }
}
