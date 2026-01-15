import java.util.Scanner;
   class distance1{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter distance in feet ");
   int feet = sc.nextInt();
   int yard = 3*feet;
   System.out.println("distance in yard:"+yard);
   int miles = yard * 1760;
   System.out.println("distance in miles:"+miles);
   
   }
 }