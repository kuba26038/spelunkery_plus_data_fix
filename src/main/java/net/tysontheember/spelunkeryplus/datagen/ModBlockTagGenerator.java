package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SpelunkeryPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_ROUGH_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_TUFF_SAPPHIRE_ORE.get())

                .add(ModBlocks.MM_RAW_AIR_MALACHITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_DIVE_AQUAMARINE_BLOCK.get())
                .add(ModBlocks.MM_RAW_DIVINE_BERYL_BLOCK.get())
                .add(ModBlocks.MM_RAW_FIRE_RUBY_BLOCK.get())
                .add(ModBlocks.MM_RAW_HASTE_PERIDOT_BLOCK.get())
                .add(ModBlocks.MM_RAW_HEART_RHODONITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_ICE_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.MM_RAW_KINETIC_OPAL_BLOCK.get())
                .add(ModBlocks.MM_RAW_LUCKY_CITRINE_BLOCK.get())
                .add(ModBlocks.MM_RAW_POWER_PYRITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_SPIDER_KUNZITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_SPIRIT_GARNET_BLOCK.get())
                .add(ModBlocks.MM_RAW_UNBREAKING_IOLITE_BLOCK.get())

                .add(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_TUFF_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.CC_DIORITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_TUFF_SPINEL_ORE.get())
                .add(ModBlocks.CC_ANDESITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_GRANITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_ROUGH_SPINEL_BLOCK.get())

        ;


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.IAF_GRANITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_ROUGH_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.IAF_TUFF_SAPPHIRE_ORE.get())

                .add(ModBlocks.MM_RAW_AIR_MALACHITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_DIVE_AQUAMARINE_BLOCK.get())
                .add(ModBlocks.MM_RAW_DIVINE_BERYL_BLOCK.get())
                .add(ModBlocks.MM_RAW_FIRE_RUBY_BLOCK.get())
                .add(ModBlocks.MM_RAW_HASTE_PERIDOT_BLOCK.get())
                .add(ModBlocks.MM_RAW_HEART_RHODONITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_ICE_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.MM_RAW_KINETIC_OPAL_BLOCK.get())
                .add(ModBlocks.MM_RAW_LUCKY_CITRINE_BLOCK.get())
                .add(ModBlocks.MM_RAW_POWER_PYRITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_SPIDER_KUNZITE_BLOCK.get())
                .add(ModBlocks.MM_RAW_SPIRIT_GARNET_BLOCK.get())
                .add(ModBlocks.MM_RAW_UNBREAKING_IOLITE_BLOCK.get())

                .add(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE.get())
                .add(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE.get())
                .add(ModBlocks.MM_TUFF_FIRE_RUBY_ORE.get())
                .add(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE.get())
                .add(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE.get())
                .add(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE.get())
                .add(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE.get())
                .add(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE.get())
                .add(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE.get())

                .add(ModBlocks.CC_DIORITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_TUFF_SPINEL_ORE.get())
                .add(ModBlocks.CC_ANDESITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_GRANITE_SPINEL_ORE.get())
                .add(ModBlocks.CC_ROUGH_SPINEL_BLOCK.get())


        ;
    }

}
