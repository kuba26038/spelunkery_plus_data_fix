package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SpelunkeryPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GRANITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.ANDESITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.DIORITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.TUFF_SAPPHIRE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GRANITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.ANDESITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.DIORITE_SAPPHIRE_ORE.get())
                .add(ModBlocks.TUFF_SAPPHIRE_ORE.get());

    }

}
