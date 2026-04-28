package JavaTesting;

import JavaTesting.Resources.AppParameters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppParameterTest {
    public static final String DOMAIN_ESPERAT = "127.0.0.1";
    public static final String PORT_ESPERAT = "80";
    public static final String URL_ESPERAT = "https://" + DOMAIN_ESPERAT + ":" + PORT_ESPERAT;

    @Test
    public void domainURLCorrecte() {
        assertEquals(DOMAIN_ESPERAT, AppParameters.DOMAIN, "Retorna la part FQDN");
    }

    @Test
    public void correctPORT() {
        assertEquals(PORT_ESPERAT, AppParameters.PORT, "Retorna el PORT de froma correcte ");
    }

    @Test
    public void correctURL() {
        assertEquals(URL_ESPERAT, AppParameters.deployedURL(), "Retorna la URL de froma correcte ");
    }

    @Test
    public void singletonCorrectness() {
        AppParameters instancia1 = AppParameters.getInstance();
        AppParameters instancia2 = AppParameters.getInstance();

        assertTrue((instancia1 == instancia2), "Comprovació unicitat instancia del singleton");
    }
}
