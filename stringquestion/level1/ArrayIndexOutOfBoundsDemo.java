import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    
    public static void generateException() {

        Scanner sc = new Scanner(System.in);

      
        String[] names = new String[3];

        
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        
        System.out.println("Accessing invalid index");
        System.out.println(names[5]);   

    
    public static void handleException() {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        System.out.println("Enter 3 names again:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        try {
            System.out.println("Accessing invalid index safely...");
            System.out.println(names[5]);   
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Invalid index. Please access index between 0 and " + (names.length - 1));
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

        
        handleException();
    }