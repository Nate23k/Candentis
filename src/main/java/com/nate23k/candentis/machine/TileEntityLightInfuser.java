package com.nate23k.candentis.machine;

import com.nate23k.candentis.TileEntityCandentis;
import com.nate23k.candentis.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created on 3/30/2015.
 */

public class TileEntityLightInfuser extends TileEntityCandentis implements ISidedInventory
{
    public int maxLight = 10000;
    public float light = 0;
    public float lightPerTick = 10.0F;

    @Override
    public void updateEntity()
    {
        if(worldObj == null || worldObj.isRemote) {
            return;
        }
        collectLight();

        LogHelper.warn(returnLight());
    }

    private void collectLight()
    {
        if(canSeeSun() && isDaytime())
        {
            light += lightPerTick;
            light = Math.round(light);
        }
        if(light > maxLight)
        {
            light = maxLight;
        }
    }

    public float returnLight()
    {
        return light;
    }

    public int getLightScaled(int scaler)
    {
        return (int) (this.light * scaler / this.maxLight);
    }

    boolean canSeeSun()
    {
        return worldObj.canBlockSeeTheSky(xCoord, yCoord + 1, zCoord);
    }

    boolean isDaytime()
    {
        return worldObj.isDaytime();
    }

    public void readFromNBT(NBTTagCompound nbt)
    {

    }

    public void writeToNBT(NBTTagCompound nbt)
    {

    }

    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return false;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }
}
