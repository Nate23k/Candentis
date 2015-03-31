package com.nate23k.candentis.init;

import com.nate23k.candentis.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created on 3/25/2015.
 */
public class ModItems
{
    // List of new materials
    public static Item.ToolMaterial LIGHTINFUSEDIRON = EnumHelper.addToolMaterial("LIGHTINFUSEDIRON", 3, 500, 14.0F, 5.0F, 13);

    // List of Ingots
    public static final ItemCandentis lightInfusedIronIngot = new ItemLightInfusedIronIngot();

    // List of Swords
    public static final ItemCandentisSword lightInfusedIronSword = new ItemLightInfusedIronSword(LIGHTINFUSEDIRON);

    // List of Pickaxes
    public static final ItemCandentisPickaxe lightInfusedIronPickaxe = new ItemLightInfusedIronPickaxe(LIGHTINFUSEDIRON);

    // List of Bags
    public static final ItemLightInfusedPouch lightInfusedPouch = new ItemLightInfusedPouch();

    // Initializes the items
    public static void init()
    {
        GameRegistry.registerItem(lightInfusedPouch, "lightInfusedPouch");
        GameRegistry.registerItem(lightInfusedIronIngot, "lightInfusedIngot");
        GameRegistry.registerItem(lightInfusedIronSword, "lightInfusedIronSword");
        GameRegistry.registerItem(lightInfusedIronPickaxe, "lightInfusedIronPickaxe");
    }
}
