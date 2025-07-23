/*
 * Copyright 2022 Infernal Studios
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.tysontheember.spelunkeryplus.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.spelunkeryplus.SpelunkeryPlus;
import net.tysontheember.spelunkeryplus.world.features.GemOreFeature;
import net.tysontheember.spelunkeryplus.world.features.config.GemOreFeatureConfig;


public class MMFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, SpelunkeryPlus.MODID);

    public static final RegistryObject<Feature<GemOreFeatureConfig>> GEM_ORE_FEATURE =
            FEATURES.register("gem_ore_feature", () -> new GemOreFeature(GemOreFeatureConfig.CODEC));


    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
        SpelunkeryPlus.LOGGER.info("Mining Master: Features Registered!");
    }

}
