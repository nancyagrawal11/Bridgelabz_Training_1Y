import java.util.Scanner;
    class prime{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			boolean prime = true;
			if(n<=1){
				System.out.println("please enter number greater than 1);
			}
			else{
				for(int i = 2; i<=n,i++){
					if(n%i == 0){
						prime = false;
						break;
					}
				}
			}
			if(prime){
				System.out.println(number+"prime number");
			}
			else{
				System.out.println(number+" not a prime number");
			}
		}
	}
	
				
				