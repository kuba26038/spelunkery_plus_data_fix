package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.item.ModItems;
import net.tysontheember.spelunkeryplus.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, SpelunkeryPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(Tags.Items.NUGGETS)
                .add(ModItems.IAF_SAPPHIRE_SHARD.get());

        this.tag(ModTags.Items.SAPPHIRE_NUGGETS)
                .add(ModItems.IAF_SAPPHIRE_SHARD.get());
    }
}
