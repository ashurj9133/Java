package testYantra;

import java.util.LinkedList;

public class Occurance {
    public static void main(String[] args) {
        String input = "a1b2c3x4y5z6778877zzcc";
        String output = transformString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String transformString(String input) {
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> digits = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(ch);
            } else {
                characters.add(ch);
            }
        }

        characters.addAll(digits);

        StringBuilder result = new StringBuilder();
        for (Character ch : characters) {
            result.append(ch);
        }

        return result.toString();
    }
}

