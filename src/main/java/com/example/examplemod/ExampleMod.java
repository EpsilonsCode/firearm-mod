package com.example.examplemod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod
{

    public static final String MODID = "examplemod";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Registry.register(bus);
    }

}
