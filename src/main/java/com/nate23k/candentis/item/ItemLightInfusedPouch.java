package com.nate23k.candentis.item;

import com.nate23k.candentis.Candentis;
import com.nate23k.candentis.reference.*;
import com.nate23k.candentis.utility.ColorHelper;
import com.nate23k.candentis.utility.IOwnable;
import com.nate23k.candentis.utility.ItemHelper;
import com.nate23k.candentis.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created on 3/27/2015.
 */

public class ItemLightInfusedPouch extends ItemCandentis implements IOwnable
{
    private static final String[] LIGHT_INFUSED_POUCH_ICONS = {"open", "closed", "symbolTier1", "symbolTier2", "symbolTier3"};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    public ItemLightInfusedPouch()
    {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Names.Items.LIGHT_INFUSED_POUCH);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        icons = new IIcon[LIGHT_INFUSED_POUCH_ICONS.length];
        for (int i = 0; i < LIGHT_INFUSED_POUCH_ICONS.length; i++)
        {
            icons[i] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + Names.Items.LIGHT_INFUSED_POUCH + "." + LIGHT_INFUSED_POUCH_ICONS[i]);
        }
    }
    @Override
    public IIcon getIcon(ItemStack itemStack, int renderPass)
    {
        if (renderPass == 0)
        {
            if (NBTHelper.hasTag(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN))
            {
                return icons[0];
            }
            else
            {
                return icons[1];
            }
        }
        else
        {
            return icons[2 + MathHelper.clamp_int(itemStack.getItemDamage(), 0, 3)];
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTab, List list)
    {
        for (int meta = 0; meta < 3; ++meta)
        {
            list.add(new ItemStack(this, 1, meta));
        }
    }
    @Override
    public boolean getShareTag()
    {
        return true;
    }
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        if (!world.isRemote)
        {
            if (!ItemHelper.hasOwnerUUID(itemStack))
            {
                ItemHelper.setOwner(itemStack, entityPlayer);
                entityPlayer.addChatComponentMessage(new ChatComponentTranslation(Messages.OWNER_SET_TO_SELF, new Object[]{itemStack.func_151000_E()}));
            }
// Set a UUID on the Alchemical Bag, if one doesn't exist already
            NBTHelper.setUUID(itemStack);
            NBTHelper.setBoolean(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN, true);
            entityPlayer.openGui(Candentis.instance, GUIs.ALCHEMICAL_BAG.ordinal(), entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
        }
        return itemStack;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack itemStack, int renderPass)
    {
        int bagColor = this.getColor(itemStack);
        if (bagColor < 0)
        {
            bagColor = Integer.parseInt(Colors.PURE_WHITE, 16);
        }
        return bagColor;
    }
    public boolean hasColor(ItemStack itemStack)
    {
        return ColorHelper.hasColor(itemStack);
    }
    public int getColor(ItemStack itemStack)
    {
        return ColorHelper.getColor(itemStack);
    }
    public void setColor(ItemStack itemStack, int color)
    {
        if (itemStack != null)
        {
            if (itemStack.getItem() instanceof ItemLightInfusedPouch)
            {
                ColorHelper.setColor(itemStack, color);
            }
        }
    }
    public void removeColor(ItemStack itemStack) {
        if (itemStack != null) {
            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
            if (nbtTagCompound != null) {
                NBTTagCompound displayTagCompound = nbtTagCompound.getCompoundTag(Names.NBT.DISPLAY);
                if (displayTagCompound.hasKey(Names.NBT.COLOR)) {
                    displayTagCompound.removeTag(Names.NBT.COLOR);
                }
            }
        }
    }
}

