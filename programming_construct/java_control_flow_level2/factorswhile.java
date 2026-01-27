import java.util.Scanner;
    class factorsWhile{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(n<=0){
		System.out.println("please enter a positive number");
		}
		else{
			    int counter = 1;
				while(counter<=n){
					if(counter%n==0){
						System.out.println("true:"+counter);
					}
					else{
						System.out.println("false");
					}
					counter++;
			    	
	            }
		   }
	    }
	}