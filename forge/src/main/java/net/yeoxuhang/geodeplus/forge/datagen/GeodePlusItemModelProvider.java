package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.*;

import java.util.function.Supplier;

public class GeodePlusItemModelProvider extends ItemModelProvider {
    public GeodePlusItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GeodePlusItemsRegistry.WRAPPIST_SHARD);
        simpleToolItem(GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.EMERALD_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.LAPIS_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.ECHO_CRYSTAL);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_ECHO_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_ECHO_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD);

        simpleSingleBlockItem(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD);
        simpleSingleBlockItem(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD);

    }
    private ItemModelBuilder simpleItem(Supplier<Item> item) {
        return withExistingParent(((RegistryObject<Item>) item).getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GeodePlus.MOD_ID,"item/" + ((RegistryObject<Item>) item).getId().getPath()));
    }

    private ItemModelBuilder simpleSingleBlockItem(Supplier<Block> item) {
        return withExistingParent(((RegistryObject<Block>) item).getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GeodePlus.MOD_ID,"block/" + ((RegistryObject<Block>) item).getId().getPath()));
    }

    private ItemModelBuilder simpleToolItem(Supplier<Item> item) {
        return withExistingParent(((RegistryObject<Item>) item).getId().getPath(),
                new ResourceLocation("item/goat_horn")).texture("layer0",
                new ResourceLocation(GeodePlus.MOD_ID,"item/" + ((RegistryObject<Item>) item).getId().getPath()));
    }
}
