package net.yeoxuhang.geodeplus.common.config;

import com.kyanite.paragon.api.ConfigOption;
import com.kyanite.paragon.api.annotation.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class GeodeModCommonConfigs implements ModConfig {
    //Geodes
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LAPIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_REDSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_EMERALD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DIAMOND_GEODE;

    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_ECHO_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_QUARTZ_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_QUARTZ_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GOLD_GEODE;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_END_WRAPPIST_GEODE;

    //Crystals
    public static final ConfigOption<Boolean> SHOULD_GENERATE_ECHO_LARGE_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL;
    public static final ConfigOption<Boolean> SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL;

    /*public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_MINIMAL_HEIGHT;
    public static final ConfigOption<Boolean> WRAPPIST_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_MINIMAL_HEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> SCULK_GEODE_MAXIMAL_HEIGHT;*/

    private static ArrayList<ConfigOption> CONFIG_OPTIONS = new ArrayList<>();

    private static <T> ConfigOption<T> registerConfigOption(String title, T defaultValue) {
        ConfigOption<T> option = new ConfigOption<>(title, defaultValue);
        CONFIG_OPTIONS.add(option);
        return option;
    }

    static {
        SHOULD_GENERATE_LAPIS_GEODE = registerConfigOption("Enable Lapis Geode", true);
        SHOULD_GENERATE_REDSTONE_GEODE = registerConfigOption("Enable Redstone Geode", true);
        SHOULD_GENERATE_EMERALD_GEODE = registerConfigOption("Enable Emerald Geode", true);
        SHOULD_GENERATE_DIAMOND_GEODE = registerConfigOption("Enable Diamond Geode", true);
        SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE = registerConfigOption("Enable Deepslate Lapis Geode", true);
        SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE = registerConfigOption("Enable Deepslate Redstone Geode", true);
        SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE = registerConfigOption("Enable Deepslate Emerald Geode", true);
        SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE = registerConfigOption("Enable Deepslate Diamond Geode", true);
        SHOULD_GENERATE_ECHO_GEODE = registerConfigOption("Enable Echo Geode", true);
        SHOULD_GENERATE_NETHER_QUARTZ_GEODE = registerConfigOption("Enable Nether Quartz Geode", true);
        SHOULD_GENERATE_BASALT_QUARTZ_GEODE = registerConfigOption("Enable Basalt Quartz Geode", true);
        SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE = registerConfigOption("Enable Nether Glowstone Geode", true);
        SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE = registerConfigOption("Enable Basalt Glowstone Geode", true);
        SHOULD_GENERATE_NETHER_GOLD_GEODE = registerConfigOption("Enable Nether Gold Nugget Geode", true);
        SHOULD_GENERATE_END_WRAPPIST_GEODE = registerConfigOption("Enable End Wrappist Geode", true);
        SHOULD_GENERATE_ECHO_LARGE_CRYSTAL = registerConfigOption("Enable Echo Large Crystal", true);
        SHOULD_GENERATE_NETHER_QUARTZ_LARGE_CRYSTAL = registerConfigOption("Enable Nether Quartz Large Crystal", true);
        SHOULD_GENERATE_NETHER_GLOWSTONE_LARGE_CRYSTAL = registerConfigOption("Enable Nether Glowstone Large Crystal", true);
        SHOULD_GENERATE_END_WRAPPIST_LARGE_CRYSTAL = registerConfigOption("Enable End Wrappist Large Crystal", true);





        /*NETHER_QUARTZ_GEODE_PER_CHUNK = registerConfigOption("Nether Quartz Geodes Per Chunk", 16);
        NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK = registerConfigOption("Nether Basalt Quartz Geodes Per Chunk", 16);
        WRAPPIST_GEODE_PER_CHUNK = registerConfigOption("Wrappist Geodes Per Chunk", 32);
        SCULK_GEODE_PER_CHUNK = registerConfigOption("Sculk Geodes Per Chunk", 16);

        BUILDER.comment("Configs for Geode Height");
        NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT = registerConfigOption("Nether Quartz Geodes Minimal Height", 6);
        NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT = registerConfigOption("Nether Quartz Geodes Maximal Height", 110);
        NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT = registerConfigOption("Nether Basalt Quartz Geodes Minimal Height", 6);
        NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT = registerConfigOption("Nether Basalt Quartz Geodes Maximal Height", 110);
        WRAPPIST_GEODE_MINIMAL_HEIGHT = registerConfigOption("Wrappsit Geodes Minimal Height", 0);
        WRAPPIST_GEODE_MAXIMAL_HEIGHT = registerConfigOption("Wrappist Geodes Maximal Height", true);
        SCULK_GEODE_MINIMAL_HEIGHT = registerConfigOption("Sculk Geodes Minimal Height", 6);
        SCULK_GEODE_MAXIMAL_HEIGHT = registerConfigOption("Sculk Geodes Maximal Height", 30);*/
    }

    @Override
    public List<ConfigOption> configOptions() {
        return CONFIG_OPTIONS;
    }
}
