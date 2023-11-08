package number;

import java.util.Scanner;

//public class RepeatedName {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        
//        String repeatedCharacters = findRepeatedCharacters(name);
//        System.out.println("Repeated characters: " + repeatedCharacters);
//    }
//    
//    public static String findRepeatedCharacters(String str) {
//        StringBuilder repeated = new StringBuilder();
//        
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (str.lastIndexOf(c) != i && str.indexOf(c) == i) {
//                repeated.append(c);
//            }
//        }
//        
//        return repeated.toString();
//    }
//}
public class RepeatedName {
    public static void main(String[] args) {
        String name ="saroj kumar"; // Predefined name
        System.out.print("Repeated characters: ");
        
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (name.indexOf(c) != name.lastIndexOf(c)) {
                if (name.indexOf(c, i + 1) == -1) {
                    System.out.print(c);
                }
            }
        }
        
        System.out.println();
    }
}




