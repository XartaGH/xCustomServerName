package me.xarta.xcustomservername.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigHandler {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.ConfigValue<String> SERVER_NAME;

    static {
        BUILDER.push("xCustomServerName Configuration");
        BUILDER.comment("You can change server's name there.");

        SERVER_NAME = BUILDER
                .comment("Server's name")
                .define("server-name", "Server Name");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}