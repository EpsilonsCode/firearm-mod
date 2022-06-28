package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static void register(IEventBus bus)
    {
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> ITEM = ITEMS.register("item", () -> new Item(new Item.Properties()));

}
