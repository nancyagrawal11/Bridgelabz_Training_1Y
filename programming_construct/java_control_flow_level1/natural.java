import java.util.Scanner;
	class smallestNum{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
            System.out.println("enter natural numbers");
			int n = sc.nextInt();
                if( n != 0){
                System.out.println("natural numbers:");
			    }		
			else if(n==0){
				System.out.println("not a natural number:");
	            }
			int sum = 0 ;
			sum = n*(n+1)/2+sum;
			System.out.println("sum of natural numbers is :"+sum);
		    
			
		}
	}	
	