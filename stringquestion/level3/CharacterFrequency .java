import java.util.Scanner;

public class CharacterFrequency {

    
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

      
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    
    public static String[][] characterFrequency(String text) {

        int[] freq = new int[256];

       
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

      
        String[][] result = new String[uniqueChars.length][2];

        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String[][] output = characterFrequency(input);

        
        System.out.println("Character Frequencies:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " : " + output[i][1]);
        }

        
    }
}
