package com.nate23k.candentis.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created on 3/30/2015.
 */
public class BlockContainerCandentis extends BlockContainer
{

    protected BlockContainerCandentis(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int var1) {
        return null;
    }
}
