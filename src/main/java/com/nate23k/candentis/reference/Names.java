package com.nate23k.candentis.reference;

/**
 * Created on 3/27/2015.
 */

public class Names
{
    public static final class Tools
    {
        // List of Pickaxes
        public static final String LIGHT_INFUSED_IRON_PICKAXE = "lightInfusedIronPickaxe";
        public static final String LIGHT_INFUSED_DIAMOND_PICKAXE = "lightInfusedDiamondPickaxe";

        // List of Shovels
        public static final String LIGHT_INFUSED_IRON_SHOVEL = "lightInfusedIronShovel";
        public static final String LIGHT_INFUSED_DIAMOND_SHOVEL = "lightInfusedDiamondShovel";

        // List of Swords
        public static final String LIGHT_INFUSED_IRON_SWORD = "lightInfusedIronSword";
        public static final String LIGHT_INFUSED_DIAMOND_SWORD = "lightInfusedDiamondSword";
        public static final String KAYLES_SWORD = "kaylesSword";

        // List of Axes
        public static final String LIGHT_INFUSED_IRON_AXE = "lightInfusedIronAxe";
        public static final String LIGHT_INFUSED_DIAMOND_AXE = "lightInfusedDiamondAxe";
    }
    public static final class Items
    {
        // List of Metals
        public static final String LIGHT_INFUSED_GOLD_INGOT = "lightInfusedGoldIngot";
        public static final String LIGHT_INFUSED_IRON_INGOT = "lightInfusedIronIngot";

        // List of Shiny Things
        public static final String LIGHT_INFUSED_DIAMOND = "lightInfusedDiamond";

        // List of Bags
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
