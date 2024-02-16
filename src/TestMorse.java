import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {
    @Test
    public void testMorse1() {
        Converter converter = new Converter();
        char eng = 'A';
        String expected = "*-";
        String actual = converter.getMorse(eng);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorse2() {
        Converter converter = new Converter();
        char eng = 'E';
        String expected = "*";
        String actual = converter.getMorse(eng);
        assertEquals(expected, actual);
    }

    @Test
    public void testEng1() {
        Converter converter = new Converter();
        String morse = "*-";
        char expected = 'A';
        char actual = converter.getEng(morse);
        assertEquals(expected, actual);
    }
    @Test
    public void testEng2() {
        Converter converter = new Converter();
        String morse = "-***";
        char expected = 'B';
        char actual = converter.getEng(morse);
        assertEquals(expected, actual);
    }
}