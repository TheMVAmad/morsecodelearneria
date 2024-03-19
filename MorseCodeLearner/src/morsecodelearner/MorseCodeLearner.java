
package morsecodelearner;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class MorseCodeConverter {
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Random random = new Random();

    static {
        // Alphabet
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

    // Numbers
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
    }

    public static String toMorse(char character) {
        return charToMorse.get(character);
    }

    public static char getRandomCharacter() {
        Object[] chars = charToMorse.keySet().toArray();
        return (char) chars[random.nextInt(chars.length)];
    }
}



public class MorseCodeLearner {


    
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainUI mainUI = new MainUI(); // Create an instance of your MainUI
            mainUI.display(); // Make the MainUI visible
        });
    }
    
}
