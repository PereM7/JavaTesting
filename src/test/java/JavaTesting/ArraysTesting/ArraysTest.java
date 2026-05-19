package JavaTesting.ArraysTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {

    @Test
    public void exempleArraysSenzill () {
        String[] numerals = {"zero", "un", "dos", "tres"};

        assertEquals("zero", numerals[0]);

        String nombres = "";
        for (String n: numerals) {
            nombres += n + "|";
        }

        assertEquals(nombres, "zero|un|dos|tres|");
    }
}
