import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {

     
        int[] frequency = new int[256];

       
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[(int) ch]++;
        }

        
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

       
        String[][] result = new String[uniqueCount][2];

        
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("CharacterFrequency");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t   " + data[i][1]);
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        display(result);


    }
}
