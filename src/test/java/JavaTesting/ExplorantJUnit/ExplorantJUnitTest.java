package JavaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ExplorantJUnitTest {


    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testejantIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {

            throw new IllegalArgumentException();

        });
    }

    @Ignore
    @Test
    public void illegalParameterTest() {
        expected.expect(IllegalArgumentException.class);

            throw new IllegalArgumentException();
    }

    @Test
    public void missatgeExceptioTest () {
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("the");
        throw new IllegalArgumentException("the exception");
    }

    @BeforeClass
    public static void executaUnCopPerClasseAbansQualsevolTest() {
        System.out.println("Abans d'executar qualsevol test, un cop per classe");
    }

    @AfterClass
    public static void executaUnCopDespresDeQualsevolClasseTest() {
        System.out.println("Després d'executar qualsevol test, un cop per classe.");
    }

    @Before
    public void executaAbansCadaTest() {
        System.out.println("Abans d'executar qualsevol test, un cop per test");
    }

    @After
    public void executaDespresCadaTest() {
        System.out.println("Després d'executar qualsevol test, un cop per test.");
    }


    @Test
    public void assercionsDeJUnit () {
        assertEquals(5, 3+2);

        assertFalse(false);
        assertFalse(3 > 5);

        assertTrue(3 < 5);

        int[] fins10 = {1,2,3,4,5,6,7,8,9,10};
        int[] primers10 = {2,1,3,5,4,6,8,7,9,10};

        Arrays.sort(primers10);
        assertArrayEquals(fins10, primers10);

        assertNotNull("","Un String buit NO és null");

        assertNotSame("", null, "Un String buit NO és null");

        assertNull(null, "Només null es considera null");

        Object obj = null;
        assertSame(obj, null);

    }
}
