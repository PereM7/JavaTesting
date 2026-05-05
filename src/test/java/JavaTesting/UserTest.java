package JavaTesting;

import DomainEntities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void constructUserTest() {
        User usuari = new User();

        assertTrue(usuari != null);

        assertEquals(usuari.getName(), "Tomeu");
        assertEquals(usuari.getPassword(), "secret");
    }
}
