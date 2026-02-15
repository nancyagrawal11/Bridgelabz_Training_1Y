public class NullPointerDemo{
    public static void generateException() {
        String text = null;

        
        System.out.println("Length of string: " + text.length());
    }
	

   
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot call methods on a null reference.");
        }
    }

      public static void main(String[] args) {

        System.out.println("Demonstrating NullPointerException without handling:");
        
  

        System.out.println("Demonstrating NullPointerException with handling:");

        
        handleException();
	  }
}