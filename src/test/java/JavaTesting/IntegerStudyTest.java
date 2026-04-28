package JavaTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerStudyTest {

    @Test
    public void integerStudy() {
        Integer vuit = new Integer(8);
        Integer vint = new Integer("20");
        Integer tretze = 13;
        int esperat = 13;

        int minim = -2147483648;

        assertEquals(minim, Integer.MIN_VALUE, "El valor minim de un integer és -2147483648 ");

        assertEquals( esperat, tretze.intValue(), "El nombre real de tretze es 13");
        assertEquals(20, vint.intValue(), "El nombre real de vint es 20");

    }

    @Test
    public void integerCompararStudy() {
        Integer vuit = new Integer(8);
        Integer eight = new Integer("8");

        assertEquals(8, vuit.intValue(), "El nombre real de vuit es 8");
        assertEquals(8, eight.intValue(), "El nombre real de eight es 8");

        // assertTrue(vuit == eight); = False
        assertTrue(vuit.equals(eight));
    }

    @Test
    public void binariStudy() {
        Integer dos = new Integer(2);
        Integer vint = new Integer("20");
        Integer tretze = 13;

        String tipusPersones = "Hi ha " + Integer.toBinaryString(dos) + " tipus de persones...";
        assertEquals(2, dos.intValue(), tipusPersones);

        assertEquals( 13, tretze.intValue(), "El nombre real de tretze es 13");
        assertEquals(20, vint.intValue(), "El nombre real de vint es 20");

    }
}
