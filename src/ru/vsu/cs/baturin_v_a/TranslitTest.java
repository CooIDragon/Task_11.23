package ru.vsu.cs.baturin_v_a;

import org.junit.Assert;
import org.junit.Test;

public class TranslitTest {
    Translit translit = new Translit();

    @Test
    public void testUpperWithLower() {
        String text = "ПрИВет";

        String expectedResult = "PrIVet";
        String factualResult = translit.CyrillicToLatinStr(text);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testNull() {
        String text = "";

        String expectedResult = "";
        String factualResult = translit.CyrillicToLatinStr(text);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testSpaces() {
        String text = "п р и в е т";

        String expectedResult = "p r i v e t";
        String factualResult = translit.CyrillicToLatinStr(text);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testMoreThanOneWord() {
        String text = "один два три";

        String expectedResult = "odin dva tri";
        String factualResult = translit.CyrillicToLatinStr(text);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testWithPunctuationMarks() {
        String text = "Привет, я Гоша";

        String expectedResult = "Privet, ia Gosha";
        String factualResult = translit.CyrillicToLatinStr(text);

        Assert.assertEquals(expectedResult, factualResult);
    }
}