package net.tysontheember.spelunkeryplus.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpelunkeryPlus.MODID);

    // Ice and Fire Items
    public static final RegistryObject<Item> IAF_ROUGH_SAPPHIRE =
            ModList.get().isLoaded("iceandfire") ? ITEMS.register("iaf_rough_sapphire", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> IAF_SAPPHIRE_SHARD =
            ModList.get().isLoaded("iceandfire") ? ITEMS.register("iaf_sapphire_shard", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> IAF_ROUGH_SAPPHIRE_SHARD =
            ModList.get().isLoaded("iceandfire") ? ITEMS.register("iaf_rough_sapphire_shard", () -> new Item(new Item.Properties())) : null;

    // Mining Master Items
    public static final RegistryObject<Item> MM_RAW_AIR_MALACHITE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_air_malachite", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_DIVE_AQUAMARINE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_dive_aquamarine", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_DIVINE_BERYL =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_divine_beryl", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_FIRE_RUBY =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_fire_ruby", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_HASTE_PERIDOT =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_haste_peridot", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_HEART_RHODONITE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_heart_rhodonite", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_ICE_SAPPHIRE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_ice_sapphire", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_KINETIC_OPAL =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_kinetic_opal", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_LUCKY_CITRINE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_lucky_citrine", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_POWER_PYRITE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_power_pyrite", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_SPIDER_KUNZITE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_spider_kunzite", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_SPIRIT_GARNET =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_spirit_garnet", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> MM_RAW_UNBREAKING_IOLITE =
            ModList.get().isLoaded("miningmaster") ? ITEMS.register("mm_raw_unbreaking_iolite", () -> new Item(new Item.Properties())) : null;

    // Caverns and Chasms Items
    public static final RegistryObject<Item> CC_ROUGH_SPINEL =
            ModList.get().isLoaded("caverns_and_chasms") ? ITEMS.register("cc_rough_spinel", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> CC_ROUGH_SPINEL_SHARD =
            ModList.get().isLoaded("caverns_and_chasms") ? ITEMS.register("cc_rough_spinel_shard", () -> new Item(new Item.Properties())) : null;
    public static final RegistryObject<Item> CC_SPINEL_SHARD =
            ModList.get().isLoaded("caverns_and_chasms") ? ITEMS.register("cc_spinel_shard", () -> new Item(new Item.Properties())) : null;

    // Forbidden Arcanus Items
    public static final RegistryObject<Item> FA_ROUGH_ARCANE_CRYSTAL =
            ModList.get().isLoaded("forbidden_arcanus") ? ITEMS.register("fa_rough_arcane_crystal", () -> new Item(new Item.Properties())) : null;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
