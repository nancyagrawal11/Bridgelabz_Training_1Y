import java.util.Scanner;
    class prime{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			if(n==0){
			count = 1;
			}
			else{
				while(n!=0){
					n = n/10;
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
	