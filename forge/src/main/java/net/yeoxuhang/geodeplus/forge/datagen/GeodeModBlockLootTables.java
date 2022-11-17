package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.IntRange;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.LimitCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodeModItemsRegistry;
import net.yeoxuhang.geodeplus.platform.forge.RegistryHelperImpl;

public class GeodeModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(GeodeModBlocksRegistry.SMOOTH_END_STONE.get());
        this.dropSelf(GeodeModBlocksRegistry.GALCITE.get());
        this.dropSelf(GeodeModBlocksRegistry.WRAPPIST_BLOCK.get());
        this.dropSelf(GeodeModBlocksRegistry.WRAPPIST_PEDESTAL.get());
        this.dropSelf(GeodeModBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());

        this.add(GeodeModBlocksRegistry.ECHO_CRYSTAL.get(),
                (block) -> createOreDrop(block, Items.ECHO_SHARD));
        this.add(GeodeModBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.GOLD_NUGGET));
        this.add(GeodeModBlocksRegistry.QUARTZ_CRYSTAL.get(),
                (block) -> createOreDrop(block, Items.QUARTZ));
        this.add(GeodeModBlocksRegistry.WRAPPIST_CLUSTER.get(),
                (block) -> createOreDrop(block, GeodeModItemsRegistry.WRAPPIST_SHARD.get()));
        this.add(GeodeModBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.GLOWSTONE_DUST));
        this.add(GeodeModBlocksRegistry.LAPIS_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.LAPIS_LAZULI));
        this.add(GeodeModBlocksRegistry.REDSTONE_CRYSTAL.get(),
                (block) -> createOreDrop(block, Items.REDSTONE));
        this.add(GeodeModBlocksRegistry.EMERALD_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.EMERALD));
        this.add(GeodeModBlocksRegistry.DIAMOND_CRYSTAL.get(),
                (block) -> createOreDrop(block, Items.DIAMOND));

        this.add(GeodeModBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.NETHERITE_SCRAP));
        this.add(GeodeModBlocksRegistry.PRISMARINE_CLUSTER.get(),
                (block) -> createOreDrop(block, Items.PRISMARINE_SHARD));

        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.LARGE_PRISMARINE_BUD.get());

        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.MEDIUM_PRISMARINE_BUD.get());

        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.SMALL_PRISMARINE_BUD.get());

        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BASALT_QUARTZ.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_ECHO.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_WRAPPIST.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_LAPIS.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_REDSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_EMERALD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_DIAMOND.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_SCULK_LAPIS.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_SCULK_REDSTONE.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_SCULK_EMERALD.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_SCULK_DIAMOND.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get());
        this.dropWhenSilkTouch(GeodeModBlocksRegistry.BUDDING_PRISMARINE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegistryHelperImpl.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
