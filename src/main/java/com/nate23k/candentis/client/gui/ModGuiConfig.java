package com.nate23k.candentis.client.gui;

import com.nate23k.candentis.handler.ConfigurationHandler;
import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created on 3/25/2015.
 */

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                    new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                    Reference.MOD_ID,
                    false,
                    false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
