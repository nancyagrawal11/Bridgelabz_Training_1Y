import java.util.Scanner;
	class eligible{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
            System.out.println("enter age of person");
			int age = sc.nextInt();
			if(age >= 18){
				System.out.println("the person is eligible for voting:");
			}
			else if(age < 18){
				System.out.println("the person is not eligible for voting:");
			}
			else{
				System.out.println("invalid age:");
			}
		}
	}
               
	