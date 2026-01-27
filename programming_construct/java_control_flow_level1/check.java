import java.util.Scanner;
	class check{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
			int number = sc.nextInt();
			if(number >= 0){
				System.out.println("the number is positive:");
			}
			else if(number == 0){
				System.out.println("the number is zero:");
			}
			else{
				System.out.println("the nummber is negative:");
			}
		}
	}
               
	