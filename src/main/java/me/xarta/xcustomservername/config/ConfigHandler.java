package me.xarta.xcustomservername.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigHandler {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.ConfigValue<String> SERVER_BRAND;

    static {
        BUILDER.push("xCustomServerName Configuration");
        BUILDER.comment("You can change server's name and brand there.");

        SERVER_BRAND = BUILDER
                .comment("Server's brand (F3)")
                .define("server-brand", "Server's Brand");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}