package com.sistema.de.pagamento.sitemadepagamento.util;

import java.security.SecureRandom;

public class RandomString {

    // static significa que a variavel nao sera atualizada
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int lenght) {
        SecureRandom secureRandom = new SecureRandom(); // ver o que e isso
        StringBuilder sb = new StringBuilder(); // ver o que e isso
        for(int i = 0; i < lenght; i++) {
            int index = secureRandom.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}
