package com.nate23k.candentis.init;

import com.nate23k.candentis.item.*;
import com.nate23k.candentis.item.bags.ItemLightInfusedPouch;
import com.nate23k.candentis.item.metals.ItemLightInfusedGoldIngot;
import com.nate23k.candentis.item.metals.ItemLightInfusedIronIngot;
import com.nate23k.candentis.item.shinythings.ItemLightInfusedDiamond;
import com.nate23k.candentis.item.tools.axes.ItemLightInfusedDiamondAxe;
import com.nate23k.candentis.item.tools.axes.ItemLightInfusedIronAxe;
import com.nate23k.candentis.item.tools.pickaxes.ItemLightInfusedDiamondPickaxe;
import com.nate23k.candentis.item.tools.pickaxes.ItemLightInfusedIronPickaxe;
import com.nate23k.candentis.item.tools.spades.ItemLightInfusedDiamondSpade;
import com.nate23k.candentis.item.tools.spades.ItemLightInfusedIronSpade;
import com.nate23k.candentis.item.tools.swords.ItemKaylesSword;
import com.nate23k.candentis.item.tools.swords.ItemLightInfusedDiamondSword;
import com.nate23k.candentis.item.tools.swords.ItemLightInfusedIronSword;
import com.nate23k.candentis.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created on 3/25/2015.
 */

public class ModItems
{
    // List of new materials                                                       (Name, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
    public static Item.ToolMaterial LIGHT_INFUSED_IRON = EnumHelper.addToolMaterial("LIGHT_INFUSED_IRON", 3, 500, 14.0F, 5.0F, 13);
    public static Item.ToolMaterial LIGHT_INFUSED_GOLD = EnumHelper.addToolMaterial("LIGHT_INFUSED_GOLD", 3, 100, 18.0F, 6.0F, 15);
    public static Item.ToolMaterial LIGHT_INFUSED_DIAMOND = EnumHelper.addToolMaterial("LIGHT_INFUSED_DIAMOND", 5, 800, 17.0F, 7.0F, 14);
    public static Item.ToolMaterial KAYLES_SWORD = EnumHelper.addToolMaterial("KAYLES_SWORD", 1, 2000, 1.0F, 12.0F, 20);

    // List of Shiny Things
    public static final ItemCandentis lightInfusedDiamond = new ItemLightInfusedDiamond();

    // List of Metals
    public static final ItemCandentis lightInfusedIronIngot = new ItemLightInfusedIronIngot();
    public static final ItemCandentis lightInfusedGoldIngot = new ItemLightInfusedGoldIngot();

    // List of Swords
    public static final ItemCandentisSword kaylesSword = new ItemKaylesSword(KAYLES_SWORD);
    public static final ItemCandentisSword lightInfusedIronSword = new ItemLightInfusedIronSword(LIGHT_INFUSED_IRON);
    public static final ItemCandentisSword lightInfusedDiamondSword = new ItemLightInfusedDiamondSword(LIGHT_INFUSED_DIAMOND);

    // List of Pickaxes
    public static final ItemCandentisPickaxe lightInfusedIronPickaxe = new ItemLightInfusedIronPickaxe(LIGHT_INFUSED_IRON);
    public static final ItemCandentisPickaxe lightInfusedDiamondPickaxe = new ItemLightInfusedDiamondPickaxe(LIGHT_INFUSED_DIAMOND);

    // List of Shovels
    public static final ItemCandentisSpade lightInfusedIronSpade = new ItemLightInfusedIronSpade(LIGHT_INFUSED_IRON);
    public static final ItemCandentisSpade lightInfusedDiamondSpade = new ItemLightInfusedDiamondSpade(LIGHT_INFUSED_DIAMOND);

    // List of Axes
    public static final ItemCandentisAxe lightInfusedIronAxe = new ItemLightInfusedIronAxe(LIGHT_INFUSED_IRON);
    public static final ItemCandentisAxe lightInfusedDiamondAxe = new ItemLightInfusedDiamondAxe(LIGHT_INFUSED_DIAMOND);

    // List of Bags
    public static final ItemCandentis lightInfusedPouch = new ItemLightInfusedPouch();

    // Initializes the items
    public static void init()
    {
        GameRegistry.registerItem(kaylesSword, Names.Tools.KAYLES_SWORD);
        GameRegistry.registerItem(lightInfusedDiamondSword, Names.Tools.LIGHT_INFUSED_DIAMOND_SWORD);
        GameRegistry.registerItem(lightInfusedDiamondSpade, Names.Tools.LIGHT_INFUSED_DIAMOND_SHOVEL);
        GameRegistry.registerItem(lightInfusedDiamondPickaxe, Names.Tools.LIGHT_INFUSED_DIAMOND_PICKAXE);
        GameRegistry.registerItem(lightInfusedDiamondAxe, Names.Tools.LIGHT_INFUSED_DIAMOND_AXE);
        GameRegistry.registerItem(lightInfusedIronAxe, Names.Tools.LIGHT_INFUSED_IRON_AXE);
        GameRegistry.registerItem(lightInfusedIronSpade, Names.Tools.LIGHT_INFUSED_IRON_SHOVEL);
        GameRegistry.registerItem(lightInfusedDiamond, Names.Items.LIGHT_INFUSED_DIAMOND);
        GameRegistry.registerItem(lightInfusedGoldIngot, Names.Items.LIGHT_INFUSED_GOLD_INGOT);
        GameRegistry.registerItem(lightInfusedPouch, Names.Items.LIGHT_INFUSED_POUCH);
        GameRegistry.registerItem(lightInfusedIronIngot, Names.Items.LIGHT_INFUSED_IRON_INGOT);
        GameRegistry.registerItem(lightInfusedIronSword, Names.Tools.LIGHT_INFUSED_IRON_SWORD);
        GameRegistry.registerItem(lightInfusedIronPickaxe, Names.Tools.LIGHT_INFUSED_IRON_PICKAXE);
    }
}
