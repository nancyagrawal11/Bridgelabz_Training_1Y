import java.util.Scanner;
   class totalPrice{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter unit price in INR");
   int unitPrice = sc.nextInt();
   System.out.println("Enter quantity bought in KG");
   int quantity = sc.nextInt();
   double totalPrice = unitPrice*quantity ;
   System.out.println("the total price of item in INR is:"+totalPrice);
   
   }
 }