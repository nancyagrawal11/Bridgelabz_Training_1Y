
import java.util.Scanner;

public class CharacterFrequencyNested {

    
    public static String[] findFrequency(String text) {

        
        char[] characters = text.toCharArray();
        int length = characters.length;

       
        int[] frequency = new int[length];

        for (int i = 0; i < length; i++) {

            if (characters[i] == '0') {
                continue;   
            }

            frequency[i] = 1;  

            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; 
                }
            }
        }

        
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }
    
    public static void display(String[] data) {

        System.out.println("Character Frequencies:");
       

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] result = findFrequency(input);

        display(result);

       
    }
}

