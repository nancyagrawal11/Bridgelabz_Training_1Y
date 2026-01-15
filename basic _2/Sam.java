import java.util.Scanner;
   class Sam{
   public static void main(String[]args){
   Scanner sc = ner Scanner(System.in);
   System.out.println("Enter maths marks");
   int maths = sc.nextInt();
   System.out.println("Enter physics marks");
   int physics = sc.nextInt();
    System.out.println("Enter chemistry marks");
   int chemistry = sc.nextInt();
   int sum = maths + physics + chemistry;
   System.out.println(sum);
   float average = sum/3;
   System.out.println("the average of subjects:"+average);
   }
 }
   
   