package com.nate23k.candentis.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created on 3/26/2015.
 */

public class Recipes
{
    public static void init()
    {
        // Swords
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSword), " i ", " i ", " s ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSword), "  i", "  i", "  s", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSword), "i  ", "i  ", "s  ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));

        // Pickaxes
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronPickaxe), "iii", " s ", " s ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));

        // Spades
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSpade), " i ", " s ", " s ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSpade), "i  ", "s  ", "s  ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronSpade), "  i", "  s", "  s", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));

        // Axes
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronAxe), "ii ", "is ", " s ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightInfusedIronAxe), " ii", " si", " s ", 'i', new ItemStack(ModItems.lightInfusedIronIngot), 's', new ItemStack(Items.stick));

        // Light Infused Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lightInfusedIronBlock), "iii", "iii", "iii", 'i', new ItemStack(ModItems.lightInfusedIronIngot));
    }
}
