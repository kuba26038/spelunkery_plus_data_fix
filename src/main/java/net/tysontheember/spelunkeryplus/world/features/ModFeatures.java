package net.tysontheember.spelunkeryplus.world.features;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.world.features.config.GemOreFeatureConfig;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, SpelunkeryPlus.MODID);

    public static final RegistryObject<Feature<GemOreFeatureConfig>> GEM_ORE =
            FEATURES.register("ore_gem_feature", () -> new GemOreFeature(GemOreFeatureConfig.CODEC));

    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        FEATURES.register(eventBus);
        SpelunkeryPlus.LOGGER.info("Registered SpelunkeryPlus features!");
    }
}
