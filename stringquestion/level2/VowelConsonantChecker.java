import java.util.Scanner;

public class VowelConsonantChecker {

    
    public static String checkCharacterType(char ch) {
        
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

      
        if (ch >= 'a' && ch <= 'z') {

            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }


    public static String[][] findVowelsAndConsonants(String input) {

        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    public static void displayResult(String[][] data) {

        System.out.println("CharacterType");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findVowelsAndConsonants(input);

        displayResult(result);

    }
}
