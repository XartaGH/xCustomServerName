package me.xarta.xcustomservername;

import com.mojang.logging.LogUtils;
import me.xarta.xcustomservername.config.ConfigHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@SuppressWarnings("unused")
@Mod(XCustomServerName.MODID) // Declare this class as mod's main class
public class XCustomServerName {

    public static final String MODID = "xcustomservername"; // Define modification's ID
    public static final Logger LOGGER = LogUtils.getLogger(); // Create logger

    public XCustomServerName(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("xCustomServerName is initializing..."); // Print initialization message

        // Register config for the mod
        modContainer.registerConfig(
                ModConfig.Type.SERVER,
                ConfigHandler.SPEC,
                "xcustomservername.toml"
        );

        LOGGER.info("xCustomServerName is on."); // Print success message
    }
}