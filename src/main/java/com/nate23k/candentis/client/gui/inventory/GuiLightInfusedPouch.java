package com.nate23k.candentis.client.gui.inventory;

import com.nate23k.candentis.inventory.ContainerLightInfusedPouch;
import com.nate23k.candentis.inventory.InventoryLightInfusedPouch;
import com.nate23k.candentis.reference.Colors;
import com.nate23k.candentis.reference.Names;
import com.nate23k.candentis.reference.Textures;
import com.nate23k.candentis.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

/**
 * Created on 3/27/2015.
 */

@SideOnly(Side.CLIENT)
public class GuiLightInfusedPouch extends GuiContainer {
    private final ItemStack parentItemStack;
    private final InventoryLightInfusedPouch inventoryAlchemicalBag;

    public GuiLightInfusedPouch(EntityPlayer entityPlayer, InventoryLightInfusedPouch inventoryAlchemicalBag) {
        super(new ContainerLightInfusedPouch(entityPlayer, inventoryAlchemicalBag));
        this.parentItemStack = inventoryAlchemicalBag.parentItemStack;
        this.inventoryAlchemicalBag = inventoryAlchemicalBag;
        if (this.parentItemStack.getItemDamage() == 0) {
            xSize = 230;
            ySize = 186;
        } else if (this.parentItemStack.getItemDamage() == 1) {
            xSize = 230;
            ySize = 240;
        } else if (this.parentItemStack.getItemDamage() == 2) {
            xSize = 248;
            ySize = 256;
        }
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        if (this.parentItemStack.getItemDamage() == 0 || this.parentItemStack.getItemDamage() == 1) {
            fontRendererObj.drawString(StatCollector.translateToLocal(inventoryAlchemicalBag.getInventoryName()), 8, 6, Integer.parseInt(Colors.PURE_WHITE, 16));
            fontRendererObj.drawString(StatCollector.translateToLocal(Names.Containers.VANILLA_INVENTORY), 35, ySize - 95 + 2, Integer.parseInt(Colors.PURE_WHITE, 16));
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (this.parentItemStack.getItemDamage() == 0) {
            this.mc.getTextureManager().bindTexture(Textures.Gui.LIGHT_INFUSED_POUCH_SMALL);
        } else if (this.parentItemStack.getItemDamage() == 1) {
            this.mc.getTextureManager().bindTexture(Textures.Gui.LIGHT_INFUSED_POUCH_MEDIUM);
        } else if (this.parentItemStack.getItemDamage() == 2) {
            this.mc.getTextureManager().bindTexture(Textures.Gui.LIGHT_INFUSED_POUCH_LARGE);
        }
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        if (mc.thePlayer != null) {
            for (ItemStack itemStack : mc.thePlayer.inventory.mainInventory) {
                if (itemStack != null) {
                    if (NBTHelper.hasTag(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN)) {
                        NBTHelper.removeTag(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN);
                    }
                }
            }
        }
    }
}
