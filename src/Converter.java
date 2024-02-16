import java.util.HashMap;

public class Converter {
    private final HashMap<Character, String> engToMorse;
    private final HashMap<String, Character> morseToEng;

    public Converter() {
        engToMorse = new HashMap<>();
        engToMorse.put('A', "*-");
        engToMorse.put('B', "-***");
        engToMorse.put('C', "-*-*");
        engToMorse.put('D', "-**");
        engToMorse.put('E', "*");
        engToMorse.put('F',"**-*");
        engToMorse.put('G', "--*");
        engToMorse.put('H', "****");
        engToMorse.put('I', "**");
        engToMorse.put('J', "*---");
        engToMorse.put('K',"-*-");
        engToMorse.put('L', "*-**");
        engToMorse.put('M', "--");
        engToMorse.put('N', "-*");
        engToMorse.put('O', "---");
        engToMorse.put('P',"*--*");
        engToMorse.put('Q', "--*-");
        engToMorse.put('R', "*-*");
        engToMorse.put('S', "***");
        engToMorse.put('T', "-");
        engToMorse.put('U',"**-");
        engToMorse.put('V', "***-");
        engToMorse.put('W', "*--");
        engToMorse.put('X', "-**-");
        engToMorse.put('Y', "-*--");
        engToMorse.put('Z', "--**");
        engToMorse.put('0', "-----");
        engToMorse.put('1', "*----");
        engToMorse.put('2', "**---");
        engToMorse.put('3', "***--");
        engToMorse.put('4', "****-");
        engToMorse.put('5', "*****");
        engToMorse.put('6', "-****");
        engToMorse.put('7', "--***");
        engToMorse.put('8', "---**");
        engToMorse.put('9', "----*");


        morseToEng = new HashMap<>();
        morseToEng.put("*-", 'A');
        morseToEng.put("-***", 'B');
        morseToEng.put("-*-*", 'C');
        morseToEng.put("-**", 'D');
        morseToEng.put("*", 'E');
        morseToEng.put("**-*", 'F');
        morseToEng.put("--*", 'G');
        morseToEng.put("****", 'H');
        morseToEng.put("**", 'I');
        morseToEng.put("*---", 'J');
        morseToEng.put("-*-", 'K');
        morseToEng.put("*-**", 'L');
        morseToEng.put("--", 'M');
        morseToEng.put("-*", 'N');
        morseToEng.put("---", 'O');
        morseToEng.put("*--*", 'P');
        morseToEng.put("--*-", 'Q');
        morseToEng.put("*-*", 'R');
        morseToEng.put("***", 'S');
        morseToEng.put("-", 'T');
        morseToEng.put("**-", 'U');
        morseToEng.put("***-", 'V');
        morseToEng.put("*--", 'W');
        morseToEng.put("-**-", 'X');
        morseToEng.put("-*--", 'Y');
        morseToEng.put("--**", 'Z');
        morseToEng.put("-----", '0');
        morseToEng.put("*----", '1');
        morseToEng.put("**---", '2');
        morseToEng.put("***--", '3');
        morseToEng.put("****-", '4');
        morseToEng.put("*****", '5');
        morseToEng.put("-****", '6');
        morseToEng.put("--***", '7');
        morseToEng.put("---**", '8');
        morseToEng.put("----*", '9');
    }

    public String getMorse(char eng) {
        return engToMorse.get(eng);
    }

    public char getEng(String morse) {
        return morseToEng.get(morse);

    }
}
