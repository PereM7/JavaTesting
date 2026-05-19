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

    @Test
    public void catchNullPointerTest () {
        Integer edat = null;
        String edatEnLletres = "";

        try{
            edatEnLletres = edat.toString();
        }
        catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
        }
        assertEquals(""+18, edatEnLletres);
    }

    @Test
    public void tryCatchNullPointerTest () {
        Integer edat = null;
        String edatEnLletres = "";
        String text = "";

        try{
            edatEnLletres = edat.toString();
        }
        catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
        }
        finally {
            text = "Edat == " + edatEnLletres;
        }

        assertEquals("Edat == "+18, text);
    }
}
