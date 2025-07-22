package net.tysontheember.spelunkeryplus.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.valhelsia.valhelsia_core.api.client.ValhelsiaRenderType;
import net.valhelsia.valhelsia_core.api.common.registry.helper.block.BlockRegistryEntry;

import net.minecraftforge.fml.ModList;

import java.util.function.Supplier;

import static com.stal111.forbidden_arcanus.core.init.ModBlocks.HELPER;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SpelunkeryPlus.MODID);
    
    
    
//Ice and Fire
    public static final RegistryObject<Block> IAF_ROUGH_SAPPHIRE_BLOCK = registerBlock("iaf_rough_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> IAF_DEEPSLATE_SAPPHIRE_ORE = registerBlock("iaf_deepslate_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_TUFF_SAPPHIRE_ORE = registerBlock("iaf_tuff_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_GRANITE_SAPPHIRE_ORE = registerBlock("iaf_granite_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_DIORITE_SAPPHIRE_ORE = registerBlock("iaf_diorite_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_ANDESITE_SAPPHIRE_ORE = registerBlock("iaf_andesite_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_TUFF_SILVER_ORE = registerBlock("iaf_tuff_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_GRANITE_SILVER_ORE = registerBlock("iaf_granite_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_DIORITE_SILVER_ORE = registerBlock("iaf_diorite_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> IAF_ANDESITE_SILVER_ORE = registerBlock("iaf_andesite_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));


//Mining Master
    public static final RegistryObject<Block> MM_RAW_AIR_MALACHITE_BLOCK = registerBlock("mm_raw_air_malachite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_DIVE_AQUAMARINE_BLOCK = registerBlock("mm_raw_dive_aquamarine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_DIVINE_BERYL_BLOCK = registerBlock("mm_raw_divine_beryl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_FIRE_RUBY_BLOCK = registerBlock("mm_raw_fire_ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_HASTE_PERIDOT_BLOCK = registerBlock("mm_raw_haste_peridot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_HEART_RHODONITE_BLOCK = registerBlock("mm_raw_heart_rhodonite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_ICE_SAPPHIRE_BLOCK = registerBlock("mm_raw_ice_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_KINETIC_OPAL_BLOCK = registerBlock("mm_raw_kinetic_opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_LUCKY_CITRINE_BLOCK = registerBlock("mm_raw_lucky_citrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_POWER_PYRITE_BLOCK = registerBlock("mm_raw_power_pyrite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_SPIDER_KUNZITE_BLOCK = registerBlock("mm_raw_spider_kunzite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_SPIRIT_GARNET_BLOCK = registerBlock("mm_raw_spirit_garnet_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> MM_RAW_UNBREAKING_IOLITE_BLOCK = registerBlock("mm_raw_unbreaking_iolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));


    //ANDESITE
    public static final RegistryObject<Block> MM_ANDESITE_DIVE_AQUAMARINE_ORE = registerBlock("mm_andesite_dive_aquamarine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_DIVINE_BERYL_ORE = registerBlock("mm_andesite_divine_beryl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_FIRE_RUBY_ORE = registerBlock("mm_andesite_fire_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_HASTE_PERIDOT_ORE = registerBlock("mm_andesite_haste_peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_ICE_SAPPHIRE_ORE = registerBlock("mm_andesite_ice_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_LUCKY_CITRINE_ORE = registerBlock("mm_andesite_lucky_citrine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_SPIDER_KUNZITE_ORE = registerBlock("mm_andesite_spider_kunzite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_SPIRIT_GARNET_ORE = registerBlock("mm_andesite_spirit_garnet_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_ANDESITE_UNBREAKING_IOLITE_ORE = registerBlock("mm_andesite_unbreaking_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));


    //DIORITE
    public static final RegistryObject<Block> MM_DIORITE_DIVE_AQUAMARINE_ORE = registerBlock("mm_diorite_dive_aquamarine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_DIVINE_BERYL_ORE = registerBlock("mm_diorite_divine_beryl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_FIRE_RUBY_ORE = registerBlock("mm_diorite_fire_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_HASTE_PERIDOT_ORE = registerBlock("mm_diorite_haste_peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_ICE_SAPPHIRE_ORE = registerBlock("mm_diorite_ice_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_LUCKY_CITRINE_ORE = registerBlock("mm_diorite_lucky_citrine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_SPIDER_KUNZITE_ORE = registerBlock("mm_diorite_spider_kunzite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_SPIRIT_GARNET_ORE = registerBlock("mm_diorite_spirit_garnet_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_DIORITE_UNBREAKING_IOLITE_ORE = registerBlock("mm_diorite_unbreaking_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));

    //GRANITE
    public static final RegistryObject<Block> MM_GRANITE_DIVE_AQUAMARINE_ORE = registerBlock("mm_granite_dive_aquamarine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_DIVINE_BERYL_ORE = registerBlock("mm_granite_divine_beryl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_FIRE_RUBY_ORE = registerBlock("mm_granite_fire_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_HASTE_PERIDOT_ORE = registerBlock("mm_granite_haste_peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_ICE_SAPPHIRE_ORE = registerBlock("mm_granite_ice_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_LUCKY_CITRINE_ORE = registerBlock("mm_granite_lucky_citrine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_SPIDER_KUNZITE_ORE = registerBlock("mm_granite_spider_kunzite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_SPIRIT_GARNET_ORE = registerBlock("mm_granite_spirit_garnet_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_GRANITE_UNBREAKING_IOLITE_ORE = registerBlock("mm_granite_unbreaking_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));

    //TUFF
    public static final RegistryObject<Block> MM_TUFF_DIVE_AQUAMARINE_ORE = registerBlock("mm_tuff_dive_aquamarine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_DIVINE_BERYL_ORE = registerBlock("mm_tuff_divine_beryl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_FIRE_RUBY_ORE = registerBlock("mm_tuff_fire_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_HASTE_PERIDOT_ORE = registerBlock("mm_tuff_haste_peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_ICE_SAPPHIRE_ORE = registerBlock("mm_tuff_ice_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_LUCKY_CITRINE_ORE = registerBlock("mm_tuff_lucky_citrine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_SPIDER_KUNZITE_ORE = registerBlock("mm_tuff_spider_kunzite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_SPIRIT_GARNET_ORE = registerBlock("mm_tuff_spirit_garnet_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MM_TUFF_UNBREAKING_IOLITE_ORE = registerBlock("mm_tuff_unbreaking_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));


//Forbidden And Arcanus
    public static final BlockRegistryEntry<DropExperienceBlock> FA_ANDESITE_ARCANE_CRYSTAL_ORE =
            ModList.get().isLoaded("forbidden_arcanus")
                    ? HELPER.register(
                            "fa_andesite_arcane_crystal_ore",
                            () -> new DropExperienceBlock(
                                    BlockBehaviour.Properties.of()
                                            .mapColor(MapColor.STONE)
                                            .instrument(NoteBlockInstrument.BASEDRUM)
                                            .requiresCorrectToolForDrops()
                                            .strength(3.0F),
                                    UniformInt.of(2, 5)
                            )
                    )
                    .withItem()
                    .renderType(ValhelsiaRenderType.CUTOUT)
                    : null;

    public static final BlockRegistryEntry<DropExperienceBlock> FA_DIORITE_ARCANE_CRYSTAL_ORE =
            ModList.get().isLoaded("forbidden_arcanus")
                    ? HELPER.register(
                            "fa_diorite_arcane_crystal_ore",
                            () -> new DropExperienceBlock(
                                    BlockBehaviour.Properties.of()
                                            .mapColor(MapColor.STONE)
                                            .instrument(NoteBlockInstrument.BASEDRUM)
                                            .requiresCorrectToolForDrops()
                                            .strength(3.0F),
                                    UniformInt.of(2, 5)
                            )
                    )
                    .withItem()
                    .renderType(ValhelsiaRenderType.CUTOUT)
                    : null;

    public static final BlockRegistryEntry<DropExperienceBlock> FA_GRANITE_ARCANE_CRYSTAL_ORE =
            ModList.get().isLoaded("forbidden_arcanus")
                    ? HELPER.register(
                            "fa_granite_arcane_crystal_ore",
                            () -> new DropExperienceBlock(
                                    BlockBehaviour.Properties.of()
                                            .mapColor(MapColor.STONE)
                                            .instrument(NoteBlockInstrument.BASEDRUM)
                                            .requiresCorrectToolForDrops()
                                            .strength(3.0F),
                                    UniformInt.of(2, 5)
                            )
                    )
                    .withItem()
                    .renderType(ValhelsiaRenderType.CUTOUT)
                    : null;

    public static final BlockRegistryEntry<DropExperienceBlock> FA_TUFF_ARCANE_CRYSTAL_ORE =
            ModList.get().isLoaded("forbidden_arcanus")
                    ? HELPER.register(
                            "fa_tuff_arcane_crystal_ore",
                            () -> new DropExperienceBlock(
                                    BlockBehaviour.Properties.of()
                                            .mapColor(MapColor.STONE)
                                            .instrument(NoteBlockInstrument.BASEDRUM)
                                            .requiresCorrectToolForDrops()
                                            .strength(3.0F),
                                    UniformInt.of(2, 5)
                            )
                    )
                    .withItem()
                    .renderType(ValhelsiaRenderType.CUTOUT)
                    : null;



//Caverns and Chasms

    public static final RegistryObject<Block> CC_ANDESITE_SPINEL_ORE = registerBlock("cc_andesite_spinel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CC_DIORITE_SPINEL_ORE = registerBlock("cc_diorite_spinel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CC_GRANITE_SPINEL_ORE = registerBlock("cc_granite_spinel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CC_TUFF_SPINEL_ORE = registerBlock("cc_tuff_spinel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CC_ROUGH_SPINEL_BLOCK = registerBlock("cc_rough_spinel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}