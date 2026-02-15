import java.util.Scanner;

public class IllegalArgumentDemo{

    
    public static void generateException(String text) {

        int start = 5;
        int end = 2;   // start > end (invalid)

        
        String result = text.substring(start, end);

        System.out.println("Substring: " + result);
    }

    
    public static void handleException(String text) {

        int start = 5;
        int end = 2;   // start > end (invalid)

        try {
            String result = text.substring(start, end);
            System.out.println("Substring: " + result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
            System.out.println("Start index cannot be greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Demonstrating Exception without handling:");

        

        System.out.println("Demonstrating Exception with handling:");

       
        handleException(text);

        
    }
}