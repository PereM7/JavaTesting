package JavaTesting.CollectionsTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCollectionTest {

    @Test
    public void primeraCollectionTest() {
        String[] nombres = {"zero", "un", "dos", "tres"};

        List<String> numerals = new ArrayList<>();

        for(String s: nombres) {
            numerals.add(s);
        }

        assertTrue(numerals.size() == 4);

        numerals.add("quatre");
        assertTrue(numerals.size() == 5);


        List<String> llistaNum = Arrays.asList(nombres);
        assertTrue(llistaNum.size() == 4);

        //llistaNum.add("quatre");


    }

    @Test
    public void diesSetmana() {
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesFinde = new ArrayList<>();

        initDiesFeiners(diesFeiners);
        assertTrue(diesFeiners.size() == 5);
    }

    public void initDiesFeiners (List<String> dies) {
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }
}
