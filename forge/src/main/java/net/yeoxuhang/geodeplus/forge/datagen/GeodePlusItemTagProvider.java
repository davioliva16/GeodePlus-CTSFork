package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

import java.util.concurrent.CompletableFuture;

public class GeodePlusItemTagProvider extends ItemTagsProvider {
    public GeodePlusItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper exFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(Tags.Items.GLASS).add(
                GeodePlusBlocksRegistry.WRAPPIST_GLASS.get().asItem(),
                GeodePlusBlocksRegistry.CELESTITE_GLASS.get().asItem(),
                GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get().asItem()
        );
        this.tag(ItemTags.TRIM_MATERIALS).add(
                GeodePlusItemsRegistry.WRAPPIST_SHARD.get(),
                GeodePlusItemsRegistry.CELESTITE_SHARD.get(),
                GeodePlusItemsRegistry.PINK_TOPAZ.get()
        );
        this.tag(ItemTags.TRIM_TEMPLATES).add(
                GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get()
        );
    }
}