package net.yeoxuhang.geodeplus.common.config;

import com.kyanite.paragon.api.ConfigOption;
import com.kyanite.paragon.api.interfaces.BaseModConfig;
import net.yeoxuhang.geodeplus.GeodePlus;

import java.util.ArrayList;
import java.util.List;

public class GeodeModCommonConfigs implements BaseModConfig {
    private static final ArrayList<ConfigOption> CONFIG_OPTIONS = new ArrayList<>();

    private static <T> ConfigOption<T> registerConfigOption(String title, T defaultValue) {
        ConfigOption<T> option = new ConfigOption<>(title, defaultValue);
        CONFIG_OPTIONS.add(option);
        return option;
    }
    /**Overworld Ocean Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE;
    /**Overworld Cave Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_DIAMOND_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_EMERALD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_LAPIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_REDSTONE_GEODE;
    /**Overworld Deep Cave Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE;
    /**Overworld Deep Dark Cave Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_ECHO_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_DIAMOND_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_EMERALD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_LAPIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_REDSTONE_GEODE;
    /**Nether Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_QUARTZ_GEODE;

    /**Nether Basalt Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_QUARTZ_GEODE;

    /**Nether Blackstone Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE;

    /**End Geodes**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_END_WRAPPIST_GEODE;

    /**Large Crystals**/
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_ECHO_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL;

    /*public static final ConfigOption<Integer> PRISMARINE_GEODE_RARITY;
    public static final ConfigOption<Integer> BASALT_ANCIENT_DEBRIS_GEODE_RARITY;
    public static final ConfigOption<Integer> BASALT_GLOWSTONE_GEODE_RARITY;
    public static final ConfigOption<Integer> BASALT_GOLD_NUGGET_GEODE_RARITY;
    public static final ConfigOption<Integer> BASALT_QUARTZ_GEODE_RARITY;*/

    static {
        //Overworld Ocean Geodes
        SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE = registerConfigOption("Enable Prismarine Geode", true);
        //Overworld Cave Geodes
        SHOULD_GENERATE_STONE_DIAMOND_GEODE = registerConfigOption("Enable Diamond Geode", true);
        SHOULD_GENERATE_STONE_EMERALD_GEODE = registerConfigOption("Enable Emerald Geode", true);
        SHOULD_GENERATE_STONE_LAPIS_GEODE = registerConfigOption("Enable Lapis Geode", true);
        SHOULD_GENERATE_STONE_REDSTONE_GEODE = registerConfigOption("Enable Redstone Geode", true);
        //Overworld Deep Cave Geodes
        SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE = registerConfigOption("Enable Deepslate Diamond Geode", true);
        SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE = registerConfigOption("Enable Deepslate Emerald Geode", true);
        SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE = registerConfigOption("Enable Deepslate Lapis Geode", true);
        SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE = registerConfigOption("Enable Deepslate Redstone Geode", true);
        //Overworld Deep Dark Cave Geodes
        SHOULD_GENERATE_ECHO_GEODE = registerConfigOption("Enable Echo Geode", true);
        SHOULD_GENERATE_SCULK_DIAMOND_GEODE = registerConfigOption("Enable Sculk Diamond Geode", true);
        SHOULD_GENERATE_SCULK_EMERALD_GEODE = registerConfigOption("Enable Sculk Emerald Geode", true);
        SHOULD_GENERATE_SCULK_LAPIS_GEODE = registerConfigOption("Enable Sculk Lapis Geode", true);
        SHOULD_GENERATE_SCULK_REDSTONE_GEODE = registerConfigOption("Enable Sculk Redstone Geode", true);
        //Nether Geodes
        SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE = registerConfigOption("Enable Nether Ancient Debris Geode", true);
        SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE = registerConfigOption("Enable Nether Glowstone Geode", true);
        SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE = registerConfigOption("Enable Nether Gold Nugget Geode", true);
        SHOULD_GENERATE_NETHER_QUARTZ_GEODE = registerConfigOption("Enable Nether Quartz Geode", true);
        //Nether Basalt Geodes
        SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE = registerConfigOption("Enable Basalt Ancient Debris Geode", true);
        SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE = registerConfigOption("Enable Basalt Glowstone Geode", true);
        SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE = registerConfigOption("Enable Basalt Gold Nugget Geode", true);
        SHOULD_GENERATE_BASALT_QUARTZ_GEODE = registerConfigOption("Enable Basalt Quartz Geode", true);
        //Nether Blackstone Geodes
        SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE = registerConfigOption("Enable Blackstone Ancient Debris Geode", true);
        SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE = registerConfigOption("Enable Blackstone Glowstone Geode", true);
        SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE = registerConfigOption("Enable Blackstone Gold Nugget Geode", true);
        SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE = registerConfigOption("Enable Blackstone Quartz Geode", true);
        //End Geodes
        SHOULD_GENERATE_END_WRAPPIST_GEODE = registerConfigOption("Enable Wrappist Geode", true);
        //Large Crystals
        SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL = registerConfigOption("Enable Large Prismarine Crystal", true);
        SHOULD_GENERATE_LARGE_ECHO_CRYSTAL = registerConfigOption("Enable Large Echo Crystal", true);
        SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL = registerConfigOption("Enable Large Nether Quartz Crystal", true);
        SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL = registerConfigOption("Enable Large Nether Glowstone Crystal", true);
        SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL = registerConfigOption("Enable Large End Wrappist Crystal", true);

        /*PRISMARINE_GEODE_RARITY = registerConfigOption("Rarity of Prismarine Geode", 32);
        BASALT_ANCIENT_DEBRIS_GEODE_RARITY = registerConfigOption("Rarity of Basalt Ancient Debris Geode", 32);
        BASALT_GLOWSTONE_GEODE_RARITY = registerConfigOption("Rarity of Basalt Glowstone Geode", 32);
        BASALT_GOLD_NUGGET_GEODE_RARITY = registerConfigOption("Rarity of Basalt Gold Nugget Geode", 32);
        BASALT_QUARTZ_GEODE_RARITY = registerConfigOption("Rarity of Basalt Quartz Geode", 32);
*/
    }

    @Override
    public List<ConfigOption> configOptions() {
        return CONFIG_OPTIONS;
    }

    @Override
    public String getModId() {
        return GeodePlus.MOD_ID;
    }

    @Override
    public void init() {

    }

    @Override
    public String getSuffix() {
        return null;
    }

    @Override
    public void load() {

    }

    @Override
    public void save() {

    }
}
