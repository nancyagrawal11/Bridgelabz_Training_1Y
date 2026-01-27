import java.util.Scanner;
    class greatestFactor{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int greatestFactor = 1;
		    for(int i = 1 ; i>=n-1;i--){
			    if(n%i==0){
				greatestFactor = i;
			    }
		    System.out.println("the greatest factor is :"+greatestFactor);
		    break;
	        
		    }
		}
		
	}