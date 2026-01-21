import java.util.Scanner;
   class Divide1{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of pens");
   int pens = sc.nextInt();
   System.out.println("Enter number of students");
   int students = sc.nextInt();
    int division  = pens/students;
   System.out.println("the pens distributed between each student is:"+division);
   int remaining = pens - (students*division);
   System.out.println("the remaining pens are:"+remaining);
   }
 }