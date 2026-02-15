import java.util.Scanner;

public class CharArrayComparison {

    
    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    
    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

        
        char[] userMethodArray = getCharacters(text);

        
        char[] builtInArray = text.toCharArray();

        
        boolean result = compareArrays(userMethodArray, builtInArray);

        
        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : userMethodArray) {
            System.out.print(ch + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        
        System.out.println("\n\nAre both character arrays equal? " + result);

        
    }
}