package com.nate23k.candentis.block;

/**
 * Created on 3/26/2015.
 */
public class BlockLightInfusedBlock extends BlockCandentis
{
    public BlockLightInfusedBlock()
    {
        super();
        this.setBlockName("lightInfusedBlock");
        this.setBlockTextureName("lightInfusedBlock");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setLightLevel(0.85F);
        this.setStepSound(soundTypeMetal);
    }
}
