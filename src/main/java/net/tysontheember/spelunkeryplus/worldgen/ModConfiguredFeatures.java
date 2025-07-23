package net.tysontheember.spelunkeryplus.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;

public class ModConfiguredFeatures {

    // Define your configured features' keys here
    // Example:
    // public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ARCANE_CRYSTAL_ORE = registerKey("arcane_crystal_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        // Register your configured features here
        // Example:
        // register(context, OVERWORLD_ARCANE_CRYSTAL_ORE, ModFeatures.GEM_ORE.get(), config);
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SpelunkeryPlus.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration
    ) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
