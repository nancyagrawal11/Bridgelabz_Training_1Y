import java.util.Scanner;
	class largest{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter first num");
			int num1= sc.nextInt();
			System.out.println("enter second num");
			int num2= sc.nextInt();
			System.out.println("enter third num");
			int num3= sc.nextInt();
			if(num1>num2 && num1>num3){
				System.out.println("num 1 is largest");
			}
		    else if(num2>num1 && num2>num3){
				System.out.println("num 2 is largest");
				}
			else if(num3>num1 && num3>num2){
				System.out.println("num 3 is largest");
		    }			
			else{
			System.out.println("invalid num");
			}
		}
	}	
		