package net.yeoxuhang.geodeplus.forge.datagen;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodeModTagsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GeodeModBiomeTagsProvider extends BiomeTagsProvider {
    public GeodeModBiomeTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    protected void addTags() {
        //Geodes
        this.tag(GeodeModTagsRegistry.Biomes.HAS_LAPIS_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_REDSTONE_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_EMERALD_GEODE).addTag(Tags.Biomes.IS_PEAK).addTag(Tags.Biomes.IS_SLOPE);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_DIAMOND_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_ECHO_GEODE).add(Biomes.DEEP_DARK);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_GEODE).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);

        //Crystals
        this.tag(GeodeModTagsRegistry.Biomes.HAS_ECHO_CRYSTAL).add(Biomes.DEEP_DARK);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_QUARTZ_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(GeodeModTagsRegistry.Biomes.HAS_WRAPPIST_CRYSTAL).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);
    }
}
