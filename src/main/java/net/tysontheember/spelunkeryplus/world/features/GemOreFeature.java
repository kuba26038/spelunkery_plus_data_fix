package net.tysontheember.spelunkeryplus.world.features;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.tysontheember.spelunkeryplus.world.features.config.GemOreFeatureConfig;

import java.util.List;

public class GemOreFeature extends Feature<GemOreFeatureConfig> {

    public GemOreFeature(Codec<GemOreFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<GemOreFeatureConfig> context) {
        WorldGenLevel worldgenlevel = context.level();
        BlockPos blockpos = context.origin();
        RandomSource randomsource = context.random();
        GemOreFeatureConfig config = context.config();
        boolean placed = false;

        for (GemOreFeatureConfig.TargetWeightedState target : config.targetStates()) {
            RuleTest ruletest = target.target;
            List<BlockState> weightedStates = target.states;

            if (ruletest.test(worldgenlevel.getBlockState(blockpos), randomsource)) {
                if (config.discardChanceOnAirExposure() > 0.0F && isExposedToAir(worldgenlevel, blockpos)) {
                    if (randomsource.nextFloat() < config.discardChanceOnAirExposure()) {
                        continue;
                    }
                }

                BlockState blockstate = weightedStates.get(randomsource.nextInt(weightedStates.size()));
                worldgenlevel.setBlock(blockpos, blockstate, 2);
                placed = true;
                break;
            }
        }

        return placed;
    }

    private boolean isExposedToAir(WorldGenLevel world, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            if (world.getBlockState(pos.relative(direction)).isAir()) {
                return true;
            }
        }
        return false;
    }
}
