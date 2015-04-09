package com.nate23k.candentis.client.gui.machine;

import com.nate23k.candentis.inventory.ContainerLightInfuser;
import com.nate23k.candentis.machine.TileEntityLightInfuser;
import com.nate23k.candentis.reference.Textures;
import com.nate23k.candentis.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created on 4/1/2015.
 */

@SideOnly(Side.CLIENT)
public class GuiLightInfuser extends GuiContainer
{
    TileEntityLightInfuser tileEntityLightInfuser;

    public GuiLightInfuser(InventoryPlayer inventoryPlayer, TileEntityLightInfuser tileEntityLightInfuser)
    {
        super(new ContainerLightInfuser(inventoryPlayer, tileEntityLightInfuser));

        this.tileEntityLightInfuser = tileEntityLightInfuser;

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        this.mc.getTextureManager().bindTexture(Textures.Gui.LIGHT_INFUSER);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        int i = tileEntityLightInfuser.getLightScaled(45);
        drawTexturedModalRect(guiLeft + 135, guiTop + 17 + 45 - i, 176, 45-i, 12, i);

        LogHelper.info(this.tileEntityLightInfuser.light);
    }
}
