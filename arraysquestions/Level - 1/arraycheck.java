import java.util.*;
    class arrayCheck{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of students");
			int n = sc.nextInt();
			int []arr = new int[n];
		    for(int i=0;i<n;i++) {
			    arr[i]=sc.nextInt();
			}
			for(int i = 0 ; i<n ; i++){
				int num =  arr[i];
				if(num>0){
					if(num%2==0){
						System.out.println("value is even");
					}
					else{
						System.out.println("value is odd");
					}
				System.out.println("num is positive");
				}
				else if (num<0){
					System.out.println("numis negative");
				}
				else{
					System.out.println("num is zero ");
				}
				
			    if(arr[0] == arr[9] ){
					System.out.println("the first value and last value is equal");
				}
				else if(arr[0]>arr[9]){
					System.out.println("the first value is greater than last value ");
				}
				else(arr[9]>arr[0]){
					System.out.println("the last value is greater than first value ");
				}
			
			}
		}
	}
					
				