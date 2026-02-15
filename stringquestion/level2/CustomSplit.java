import java.util.Scanner;
import java.util.Arrays;

public class CustomSplit {

    
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 1; 
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Create array to store words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : length;
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
            start = end + 1;
        }

        return words;
    }

    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Split using custom method
        String[] customWords = customSplit(input);

        // Split using built-in split() method
        String[] splitWords = input.split(" ");

        // Display both arrays
        System.out.println("Custom split result: " + Arrays.toString(customWords));
        System.out.println("Built-in split result: " + Arrays.toString(splitWords));

        // Compare arrays
        boolean result = compareArrays(customWords, splitWords);
        System.out.println("Do both methods produce the same result? " + result);

        scanner.close();
    }
}