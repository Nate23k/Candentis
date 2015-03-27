package com.nate23k.candentis.item;

import com.nate23k.candentis.creativetab.CreativeTabCandentis;
import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created on 3/26/2015.
 */
public class ItemCandentisPickaxe extends ItemPickaxe
{
    public ItemCandentisPickaxe(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(CreativeTabCandentis.Candentis_Tab);
    }

    //Formats Item names
    @Override
    public String getUnlocalizedName()
    {
        // item.modid:itemname.name
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    // Formats ItemStack names
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        // item.modid:itemname.name
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }


    // Registers the texture to the item
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    // Assists in formatting Item/Block/ItemStack names
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
