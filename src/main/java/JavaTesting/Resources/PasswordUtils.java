package JavaTesting.Resources;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALFABET = "0123456789ABCDEFG"; //S'hauria d'allargar

    private static String generarSalt() {
        return generarSalt(8);
    }
    private static String generarSalt (int longitud) {
        StringBuilder valor = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            valor.append(ALFABET.charAt(RANDOM.nextInt(ALFABET.length())));
        }
        return valor.toString();
    }

}
