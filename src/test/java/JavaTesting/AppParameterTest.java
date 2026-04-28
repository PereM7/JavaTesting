package JavaTesting;

import JavaTesting.Resources.AppParameters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppParameterTest {
    public static final String DOMAIN_ESPERAT = "10.0.0.43";
    public static final String PORT_ESPERAT = "80";

    @Test
    public void domainURLCorrecte() {
        assertEquals(DOMAIN_ESPERAT, AppParameters.DOMAIN, "Retorna la part FQDN");
    }
}
