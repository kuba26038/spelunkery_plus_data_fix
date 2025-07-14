package net.tysontheember.spelunkeryplus.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpelunkeryPlus.MODID);


    public static final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
