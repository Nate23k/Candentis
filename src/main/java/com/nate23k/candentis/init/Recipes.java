package com.nate23k.candentis.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created on 3/26/2015.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lightInfusedBlock), "iii", "iii", "iii", 'i', new ItemStack(ModItems.lightInfusedIngot));
    }
}
