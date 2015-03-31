package com.nate23k.candentis.inventory;

import com.nate23k.candentis.item.ItemLightInfusedPouch;
import com.nate23k.candentis.reference.Names;
import com.nate23k.candentis.utility.NBTHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created on 3/27/2015.
 */

public class ContainerLightInfusedPouch extends ContainerCandentis {
    // Small Bag
    public static final int SMALL_BAG_INVENTORY_ROWS = 4;
    public static final int SMALL_BAG_INVENTORY_COLUMNS = 12;
    // Medium Bag
    public static final int MEDIUM_BAG_INVENTORY_ROWS = 7;
    public static final int MEDIUM_BAG_INVENTORY_COLUMNS = 12;
    // Large Bag
    public static final int LARGE_BAG_INVENTORY_ROWS = 9;
    public static final int LARGE_BAG_INVENTORY_COLUMNS = 13;
    private final EntityPlayer entityPlayer;
    private final InventoryLightInfusedPouch inventoryLightInfusedPouch;
    private int bagInventoryRows;
    private int bagInventoryColumns;

    public ContainerLightInfusedPouch(EntityPlayer entityPlayer, InventoryLightInfusedPouch inventoryLightInfusedPouch) {
        this.entityPlayer = entityPlayer;
        this.inventoryLightInfusedPouch = inventoryLightInfusedPouch;
        if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 0) {
            bagInventoryRows = SMALL_BAG_INVENTORY_ROWS;
            bagInventoryColumns = SMALL_BAG_INVENTORY_COLUMNS;
        } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 1) {
            bagInventoryRows = MEDIUM_BAG_INVENTORY_ROWS;
            bagInventoryColumns = MEDIUM_BAG_INVENTORY_COLUMNS;
        } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 2) {
            bagInventoryRows = LARGE_BAG_INVENTORY_ROWS;
            bagInventoryColumns = LARGE_BAG_INVENTORY_COLUMNS;
        }
// Add the Alchemical Chest slots to the container
        for (int bagRowIndex = 0; bagRowIndex < bagInventoryRows; ++bagRowIndex) {
            for (int bagColumnIndex = 0; bagColumnIndex < bagInventoryColumns; ++bagColumnIndex) {
                if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 0) {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryLightInfusedPouch, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 18 + bagRowIndex * 18));
                } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 1) {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryLightInfusedPouch, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 18 + bagRowIndex * 18));
                } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 2) {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryLightInfusedPouch, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 8 + bagRowIndex * 18));
                }
            }
        }
// Add the player's inventory slots to the container
        for (int inventoryRowIndex = 0; inventoryRowIndex < PLAYER_INVENTORY_ROWS; ++inventoryRowIndex) {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < PLAYER_INVENTORY_COLUMNS; ++inventoryColumnIndex) {
                if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 0) {
                    this.addSlotToContainer(new Slot(entityPlayer.inventory, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 35 + inventoryColumnIndex * 18, 104 + inventoryRowIndex * 18));
                } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 1) {
                    this.addSlotToContainer(new Slot(entityPlayer.inventory, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 35 + inventoryColumnIndex * 18, 158 + inventoryRowIndex * 18));
                } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 2) {
                    this.addSlotToContainer(new Slot(entityPlayer.inventory, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 44 + inventoryColumnIndex * 18, 174 + inventoryRowIndex * 18));
                }
            }
        }
// Add the player's action bar slots to the container
        for (int actionBarSlotIndex = 0; actionBarSlotIndex < PLAYER_INVENTORY_COLUMNS; ++actionBarSlotIndex) {
            if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 0) {
                this.addSlotToContainer(new Slot(entityPlayer.inventory, actionBarSlotIndex, 35 + actionBarSlotIndex * 18, 162));
            } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 1) {
                this.addSlotToContainer(new Slot(entityPlayer.inventory, actionBarSlotIndex, 35 + actionBarSlotIndex * 18, 216));
            } else if (inventoryLightInfusedPouch.parentItemStack.getItemDamage() == 2) {
                this.addSlotToContainer(new Slot(entityPlayer.inventory, actionBarSlotIndex, 44 + actionBarSlotIndex * 18, 232));
            }
        }
    }

    @Override
    public void onContainerClosed(EntityPlayer entityPlayer) {
        super.onContainerClosed(entityPlayer);
        if (!entityPlayer.worldObj.isRemote) {
// We can probably do this better now considering the InventoryLightInfusedPouch has a findParent method
            InventoryPlayer invPlayer = entityPlayer.inventory;
            for (ItemStack itemStack : invPlayer.mainInventory) {
                if (itemStack != null) {
                    if (NBTHelper.hasTag(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN)) {
                        NBTHelper.removeTag(itemStack, Names.NBT.LIGHT_INFUSED_POUCH_GUI_OPEN);
                    }
                }
            }
            saveInventory(entityPlayer);
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotIndex) {
        ItemStack newItemStack = null;
        Slot slot = (Slot) inventorySlots.get(slotIndex);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemStack = slot.getStack();
            newItemStack = itemStack.copy();
// Attempt to shift click something from the bag inventory into the player inventory
            if (slotIndex < bagInventoryRows * bagInventoryColumns) {
                if (!this.mergeItemStack(itemStack, bagInventoryRows * bagInventoryColumns, inventorySlots.size(), false)) {
                    return null;
                }
            }
// Special case if we are dealing with an Alchemical Bag being shift clicked
            else if (itemStack.getItem() instanceof ItemLightInfusedPouch) {
// Attempt to shift click a bag from the player inventory into the hot bar inventory
                if (slotIndex < (bagInventoryRows * bagInventoryColumns) + (PLAYER_INVENTORY_ROWS * PLAYER_INVENTORY_COLUMNS)) {
                    if (!this.mergeItemStack(itemStack, (bagInventoryRows * bagInventoryColumns) + (PLAYER_INVENTORY_ROWS * PLAYER_INVENTORY_COLUMNS), inventorySlots.size(), false)) {
                        return null;
                    }
                }
// Attempt to shift click a bag from the hot bar inventory into the player inventory
                else if (!this.mergeItemStack(itemStack, bagInventoryRows * bagInventoryColumns, (bagInventoryRows * bagInventoryColumns) + (PLAYER_INVENTORY_ROWS * PLAYER_INVENTORY_COLUMNS), false)) {
                    return null;
                }
            }
// Attempt to shift click a non-Alchemical Bag into the bag inventory
            else if (!this.mergeItemStack(itemStack, 0, bagInventoryRows * bagInventoryColumns, false)) {
                return null;
            }
            if (itemStack.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }
        }
        return newItemStack;
    }

    public void saveInventory(EntityPlayer entityPlayer) {
        inventoryLightInfusedPouch.onGuiSaved(entityPlayer);
    }

    private class SlotAlchemicalBag extends Slot {
        private final EntityPlayer entityPlayer;
        private ContainerLightInfusedPouch containerAlchemicalBag;

        public SlotAlchemicalBag(ContainerLightInfusedPouch containerAlchemicalBag, IInventory inventory, EntityPlayer entityPlayer, int slotIndex, int x, int y) {
            super(inventory, slotIndex, x, y);
            this.entityPlayer = entityPlayer;
            this.containerAlchemicalBag = containerAlchemicalBag;
        }

        @Override
        public void onSlotChange(ItemStack itemStack1, ItemStack itemStack2) {
            super.onSlotChange(itemStack1, itemStack2);
            containerAlchemicalBag.saveInventory(entityPlayer);
        }

        /**
         * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
         */
        @Override
        public boolean isItemValid(ItemStack itemStack) {
            return !(itemStack.getItem() instanceof ItemLightInfusedPouch);
        }
    }
}

