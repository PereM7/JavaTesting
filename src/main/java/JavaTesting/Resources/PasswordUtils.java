package JavaTesting.Resources;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALFABET = "0123456789ABCDEFG"; //S'hauria d'allargar

    public static String generarSalt() {
        return generarSalt(8);
    }
    public static String generarSalt (int longitud) {
        StringBuilder valor = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            valor.append(ALFABET.charAt(RANDOM.nextInt(ALFABET.length())));
        }
        return valor.toString();
    }

    public static String generarPasswordSegura (String password, String salt){

        return hashedPassword(password, salt);
    }

    public static String hashedPassword (String password, String salt) {
        String resultat = "";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update( (salt + password).getBytes());
            //resultat = (md.digest()).toString();
            resultat = new String (md.digest());
        }
        catch (NoSuchAlgorithmException nsae) {
            System.out.println("Algoritme hash erroni.");
            System.exit(1);
        }
        return resultat;
    }

    public static boolean verifyUserPassword (String passwordEntrada, String userSalt, String passwordSegura) {
        return passwordSegura.equals(hashedPassword(passwordEntrada, userSalt));
    }

}
