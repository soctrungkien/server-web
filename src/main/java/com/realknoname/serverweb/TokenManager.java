package com.realknoname.serverweb;

import java.security.SecureRandom;
import java.util.Base64;

public class TokenManager {
    private static String token;

    public static void generateToken() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32]; // 256-bit token
        random.nextBytes(bytes);
        token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    public static String getToken() {
        if (token == null) {
            generateToken();
        }
        return token;
    }
}
