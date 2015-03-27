package com.nate23k.candentis.block;

import com.nate23k.candentis.creativetab.CreativeTabCandentis;

/**
 * Created on 3/26/2015.
 */
public class BlockLightInfusedIronBlock extends BlockCandentis
{
    public BlockLightInfusedIronBlock()
    {
        super();
        this.setBlockName("lightInfusedIronBlock");
        this.setBlockTextureName("lightInfusedIronBlock");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setLightLevel(0.85F);
        this.setStepSound(soundTypeMetal);
    }
}
