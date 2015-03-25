package com.nate23k.candentis.handler;

import com.nate23k.candentis.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created on 3/25/2015.
 */

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is dumb");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

}
