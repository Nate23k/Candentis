package com.nate23k.candentis.init;

import com.nate23k.candentis.block.BlockCandentis;
import com.nate23k.candentis.block.BlockContainerCandentis;
import com.nate23k.candentis.block.BlockLightInfusedIronBlock;
import com.nate23k.candentis.machine.BlockLightInfuser;
import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 3/26/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //List of Blocks
    public static final BlockCandentis lightInfusedIronBlock = new BlockLightInfusedIronBlock();

    // List of Machines
    public static final BlockContainerCandentis lightInfuser = new BlockLightInfuser();

    // Initializes the blocks
    public static void init()
    {
        GameRegistry.registerBlock(lightInfusedIronBlock, "lightInfusedBlock");
        GameRegistry.registerBlock(lightInfuser, "lightInfuser");
    }
}
