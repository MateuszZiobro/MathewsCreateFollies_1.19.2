package com.matthew.matthewscreatefollies.item;

import com.matthew.matthewscreatefollies.MatthewsCreateFollies;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MatthewsCreateFollies.MOD_ID);
    public static final RegistryObject<Item> MAGNUMHEXE =Items.register("magnumhexe",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static void register(IEventBus eventBus){
        Items.register(eventBus);

    }

}
