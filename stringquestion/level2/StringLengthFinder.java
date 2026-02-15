import java.util.Scanner;

public class StringLengthFinder {

    
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.next();  

       
        int customLength = getStringLength(input);

        int builtInLength = input.length();

        
        System.out.println("Length of string (custom method): " + customLength);
        System.out.println("Length of string (built-in length()): " + builtInLength);

        scanner.close();
    }
}