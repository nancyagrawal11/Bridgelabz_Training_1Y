import java.util.Scanner;
    class oddEven{
	    public static void main(String[]args){
		    Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int num = sc.nextInt();
			for(int i = 1 ; i<= num ; i++){
				if(i%2==0){
				   System.out.println("the number is even:"+i);
				}
			}
		
			for(int i = 1 ; i<= num ; i++){
				if(i%2!=0){
				System.out.println("the number is odd:"+i); 
				}
			}
		}
	}
			
				