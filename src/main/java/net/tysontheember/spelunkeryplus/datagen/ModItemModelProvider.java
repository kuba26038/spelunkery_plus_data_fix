package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SpelunkeryPlus.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ROUGH_SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_SHARD);
        simpleItem(ModItems.ROUGH_SAPPHIRE_SHARD);

        simpleItem(ModItems.MM_RAW_AIR_MALACHITE);
        simpleItem(ModItems.MM_RAW_DIVE_AQUAMARINE);
        simpleItem(ModItems.MM_RAW_DIVINE_BERYL);
        simpleItem(ModItems.MM_RAW_FIRE_RUBY);
        simpleItem(ModItems.MM_RAW_HASTE_PERIDOT);
        simpleItem(ModItems.MM_RAW_HEART_RHODONITE);
        simpleItem(ModItems.MM_RAW_ICE_SAPPHIRE);
        simpleItem(ModItems.MM_RAW_KINETIC_OPAL);
        simpleItem(ModItems.MM_RAW_LUCKY_CITRINE);
        simpleItem(ModItems.MM_RAW_POWER_PYRITE);
        simpleItem(ModItems.MM_RAW_SPIDER_KUNZITE);
        simpleItem(ModItems.MM_RAW_SPIRIT_GARNET);
        simpleItem(ModItems.MM_RAW_UNBREAKING_IOLITE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SpelunkeryPlus.MODID, "item/" + item.getId().getPath()));
    }
}
