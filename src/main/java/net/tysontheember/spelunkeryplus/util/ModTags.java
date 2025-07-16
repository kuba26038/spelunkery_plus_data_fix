package net.tysontheember.spelunkeryplus.util;

import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> SAPPHIRE_NUGGETS = TagKey.create(
                net.minecraft.core.registries.Registries.ITEM,
                new ResourceLocation(SpelunkeryPlus.MODID, "sapphire_nuggets")
        );
    }
}
