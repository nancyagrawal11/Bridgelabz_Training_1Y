import java.util.Scanner;

public class NumberFormatExceptionDemo {

    
    public static void generateException() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number");
        String text = sc.nextLine();   
        
        
        int number = Integer.parseInt(text);
        
        System.out.println("Converted number: " + number);
    }

   
    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (This will be handled safely): ");
        String text = sc.nextLine();   
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Invalid input. Please enter numeric value only.");
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        
        try {
            generateException();
        } 
        catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Now demonstrating handled exception:\n");


        handleException();
    }
}