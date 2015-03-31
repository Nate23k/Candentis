package com.nate23k.candentis.machine;

import com.nate23k.candentis.block.BlockContainerCandentis;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created on 3/30/2015.
 */
public class BlockLightInfuser extends BlockContainerCandentis
{
    public BlockLightInfuser()
    {
        super(Material.rock);
        this.setBlockName("lightInfuser");
        this.setBlockTextureName("lightInfuser");
    }

    public TileEntity createNewTileEntity(World world, int var1) {
        return new TileEntityLightInfuser();
    }
}
