package com.nate23k.candentis.reference;

/**
 * Created on 3/27/2015.
 */
public class Names
{
    public static final class Items
    {
        public static final String LIGHT_INFUSED_POUCH = "lightInfusedPouch";
    }

    public static final class NBT
    {
        public static final String ITEMS = "Items";
        public static final String LIGHT_INFUSED_POUCH_GUI_OPEN = "lightInfusedPouchGuiOpen";
        public static final String DISPLAY = "display";
        public static final String COLOR = "color";
        public static final String UUID_MOST_SIG = "UUIDMostSig";
        public static final String UUID_LEAST_SIG= "UUIDLeastSig";
        public static final String OWNER = "owner";
        public static final String OWNER_UUID_MOST_SIG = "ownerUUIDMostSig";
        public static final String OWNER_UUID_LEAST_SIG = "ownerUUIDLeastSig";
    }

    public static final class Containers
    {
        public static final String LIGHT_INFUSED_POUCH = "container.candentis" + Items.LIGHT_INFUSED_POUCH;
        public static final String VANILLA_INVENTORY = "container.inventory";
    }
}
