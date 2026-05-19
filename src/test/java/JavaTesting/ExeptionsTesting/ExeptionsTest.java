package JavaTesting.ExeptionsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExeptionsTest {

    @Test
    public void NullPointerTest() {
        assertThrows(NullPointerException.class, () -> {

            Integer edat = null;

            String edatEnLletres = edat.toString();

        });

        Integer edat = 18;

        String edatEnLletres = edat.toString();
        assertEquals(""+18, edatEnLletres);
    }


}
