package com.nate23k.candentis.creativetab;

import com.nate23k.candentis.init.ModItems;
import com.nate23k.candentis.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created on 3/26/2015.
 */

public class CreativeTabCandentis
{
    public static final CreativeTabs Candentis_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.lightInfusedIronIngot;
        }
    };
}
