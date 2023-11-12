package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.*;

import java.util.function.Supplier;

public class GeodePlusItemModelProvider extends ItemModelProvider {

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));
    private final ModelFile GOAT_HORN = getExistingFile(mcLoc("item/goat_horn"));

    public GeodePlusItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        itemModel(GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);
        itemModel(GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);
        itemModel(GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);

        itemModel(GeodePlusItemsRegistry.PINK_TOPAZ, GENERATED);
        itemModel(GeodePlusItemsRegistry.CELESTITE_SHARD, GENERATED);
        itemModel(GeodePlusItemsRegistry.WRAPPIST_SHARD, GENERATED);
        //itemModel(GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN, GOAT_HORN);
        singleLayerBlockModel(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.EMERALD_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.LAPIS_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.ECHO_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_ECHO_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_ECHO_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.CELESTITE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD, GENERATED);

        blockModel(GeodePlusBlocksRegistry.WRAPPIST_GLASS);
        blockModel(GeodePlusBlocksRegistry.CELESTITE_GLASS);
        blockModel(GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS);

        blockModel(GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ);
        blockModel(GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_CELESTITE);
        blockModel(GeodePlusBlocksRegistry.CELESTITE_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_PRISMARINE);
        blockModel(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_LAPIS);
        blockModel(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS);
        blockModel(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS);
        blockModel(GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_REDSTONE);
        blockModel(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE);
        blockModel(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE);
        blockModel(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_EMERALD);
        blockModel(GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK);
        blockModel(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD);
        blockModel(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD);

        blockModel(GeodePlusBlocksRegistry.BUDDING_DIAMOND);
        blockModel(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND);
        blockModel(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND);
        blockModel(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ);
        blockModel(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET);
        blockModel(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE);
        blockModel(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK);

        blockModel(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS);
        blockModel(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS);
        blockModel(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK);

        blockModel(GeodePlusBlocksRegistry.SMOOTH_END_STONE);
        blockModel(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS);
        blockModel(GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB);
        blockModel(GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL, "inventory");

        blockModel(GeodePlusBlocksRegistry.GALCITE);
        blockModel(GeodePlusBlocksRegistry.GALCITE_STAIRS);
        blockModel(GeodePlusBlocksRegistry.GALCITE_SLAB);
        blockModel(GeodePlusBlocksRegistry.GALCITE_WALL, "inventory");

        blockModel(GeodePlusBlocksRegistry.WRAPPIST_BLOCK);
        blockModel(GeodePlusBlocksRegistry.BUDDING_WRAPPIST);

        blockModel(GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK);
        blockModel(GeodePlusBlocksRegistry.BUDDING_ECHO);
    }

    public void blockModel(Supplier<? extends Block> block) {
        withExistingParent(getName(block.get()), modLoc("block/" + getName(block.get())));
    }

    public String getName(Block block) {
        return block.builtInRegistryHolder().key().location().getPath();
    }

    public String getName(Supplier<? extends Item> item) {
        return item.get().builtInRegistryHolder().key().location().getPath();
    }

    public void blockModel(Supplier<? extends Block> block, String suffix) {
        withExistingParent(getName(block.get()), modLoc("block/" + getName(block.get()) + "_" + suffix));
    }

    public void itemModel(Supplier<? extends Item> item, ModelFile modelFile) {
        getBuilder(getName(item)).parent(modelFile).texture("layer0", "item/" + getName(item));
    }

    public void singleLayerBlockModel(Supplier<? extends Block> block, ModelFile modelFile) {
        getBuilder(getName(block.get())).parent(modelFile).texture("layer0", "block/" + getName(block.get()));
    }
}
