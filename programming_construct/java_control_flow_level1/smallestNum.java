import java.util.Scanner;
	class smallestNum{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			int num3= sc.nextInt();
			if(num1<num2 && num1<num3){
			    if(num2<num3){
				System.out.println("num 2 is smaller ");
				}
			System.out.println("num 1 is smaller from other two numbers");
			}
			else{
			System.out.println("not smaller");
			}
		}
	}	
		