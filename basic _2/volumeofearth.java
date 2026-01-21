import java.util.Scanner;
   class Volume{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter radius");
   int radius = sc.nextInt();
   System.out.println("Enter volume of earth");
   float volumeOfSphere = 4/3*3.14*radius*radius*radius;
    
   System.out.println(volumeOfSphere);
   
   
  
   }
 }