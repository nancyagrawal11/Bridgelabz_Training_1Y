import java.util.Scanner;
   class Profit{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter cost price");
   int costPrice = sc.nextInt();
   System.out.println("Enter selling price");
   int sellingPrice = sc.nextInt();
    int profit  = sellingPrice - costPrice;
   System.out.println(profit);
   float percent = profit * 100/ costPrice;
   System.out.println("the profit percentage is:"+percent);
   }
 }