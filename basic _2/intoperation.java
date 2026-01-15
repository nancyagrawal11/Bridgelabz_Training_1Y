import java.util.Scanner;
   class intOperation{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a");
   int a = sc.nextInt();
   System.out.println("Enter b");
   int b = sc.nextInt();
   System.out.println("Enter c");
   int c = sc.nextInt();
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
 