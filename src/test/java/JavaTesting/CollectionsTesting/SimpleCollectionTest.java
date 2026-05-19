package JavaTesting.CollectionsTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(0, diesSetmana.size());
        assertFalse(diesSetmana.containsAll(diesFeiners));

        diesSetmana.addAll(diesFeiners);
        assertTrue(diesSetmana.containsAll(diesFeiners));

        diesFinde.add("dissabte");
        diesFinde.add("diumenge");

        diesSetmana.addAll(diesFinde);
        assertTrue(diesSetmana.containsAll(diesFeiners));

        List<String> diesSenars = new ArrayList<>();

        diesSenars.addAll(diesSetmana);
        assertTrue(diesSenars.contains("dimarts"));

        diesSenars.remove(1);
        assertFalse(diesSenars.contains("dimarts"));

        diesSenars.remove("dijous");
        assertFalse(diesSenars.contains("dijous"));

        List<String> diesFeinersSenars = new ArrayList<String>();
        diesFeinersSenars.addAll(diesSenars);

        diesFeinersSenars.removeAll(diesFinde);
        assertTrue(diesFeinersSenars.size() == 3);
        assertFalse(diesFeinersSenars.contains("dissabte"));

        List<String> calculDies = new ArrayList<>();
        calculDies.addAll(diesSetmana);

        calculDies.clear();
        assertTrue(calculDies.isEmpty());

        calculDies.addAll(diesSetmana);
        calculDies.removeAll(diesFinde);
        assertEquals(5, calculDies.size());


    }

    public void initDiesFeiners (List<String> dies) {
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }
}
