import java.util.Scanner;
   class triangleOfArea2{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter height");
   int height = sc.nextInt();
   System.out.println("Enter base");
   int base = sc.nextInt();
   double areaInCentimetre = 0.5*height*base;
   System.out.println(areaInCentimetre );
   double areaInInches =0.5*height*base*0.393701;
   System.out.println(areaInInches);
   }
 }
 