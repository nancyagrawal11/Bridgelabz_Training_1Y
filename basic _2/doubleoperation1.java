import java.util.Scanner;
   class doubleOperation1{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a");
   double a = sc.nextDouble();
   System.out.println("Enter b");
   double b = sc.nextDouble();
   System.out.println("Enter c");
   double c = sc.nextDouble();
   double p = a + b *c; 
   System.out.println(p);
   double q =  a * b +c;
   System.out.println(q);
   double r =  c + a / b; 
   System.out.println(r);
   double s = a % b + c;
   System.out.println(s);
   }
 }
 