package com.nomit333.friendsores.world.gen;

import com.nomit333.friendsores.FriendsOres;
import com.nomit333.friendsores.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = FriendsOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    public static void generateOres(final BiomeLoadingEvent event)  {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.LINDROID_ORE.get().getDefaultState(),
                    6, 5,12,10);
        }
        if (event.getCategory().equals(Biome.Category.NETHER)) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, ModBlocks.FABIBUM_ORE_NETHER.get().getDefaultState(),
                    4,25,128,10);
        }
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.FABIBUM_ORE.get().getDefaultState(),
                    4, 50,200,10);
        }
    }



    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                .square().count(amount));
    }
}
