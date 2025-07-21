package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SpelunkeryPlus.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    //ICEANDFIRE
        //Sapphire
        blockWithItem(ModBlocks.ROUGH_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.IAF_GRANITE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.IAF_TUFF_SAPPHIRE_ORE);


    //Mining Master
        blockWithItem(ModBlocks.MM_RAW_AIR_MALACHITE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_DIVE_AQUAMARINE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_DIVINE_BERYL_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_FIRE_RUBY_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_HASTE_PERIDOT_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_HEART_RHODONITE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_ICE_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_KINETIC_OPAL_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_LUCKY_CITRINE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_POWER_PYRITE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_SPIDER_KUNZITE_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_SPIRIT_GARNET_BLOCK);
        blockWithItem(ModBlocks.MM_RAW_UNBREAKING_IOLITE_BLOCK);

        //Andesite
        blockWithItem(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE);
        blockWithItem(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE);
        //Diorite
        blockWithItem(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE);
        blockWithItem(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE);
        //Granite
        blockWithItem(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE);
        blockWithItem(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE);
        //Tuff
        blockWithItem(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE);
        blockWithItem(ModBlocks.MM_TUFF_FIRE_RUBY_ORE);
        blockWithItem(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE);
        blockWithItem(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE);
        blockWithItem(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE);
        blockWithItem(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE);
        blockWithItem(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
