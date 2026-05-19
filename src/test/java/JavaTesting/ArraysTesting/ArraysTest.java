package JavaTesting.ArraysTesting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void provesOrdenacioArray () {
        String[] numerals = {"zero", "un", "dos", "tres"};

        Arrays.sort(numerals);

        for(int i = 0; i < numerals.length - 1; i++) {
            assertTrue(numerals[i].compareTo(numerals[i + 1]) < 0);
        }
    }
}
