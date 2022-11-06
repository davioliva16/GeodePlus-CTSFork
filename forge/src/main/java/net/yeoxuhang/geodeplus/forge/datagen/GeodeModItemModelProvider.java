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

public class GeodeModItemModelProvider extends ItemModelProvider {
    public GeodeModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GeodeModItemsRegistry.WRAPPIST_SHARD);
        simpleToolItem(GeodeModItemsRegistry.WRAPPIST_GOAT_HORN);
        simpleSingleBlockItem(GeodeModBlocksRegistry.DIAMOND_CRYSTAL);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.EMERALD_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_EMERALD_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_EMERALD_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.LAPIS_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_LAPIS_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_LAPIS_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.REDSTONE_CRYSTAL);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.ECHO_CRYSTAL);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_ECHO_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_ECHO_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.ANCIENT_DEBRIS_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.WRAPPIST_CLUSTER);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD);

        simpleSingleBlockItem(GeodeModBlocksRegistry.QUARTZ_CRYSTAL);
        simpleSingleBlockItem(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD);
        simpleSingleBlockItem(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD);

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
