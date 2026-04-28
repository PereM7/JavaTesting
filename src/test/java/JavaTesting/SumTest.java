package JavaTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void sumaTest () {
        int s = 1 + 1;

        assertEquals(2, s, "1 + 1 = 2");
    }
}
