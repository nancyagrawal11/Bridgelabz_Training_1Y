import java.util.Scanner;
   class Calculator{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number1");
   int number1 = sc.nextInt();
   System.out.println("Enter number2");
   int number2= sc.nextInt();
    int addition   = number1+number2;
   System.out.println(addition);
   int subtraction   = number1-number2;
   System.out.println(subtraction);
   int multiplication = number1*number2;
   System.out.println(multiplication);
   int division  = number1/number2;
   System.out.println(division);
   
   }
 }