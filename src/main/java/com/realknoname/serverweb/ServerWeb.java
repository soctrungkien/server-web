package com.realknoname.serverweb;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.SERVER)
public class ServerWeb implements DedicatedServerModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("server-web");

    @Override
    public void onInitializeServer() {
        LOGGER.info("[ServerWeb] Starting Server Web mod...");

        // Generate secure token
        TokenManager.generateToken();
        String token = TokenManager.getToken();

        LOGGER.info("[ServerWeb] Secure token generated: {}", token);
    }
}
