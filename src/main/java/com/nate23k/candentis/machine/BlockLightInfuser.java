package com.nate23k.candentis.machine;

import com.nate23k.candentis.Candentis;
import com.nate23k.candentis.block.BlockContainerCandentis;
import com.nate23k.candentis.reference.GUIs;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote)
        {
            FMLNetworkHandler.openGui(entityPlayer, Candentis.instance, GUIs.LIGHT_INFUSER.ordinal(), world, x, y, z);
        }
        return true;
    }

    public TileEntity createNewTileEntity(World world, int var1) {
        return new TileEntityLightInfuser();
    }
}
