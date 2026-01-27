import java.util.Scanner;
     class countDown{
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for countdown");
        int count = sc.nextInt();
        while(count>=1){
			System.out.println(count);
			count--;
		    }
			System.out.println("launch!");
		}
			
	}      			
  