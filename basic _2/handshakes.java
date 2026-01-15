import java.util.Scanner;
   class Handshakes{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of students");
   int students = sc.nextInt();
   int n = students;
   int handshakes = (n*(n-1))/2; 
   System.out.println("the total number of hanshakes are:"+ handshakes);
   
   }
 }