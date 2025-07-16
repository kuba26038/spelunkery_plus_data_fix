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

        this.add(ModBlocks.ANDESITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createSilkTouchAndShardDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get(), ModItems.ROUGH_SAPPHIRE_SHARD.get()));

        this.add(ModBlocks.GRANITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.TUFF_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));

        this.add(ModBlocks.DIORITE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_SAPPHIRE_ORE.get(), ModItems.ROUGH_SAPPHIRE.get()));
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
