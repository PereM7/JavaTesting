package JavaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExplorantJUnitTest {


    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testejantIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {

            throw new IllegalArgumentException();

        });
    }

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
}
