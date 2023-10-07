package net.yeoxuhang.geodeplus.forge;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.GeodePlusClient;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlockEntityRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodePlusBiomeModifierRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodePlusLootModifierRegistry;
import net.yeoxuhang.geodeplus.forge.util.BrewingRecipe;
import net.yeoxuhang.geodeplus.platform.forge.BlockEntityTypeHelperImpl;
import net.yeoxuhang.geodeplus.platform.forge.ClientHelperImpl;
import net.yeoxuhang.geodeplus.platform.forge.RegistryHelperImpl;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Supplier;
import java.util.stream.Stream;

@Mod(GeodePlus.MOD_ID)
public class GeodePlusForge {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GeodePlus.MOD_ID);
    public static final RegistryObject<CreativeModeTab> GEODE_PLUS_TAB = TAB.register("geode_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + GeodePlus.MOD_ID))
            .icon(() -> GeodePlusItemsRegistry.WRAPPIST_SHARD.get().getDefaultInstance())
            .displayItems((parameters, output) -> output.acceptAll(Stream.of(
                    GeodePlusItemsRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE,
                    GeodePlusItemsRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE,
                    GeodePlusItemsRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE,
                    GeodePlusItemsRegistry.WRAPPIST_SHARD,
                    GeodePlusItemsRegistry.CELESTITE_SHARD,
                    GeodePlusItemsRegistry.PINK_TOPAZ,
                    GeodePlusBlocksRegistry.WRAPPIST_GLASS,
                    GeodePlusBlocksRegistry.CELESTITE_GLASS,
                    GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS,
                    GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL,
                    GeodePlusBlocksRegistry.WRAPPIST_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_WRAPPIST,
                    GeodePlusBlocksRegistry.WRAPPIST_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD,
                    GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD,
                    GeodePlusBlocksRegistry.CELESTITE_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_CELESTITE,
                    GeodePlusBlocksRegistry.CELESTITE_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD,
                    GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD,

                    GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ,
                    GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL,
                    GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD,
                    GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD,

                    GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_PRISMARINE,
                    GeodePlusBlocksRegistry.PRISMARINE_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD,
                    GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD,

                    GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_LAPIS,
                    GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS,
                    GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS,
                    GeodePlusBlocksRegistry.LAPIS_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_LAPIS_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD,
                    GeodePlusBlocksRegistry.SMALL_LAPIS_BUD,

                    GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_REDSTONE,
                    GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE,
                    GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE,
                    GeodePlusBlocksRegistry.REDSTONE_CRYSTAL,
                    GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD,
                    GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD,

                    GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_EMERALD,
                    GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD,
                    GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD,
                    GeodePlusBlocksRegistry.EMERALD_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_EMERALD_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD,
                    GeodePlusBlocksRegistry.SMALL_EMERALD_BUD,

                    GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_DIAMOND,
                    GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND,
                    GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND,
                    GeodePlusBlocksRegistry.DIAMOND_CRYSTAL,
                    GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD,
                    GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD,

                    GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ,
                    GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ,
                    GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ,
                    GeodePlusBlocksRegistry.QUARTZ_CRYSTAL,
                    GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD,
                    GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD,

                    GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET,
                    GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET,
                    GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET,
                    GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD,
                    GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD,

                    GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_GLOWSTONE,
                    GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE,
                    GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE,
                    GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD,
                    GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD,

                    GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS,
                    GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                    GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS,
                    GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER,
                    GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                    GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD,

                    GeodePlusBlocksRegistry.SMOOTH_END_STONE,
                    GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS,
                    GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB,
                    GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL,

                    GeodePlusBlocksRegistry.GALCITE,
                    GeodePlusBlocksRegistry.GALCITE_STAIRS,
                    GeodePlusBlocksRegistry.GALCITE_SLAB,
                    GeodePlusBlocksRegistry.GALCITE_WALL,

                    GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK,
                    GeodePlusBlocksRegistry.BUDDING_ECHO,
                    GeodePlusBlocksRegistry.ECHO_CRYSTAL,
                    GeodePlusBlocksRegistry.LARGE_ECHO_BUD,
                    GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD,
                    GeodePlusBlocksRegistry.SMALL_ECHO_BUD
            ).map(sup -> sup.get().asItem().getDefaultInstance()).toList())).build());

    public GeodePlusForge() {
        GeodePlus.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> GeodePlusClient::init);
        RegistryHelperImpl.ITEMS.register(eventBus);
        RegistryHelperImpl.BLOCKS.register(eventBus);
        BlockEntityTypeHelperImpl.BLOCK_ENTITIES.register(eventBus);
        RegistryHelperImpl.FEATURES.register(eventBus);
        RegistryHelperImpl.PLACED_FEATURES.register(eventBus);
        TAB.register(eventBus);

        GeodePlusBiomeModifierRegistry.register(eventBus);
        GeodePlusLootModifierRegistry.register(eventBus);
        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Potions.WATER,
                    GeodePlusItemsRegistry.CELESTITE_SHARD.get(), Potions.STRONG_HEALING));
            BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Potions.WATER,
                    GeodePlusItemsRegistry.PINK_TOPAZ.get(), Potions.LUCK));
            BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Potions.WATER, GeodePlusItemsRegistry.WRAPPIST_SHARD.get(), Potions.SLOW_FALLING));
        });
    }

    @Mod.EventBusSubscriber(modid = GeodePlus.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class GeodeModClient {

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent e) {
            //GeodePlusClient.initClient();
            BlockEntityRenderers.register(GeodePlusBlockEntityRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            for (Pair<ModelLayerLocation, Supplier<LayerDefinition>> modelLayerLocation : ClientHelperImpl.modelLayerLocations) {
                event.registerLayerDefinition(modelLayerLocation.getFirst(), modelLayerLocation.getSecond());
            }
        }
    }


}