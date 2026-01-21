import java.util.Scanner;
   class Height{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your height in cm");
   int heightInCm = sc.nextInt();
   System.out.println("Enter your height in inches");
   double heightInFoot = heightInCm*0.0328084;
   System.out.println(heightInFoot);
   double heightInInches = heightInCm*0.393701;
   System.out.println(heightInInches);
   
   
  
   }
 }