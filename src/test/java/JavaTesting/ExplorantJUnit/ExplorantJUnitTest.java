package JavaTesting.ExplorantJUnit;

import org.junit.BeforeClass;
import org.junit.Rule;
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


}
