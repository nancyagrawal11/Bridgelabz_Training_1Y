import java.util.Scanner;
    class factors{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(n<=0){
		System.out.println("please enter a positive number");
		}
		else{
			    for(int i = 1; i<=n; i++){
				    if(n%i==0){
					System.out.println("true:"+i);
				    }
                    else{
				    System.out.println("false");
				    }
			    	
	            }
		   }
	    }
	}

			