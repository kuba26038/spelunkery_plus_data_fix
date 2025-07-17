package net.tysontheember.spelunkeryplus;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.block.ModBlocks;
import net.tysontheember.spelunkeryplus.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpelunkeryPlus.MODID)
public class SpelunkeryPlus
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "spelunkeryplus";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpelunkeryPlus(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
//        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            event.accept(ModItems.ROUGH_SAPPHIRE);
            event.accept(ModItems.ROUGH_SAPPHIRE_SHARD);
            event.accept(ModItems.SAPPHIRE_SHARD);
            event.accept(ModBlocks.ROUGH_SAPPHIRE_BLOCK);
            event.accept(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE);
            event.accept(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE);
            event.accept(ModBlocks.IAF_TUFF_SAPPHIRE_ORE);
            event.accept(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.IAF_GRANITE_SAPPHIRE_ORE);

            event.accept(ModBlocks.MM_RAW_AIR_MALACHITE_BLOCK);
            event.accept(ModBlocks.MM_RAW_DIVE_AQUAMARINE_BLOCK);
            event.accept(ModBlocks.MM_RAW_DIVINE_BERYL_BLOCK);
            event.accept(ModBlocks.MM_RAW_FIRE_RUBY_BLOCK);
            event.accept(ModBlocks.MM_RAW_HASTE_PERIDOT_BLOCK);
            event.accept(ModBlocks.MM_RAW_HEART_RHODONITE_BLOCK);
            event.accept(ModBlocks.MM_RAW_ICE_SAPPHIRE_BLOCK);
            event.accept(ModBlocks.MM_RAW_KINETIC_OPAL_BLOCK);
            event.accept(ModBlocks.MM_RAW_LUCKY_CITRINE_BLOCK);
            event.accept(ModBlocks.MM_RAW_POWER_PYRITE_BLOCK);
            event.accept(ModBlocks.MM_RAW_SPIDER_KUNZITE_BLOCK);
            event.accept(ModBlocks.MM_RAW_SPIRIT_GARNET_BLOCK);
            event.accept(ModBlocks.MM_RAW_UNBREAKING_IOLITE_BLOCK);

            event.accept(ModItems.MM_RAW_AIR_MALACHITE);
            event.accept(ModItems.MM_RAW_DIVE_AQUAMARINE);
            event.accept(ModItems.MM_RAW_DIVINE_BERYL);
            event.accept(ModItems.MM_RAW_FIRE_RUBY);
            event.accept(ModItems.MM_RAW_HASTE_PERIDOT);
            event.accept(ModItems.MM_RAW_HEART_RHODONITE);
            event.accept(ModItems.MM_RAW_ICE_SAPPHIRE);
            event.accept(ModItems.MM_RAW_KINETIC_OPAL);
            event.accept(ModItems.MM_RAW_LUCKY_CITRINE);
            event.accept(ModItems.MM_RAW_POWER_PYRITE);
            event.accept(ModItems.MM_RAW_SPIDER_KUNZITE);
            event.accept(ModItems.MM_RAW_SPIRIT_GARNET);
            event.accept(ModItems.MM_RAW_UNBREAKING_IOLITE);
            //Andesite
            event.accept(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE);
            event.accept(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE);
            event.accept(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE);
            event.accept(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE);
            event.accept(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE);
            event.accept(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE);
            event.accept(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE);
            event.accept(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE);
            event.accept(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE);
            //Diorite
            event.accept(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE);
            event.accept(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE);
            event.accept(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE);
            event.accept(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE);
            event.accept(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE);
            event.accept(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE);
            event.accept(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE);
            event.accept(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE);
            event.accept(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE);
            //Granite
            event.accept(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE);
            event.accept(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE);
            event.accept(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE);
            event.accept(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE);
            event.accept(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE);
            event.accept(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE);
            event.accept(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE);
            event.accept(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE);
            event.accept(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE);
            //Tuff
            event.accept(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE);
            event.accept(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE);
            event.accept(ModBlocks.MM_TUFF_FIRE_RUBY_ORE);
            event.accept(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE);
            event.accept(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE);
            event.accept(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE);
            event.accept(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE);
            event.accept(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE);
            event.accept(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE);

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
