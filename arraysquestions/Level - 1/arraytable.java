import java.util.*;
    class arrayTable{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the integer");
			int integer = sc.nextInt();
			int  result = integer;
			int n = sc.nextInt();
			int []arr = new int[n];
		    for(int i=0;i<n;i++) {
			    arr[i]=sc.nextInt();
			}
			for(int i = 0 ; i<n ; i++){
		    System.out.println(result*arr[i]);
			}
			
		}
	}