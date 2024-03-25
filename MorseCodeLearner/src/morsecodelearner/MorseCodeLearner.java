
package morsecodelearner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;

class MorseCodeConverter {
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();
    private static final Random random = new Random();

    static {

        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");

        charToMorse.put('0', "-----");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");
        charToMorse.forEach((key, value) -> morseToChar.put(value, key));

    };

    public static String toMorse(char character) {
        return charToMorse.get(character);
    }

    public static String toChar(String morse) {
        return String.valueOf(morseToChar.get(morse));
    }

    public static char getRandomCharacter() {
        Object[] chars = charToMorse.keySet().toArray();
        return (char) chars[random.nextInt(chars.length)];
    }

    public static String getRandomMorse() {
        List<String> morseCodes = new ArrayList<>(morseToChar.keySet());
        int randomIndex = random.nextInt(morseCodes.size());
        return morseCodes.get(randomIndex);
    }

    public class MorseCodeLearner {

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                MenuUI MenuUI = new MenuUI(); // Create an instance of your MainUI
                MenuUI.display(); // Make the MainUI visible
            });
        }

    }
}
