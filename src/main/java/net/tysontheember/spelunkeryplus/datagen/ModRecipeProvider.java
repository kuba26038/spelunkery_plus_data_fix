package net.tysontheember.spelunkeryplus.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.block.ModBlocks;
import net.tysontheember.spelunkeryplus.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROUGH_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ROUGH_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.ROUGH_SAPPHIRE.get()), has(ModItems.ROUGH_SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROUGH_SAPPHIRE.get(), 9)
                .requires(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get()), has(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get()))
                .save(pWriter, new ResourceLocation(SpelunkeryPlus.MODID, "sapphire_from_rough_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROUGH_SAPPHIRE.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ROUGH_SAPPHIRE_SHARD.get())
                .unlockedBy(getHasName(ModItems.ROUGH_SAPPHIRE_SHARD.get()), has(ModItems.ROUGH_SAPPHIRE_SHARD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROUGH_SAPPHIRE_SHARD.get(), 9)
                .requires(ModItems.ROUGH_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.ROUGH_SAPPHIRE.get()), has(ModItems.ROUGH_SAPPHIRE.get()))
                .save(pWriter);

        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition("iceandfire"))
                .addRecipe(consumer -> ShapedRecipeBuilder.shaped(
                                RecipeCategory.MISC,
                                BuiltInRegistries.ITEM.get(new ResourceLocation("iceandfire:sapphire_gem")))
                        .pattern("SSS")
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', ModItems.SAPPHIRE_SHARD.get())
                        .unlockedBy(getHasName(ModItems.SAPPHIRE_SHARD.get()), has(ModItems.SAPPHIRE_SHARD.get()))
                        .save(consumer))
                .build(pWriter, new ResourceLocation(SpelunkeryPlus.MODID, "sapphire_gem_from_shards"));

        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition("iceandfire"))
                .addRecipe(consumer -> ShapelessRecipeBuilder.shapeless(
                                RecipeCategory.MISC,
                                ModItems.SAPPHIRE_SHARD.get(), 9)
                        .requires(BuiltInRegistries.ITEM.get(new ResourceLocation("iceandfire:sapphire_gem")))
                        .unlockedBy("has_sapphire_gem", InventoryChangeTrigger.TriggerInstance.hasItems(
                                BuiltInRegistries.ITEM.get(new ResourceLocation("iceandfire:sapphire_gem"))))
                        .save(consumer))
                .build(pWriter, new ResourceLocation(SpelunkeryPlus.MODID, "sapphire_shards_from_gem"));

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  SpelunkeryPlus.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}