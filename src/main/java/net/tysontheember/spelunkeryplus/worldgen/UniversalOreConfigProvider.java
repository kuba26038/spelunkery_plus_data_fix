package net.tysontheember.spelunkeryplus.worldgen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.data.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * Universal Ore Config DataProvider for Minecraft Forge 1.20.x.
 * Pass parameters for any ore and any target mod.
 */
public class UniversalOreConfigProvider implements DataProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private final PackOutput packOutput;
    private final String targetModId;
    private final String fileName;
    private final double discardChanceOnAirExposure;
    private final int size;
    private final List<TargetConfig> targets;

    /**
     * @param packOutput DataGenerator.getPackOutput()
     * @param targetModId Mod ID to write output under (e.g. "iceandfire")
     * @param fileName Output file name, e.g. "sapphire_ore_config.json"
     * @param discardChanceOnAirExposure double value (e.g. 0.5)
     * @param size ore vein size (e.g. 4)
     * @param targets List of TargetConfig (see below)
     */
    public UniversalOreConfigProvider(PackOutput packOutput, String targetModId, String fileName,
                                      double discardChanceOnAirExposure, int size, List<TargetConfig> targets) {
        this.packOutput = packOutput;
        this.targetModId = targetModId;
        this.fileName = fileName;
        this.discardChanceOnAirExposure = discardChanceOnAirExposure;
        this.size = size;
        this.targets = targets;
    }

    public void run(HashCache cache) throws IOException {
        Path outputPath = packOutput.getOutputFolder()
                .resolve("data")
                .resolve(targetModId)
                .resolve("worldgen")
                .resolve("configured_feature")
                .resolve(fileName);

        Map<String, Object> root = new HashMap<>();
        root.put("type", "minecraft:ore");

        Map<String, Object> config = new HashMap<>();
        config.put("discard_chance_on_air_exposure", discardChanceOnAirExposure);
        config.put("size", size);

        List<Object> targetsList = new ArrayList<>();
        for (TargetConfig t : targets) {
            targetsList.add(t.toJson());
        }
        config.put("targets", targetsList);
        root.put("config", config);

        DataProvider.saveStable((CachedOutput) cache, GSON.toJsonTree(root), outputPath);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput pOutput) {
        return null;
    }

    @Override
    public String getName() {
        return "Universal Ore Config Provider for " + targetModId + "/" + fileName;
    }

    /**
     * Helper class for target configs.
     */
    public static class TargetConfig {
        public final String oreBlockName;
        public final String baseBlockName;
        public final String predicateType; // usually "minecraft:block_match"

        public TargetConfig(String oreBlockName, String baseBlockName, String predicateType) {
            this.oreBlockName = oreBlockName;
            this.baseBlockName = baseBlockName;
            this.predicateType = predicateType;
        }

        public Map<String, Object> toJson() {
            Map<String, Object> map = new HashMap<>();
            Map<String, Object> state = new HashMap<>();
            state.put("Name", oreBlockName);
            map.put("state", state);

            Map<String, Object> predicate = new HashMap<>();
            predicate.put("predicate_type", predicateType);
            predicate.put("block", baseBlockName);
            map.put("target", predicate);

            return map;
        }
    }
}