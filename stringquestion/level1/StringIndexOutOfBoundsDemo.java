import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

   
    public static void generateException(String text) {

        
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    
    public static void handleException(String text) {

        try {
            
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Invalid index! Valid index range is 0 to " + (text.length() - 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Demonstrating Exception without handling:");

       

        System.out.println("\nDemonstrating Exception with handling:");

        
        handleException(text);

        
}