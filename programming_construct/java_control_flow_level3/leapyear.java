import java.util.Scanner;
    class leapYear{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the year");
			int year = sc.nextInt();
			if(year>1582){
				System.out.println("the forthmost years are consider as leap year");
			}
			else if(year % 400 == 0){
				System.out.println("the year is a leap year");
			}
			else if(year % 4 == 0){
				System.out.println("the year is a leap year");
			}
			else{
				System.out.println("the year is not a leap year");
			}
		}
	}
			