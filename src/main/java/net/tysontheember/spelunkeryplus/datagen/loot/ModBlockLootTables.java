package net.tysontheember.spelunkeryplus.datagen.loot;

import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.block.ModBlocks;
import net.tysontheember.spelunkeryplus.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get());

        this.add(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.IAF_ANDESITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createSilkTouchAndShardDrops(ModBlocks.IAF_DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get(), ModItems.ROUGH_SAPPHIRE_SHARD.get()));

        this.add(ModBlocks.IAF_GRANITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.IAF_GRANITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.IAF_TUFF_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.IAF_TUFF_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.IAF_DIORITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));




        this.dropSelf(ModBlocks.MM_RAW_AIR_MALACHITE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_DIVE_AQUAMARINE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_DIVINE_BERYL_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_FIRE_RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_HASTE_PERIDOT_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_HEART_RHODONITE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_ICE_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_KINETIC_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_LUCKY_CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_POWER_PYRITE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_SPIDER_KUNZITE_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_SPIRIT_GARNET_BLOCK.get());
        this.dropSelf(ModBlocks.MM_RAW_UNBREAKING_IOLITE_BLOCK.get());


        //Andesite
        this.add(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_DIVE_AQUAMARINE_ORE.get(), ModItems.MM_RAW_DIVE_AQUAMARINE.get()));
        this.add(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_DIVINE_BERYL_ORE.get(), ModItems.MM_RAW_DIVINE_BERYL.get()));
        this.add(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_FIRE_RUBY_ORE.get(), ModItems.MM_RAW_FIRE_RUBY.get()));
        this.add(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_HASTE_PERIDOT_ORE.get(), ModItems.MM_RAW_HASTE_PERIDOT.get()));
        this.add(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_ICE_SAPPHIRE_ORE.get(), ModItems.MM_RAW_ICE_SAPPHIRE.get()));
        this.add(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_LUCKY_CITRINE_ORE.get(), ModItems.MM_RAW_LUCKY_CITRINE.get()));
        this.add(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_SPIDER_KUNZITE_ORE.get(), ModItems.MM_RAW_SPIDER_KUNZITE.get()));
        this.add(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_SPIRIT_GARNET_ORE.get(), ModItems.MM_RAW_SPIRIT_GARNET.get()));
        this.add(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_ANDESITE_UNBREAKING_IOLITE_ORE.get(), ModItems.MM_RAW_UNBREAKING_IOLITE.get()));
        //Diorite
        this.add(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_DIVE_AQUAMARINE_ORE.get(), ModItems.MM_RAW_DIVE_AQUAMARINE.get()));
        this.add(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_DIVINE_BERYL_ORE.get(), ModItems.MM_RAW_DIVINE_BERYL.get()));
        this.add(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_FIRE_RUBY_ORE.get(), ModItems.MM_RAW_FIRE_RUBY.get()));
        this.add(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_HASTE_PERIDOT_ORE.get(), ModItems.MM_RAW_HASTE_PERIDOT.get()));
        this.add(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_ICE_SAPPHIRE_ORE.get(), ModItems.MM_RAW_ICE_SAPPHIRE.get()));
        this.add(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_LUCKY_CITRINE_ORE.get(), ModItems.MM_RAW_LUCKY_CITRINE.get()));
        this.add(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_SPIDER_KUNZITE_ORE.get(), ModItems.MM_RAW_SPIDER_KUNZITE.get()));
        this.add(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_SPIRIT_GARNET_ORE.get(), ModItems.MM_RAW_SPIRIT_GARNET.get()));
        this.add(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_DIORITE_UNBREAKING_IOLITE_ORE.get(), ModItems.MM_RAW_UNBREAKING_IOLITE.get()));
        //Granite
        this.add(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_DIVE_AQUAMARINE_ORE.get(), ModItems.MM_RAW_DIVE_AQUAMARINE.get()));
        this.add(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_DIVINE_BERYL_ORE.get(), ModItems.MM_RAW_DIVINE_BERYL.get()));
        this.add(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_FIRE_RUBY_ORE.get(), ModItems.MM_RAW_FIRE_RUBY.get()));
        this.add(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_HASTE_PERIDOT_ORE.get(), ModItems.MM_RAW_HASTE_PERIDOT.get()));
        this.add(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_ICE_SAPPHIRE_ORE.get(), ModItems.MM_RAW_ICE_SAPPHIRE.get()));
        this.add(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_LUCKY_CITRINE_ORE.get(), ModItems.MM_RAW_LUCKY_CITRINE.get()));
        this.add(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_SPIDER_KUNZITE_ORE.get(), ModItems.MM_RAW_SPIDER_KUNZITE.get()));
        this.add(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_SPIRIT_GARNET_ORE.get(), ModItems.MM_RAW_SPIRIT_GARNET.get()));
        this.add(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_GRANITE_UNBREAKING_IOLITE_ORE.get(), ModItems.MM_RAW_UNBREAKING_IOLITE.get()));
        //Tuff
        this.add(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_DIVE_AQUAMARINE_ORE.get(), ModItems.MM_RAW_DIVE_AQUAMARINE.get()));
        this.add(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_DIVINE_BERYL_ORE.get(), ModItems.MM_RAW_DIVINE_BERYL.get()));
        this.add(ModBlocks.MM_TUFF_FIRE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_FIRE_RUBY_ORE.get(), ModItems.MM_RAW_FIRE_RUBY.get()));
        this.add(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_HASTE_PERIDOT_ORE.get(), ModItems.MM_RAW_HASTE_PERIDOT.get()));
        this.add(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_ICE_SAPPHIRE_ORE.get(), ModItems.MM_RAW_ICE_SAPPHIRE.get()));
        this.add(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_LUCKY_CITRINE_ORE.get(), ModItems.MM_RAW_LUCKY_CITRINE.get()));
        this.add(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_SPIDER_KUNZITE_ORE.get(), ModItems.MM_RAW_SPIDER_KUNZITE.get()));
        this.add(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_SPIRIT_GARNET_ORE.get(), ModItems.MM_RAW_SPIRIT_GARNET.get()));
        this.add(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MM_TUFF_UNBREAKING_IOLITE_ORE.get(), ModItems.MM_RAW_UNBREAKING_IOLITE.get()));








    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
    private LootTable.Builder createSilkTouchAndShardDrops(Block block, Item mainDrop, Item shardDrop) {
        LootItemCondition.Builder silkTouch = MatchTool.toolMatches(
                ItemPredicate.Builder.item().hasEnchantment(
                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))
                )
        );

        // === First Pool: main drop (block or rough sapphire) ===
        LootPool.Builder mainPool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .add(AlternativesEntry.alternatives(
                        LootItem.lootTableItem(block).when(silkTouch),
                        this.applyExplosionDecay(block,
                                LootItem.lootTableItem(mainDrop)
                                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        )
                ));

        // === Second Pool: bonus drop (air or shards) ===
        LootPool.Builder shardPool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .add(AlternativesEntry.alternatives(
                        LootItem.lootTableItem(Items.AIR).when(silkTouch),
                        this.applyExplosionDecay(block,
                                LootItem.lootTableItem(shardDrop)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 2.0F)))
                                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        )
                ));

        return LootTable.lootTable()
                .withPool(mainPool)
                .withPool(shardPool);
    }

}
