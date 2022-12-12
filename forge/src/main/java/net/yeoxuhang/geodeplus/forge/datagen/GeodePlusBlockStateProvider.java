package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

import static net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry.SMOOTH_END_STONE;

public class GeodePlusBlockStateProvider extends BlockStateProvider {
    public GeodePlusBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(SMOOTH_END_STONE.get());
        simpleBlock(GeodePlusBlocksRegistry.GALCITE.get());
        simpleBlock(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_ECHO.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get());

        stairsBlock((StairBlock) GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), blockTexture(SMOOTH_END_STONE.get()));
        wallBlock((WallBlock) GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(), blockTexture(SMOOTH_END_STONE.get()));
        slabBlock((SlabBlock) GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), blockTexture(SMOOTH_END_STONE.get()),
                blockTexture(SMOOTH_END_STONE.get()));

        directionalBlock(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(), models().cross(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(), models().cross(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(), models().cross(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(), models().cross(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get())));

        directionalBlock(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(), models().cross(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get())));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(), models().cross(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(), models().cross(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get())));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get(), models().cross(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get().getLootTable().getPath(),
                blockTexture(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get())));

    }

}
