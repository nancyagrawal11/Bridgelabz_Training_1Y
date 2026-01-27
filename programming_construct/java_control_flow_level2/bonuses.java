import java.util.Scanner;
    class bonuses{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		System.out.println("enter yearofservice");
		double yearOfService = sc.nextDouble();
		System.out.println("enter bonus");
		double bonus = sc.nextDouble();
		bonus =  salary * yearOfService*100;
		System.out.println("the bonus amount is :"+bonus);
		}
	}
		
		
		