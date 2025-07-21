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


    public static final RegistryObject<Item> IAF_ROUGH_SAPPHIRE = ITEMS.register("iaf_rough_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IAF_SAPPHIRE_SHARD = ITEMS.register("iaf_sapphire_shard",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IAF_ROUGH_SAPPHIRE_SHARD = ITEMS.register("iaf_rough_sapphire_shard",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> MM_RAW_AIR_MALACHITE = ITEMS.register("mm_raw_air_malachite",
             () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_DIVE_AQUAMARINE = ITEMS.register("mm_raw_dive_aquamarine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_DIVINE_BERYL = ITEMS.register("mm_raw_divine_beryl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_FIRE_RUBY = ITEMS.register("mm_raw_fire_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_HASTE_PERIDOT = ITEMS.register("mm_raw_haste_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_HEART_RHODONITE = ITEMS.register("mm_raw_heart_rhodonite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_ICE_SAPPHIRE = ITEMS.register("mm_raw_ice_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_KINETIC_OPAL = ITEMS.register("mm_raw_kinetic_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_LUCKY_CITRINE = ITEMS.register("mm_raw_lucky_citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_POWER_PYRITE = ITEMS.register("mm_raw_power_pyrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_SPIDER_KUNZITE = ITEMS.register("mm_raw_spider_kunzite",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_SPIRIT_GARNET = ITEMS.register("mm_raw_spirit_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MM_RAW_UNBREAKING_IOLITE = ITEMS.register("mm_raw_unbreaking_iolite",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
