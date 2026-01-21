import java.util.Scanner;
   class Discount{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter student fees");
   int fees = sc.nextInt();
   System.out.println("Enter discount given");
   int discountGiven= sc.nextInt();
    float discountAmount  = (fees*(discountGiven/100));
   System.out.println("amount paid by student:"+discountAmount);
  
   }
 }