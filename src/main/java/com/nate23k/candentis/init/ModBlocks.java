package com.nate23k.candentis.init;

import com.nate23k.candentis.block.BlockCandentis;
import com.nate23k.candentis.block.BlockLightInfusedBlock;
import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 3/26/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCandentis lightInfusedBlock = new BlockLightInfusedBlock();

    public static void init()
    {
        GameRegistry.registerBlock(lightInfusedBlock, "lightInfusedBlock");
    }
}
