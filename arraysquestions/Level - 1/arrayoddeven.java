import java.util.*;
    class arrayOddEven{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int number = sc.nextInt();
			if(number == 0 ){
				System.out.println("error");
				return;
			}
		int []odd = new int[number/2+1];
		int []even = new int[number/2+1];
		int evenIndex = 0;
		int oddIndex = 0;
		
		for(int i = 0 ; i<number ; i++){
			if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
		System.out.println("Odd Numbers:");
            for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
            }
        System.out.println("Even Numbers:");
            for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
            }
		}
	}
		

