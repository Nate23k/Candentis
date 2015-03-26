package com.nate23k.candentis.init;

import com.nate23k.candentis.item.ItemCandentis;
import com.nate23k.candentis.item.ItemLightInfusedIngot;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 3/25/2015.
 */
public class ModItems
{
    // List of items
    public static final ItemCandentis lightInfusedIngot = new ItemLightInfusedIngot();

    // Initializes the items
    public static void init()
    {
        GameRegistry.registerItem(lightInfusedIngot, "lightInfusedIngot");
    }
}
