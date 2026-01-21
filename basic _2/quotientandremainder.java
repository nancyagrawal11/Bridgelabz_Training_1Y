import java.util.Scanner;
   class quotientAndRemainder{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter num1");
   int num1= sc.nextInt();
   System.out.println("Enter num2");
   int num2= sc.nextInt();
   double quotient = num1/num2;
   System.out.println("the quotient is :"+quotient);
   double remainder = num1%num2;
    System.out.println("the quotient is :"+remainder);
   
   
   
   
  
   }
 }