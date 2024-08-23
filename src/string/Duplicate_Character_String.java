package string;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_Character_String {

    public static void main(String[] args) {
        // Java program to find duplicate characters in a String
        duplicatecharactercount("Learn Java Programming");
    }

    static void duplicatecharactercount(String inputString) {
        // Correct the HashMap type to store Integer counts
        HashMap<Character, Integer> charcountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        
        // Iterate through the character array
        for (char c : strArray) {
            // If character is already in the map, increment its count
            if (charcountMap.containsKey(c)) {
                charcountMap.put(c, charcountMap.get(c) + 1);
            } else {
                // Otherwise, initialize its count to 1
                charcountMap.put(c, 1);
            }
        }

        Set<Character> charsInString = charcountMap.keySet();
        System.out.println("Duplicate Characters in: " + inputString);
        
        // Print characters with more than one occurrence
        for (Character ch : charsInString) {
            if (charcountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charcountMap.get(ch));
            }
        }
    }
}
