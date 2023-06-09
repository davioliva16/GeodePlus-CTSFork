package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;

import java.util.concurrent.CompletableFuture;

public class GeodePlusItemTagProvider extends ItemTagsProvider {
    public GeodePlusItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper exFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(GeodePlusTagRegistry.Items.CELESTITE).add(GeodePlusItemsRegistry.CELESTITE_SHARD.get());
        this.tag(GeodePlusTagRegistry.Items.IS_GLASS).add(
                Items.GLASS,
                Items.WHITE_STAINED_GLASS,
                Items.ORANGE_STAINED_GLASS,
                Items.MAGENTA_STAINED_GLASS,
                Items.LIGHT_BLUE_STAINED_GLASS,
                Items.YELLOW_STAINED_GLASS,
                Items.LIME_STAINED_GLASS,
                Items.PINK_STAINED_GLASS,
                Items.GRAY_STAINED_GLASS,
                Items.LIGHT_GRAY_STAINED_GLASS,
                Items.CYAN_STAINED_GLASS,
                Items.PURPLE_STAINED_GLASS,
                Items.BLUE_STAINED_GLASS,
                Items.BROWN_STAINED_GLASS,
                Items.GREEN_STAINED_GLASS,
                Items.RED_STAINED_GLASS,
                Items.BLACK_STAINED_GLASS,
                Items.TINTED_GLASS,
                GeodePlusBlocksRegistry.WRAPPIST_GLASS.get().asItem(),
                GeodePlusBlocksRegistry.CELESTITE_GLASS.get().asItem(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get().asItem()
        );
        //this.tag(ItemTags.TRIM_MATERIALS).add(GeodePlusItemsRegistry.WRAPPIST_SHARD.get());
    }
}