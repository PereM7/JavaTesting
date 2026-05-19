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

    @Test
    public void throwingIllegalArgumentException () {

        assertThrows(IllegalArgumentException.class, () -> {
            Integer edat = null;
            String edatEnLletres = "";
            String text = "";

            try{
                System.out.println("Passa 1- Generar NullPointerException");
                edatEnLletres = edat.toString();
            }
            catch (NullPointerException npe) {
                System.out.println("Passa 2- Capturam la NullPointException");
                System.out.println("Passa 3- Anem a llançar una exepció.");
                throw new IllegalArgumentException("exepció llançada per mi.");
            }
            finally {
                System.out.println("Passa final - Codi de tancament.");

            }
        });

    }

    @Test
    public void excepcioErronia () {

        assertThrows(NullPointerException.class, () -> {
            Integer edat = null;
            String edatEnLletres = "";
            String text = "";

            try{
                System.out.println("Passa 1- Generar NullPointerException");
                //edatEnLletres = edat.toString();
                throw new IllegalArgumentException("exepció llançada per mi.");

            }
            catch (IllegalArgumentException iae) {
                System.out.println("Passa 2- Capturam la NullPointException");
            }
            finally {
                System.out.println("Passa final - Codi de tancament.");
            }
        });

    }

    @Test
    public void jugantObjectesExceptionTest () {
        Integer edat = null;
        String edatEnLletres = "";
        String text = "";

        try{
            edatEnLletres = edat.toString();
        }
        catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();


            System.out.println(npe.getMessage());
            System.out.println(npe.getStackTrace());
            npe.printStackTrace();
        }
        finally {
            text = "Edat == " + edatEnLletres;
        }

        assertEquals("Edat == "+18, text);
    }
}
