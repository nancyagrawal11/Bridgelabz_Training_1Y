import java.util.Scanner;
   class kmToMiles1{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter distance in km");
   int  km = sc.nextInt();
   double miles = km*1.6;
   
    System.out.println("distance in miles:"+miles);
  
   }
 }