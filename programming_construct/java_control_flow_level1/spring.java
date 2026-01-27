import java.util.Scanner;
    class spring{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter month1");
			int month1 = sc.nextInt();
			System.out.println("enter day");
			int day = sc.nextInt();
			if( month1 == 3 && day>=20 && day<=31 ||month1 == 3 && day<=20 && day>=1  ){
				System.out.println("its a spring season");
			}
			else{
				System.out.println("its not spring season");
			}
		}
	}
	