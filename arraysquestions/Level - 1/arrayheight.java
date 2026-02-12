import java.util.*;
    class arrayHeight{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			double[]height = new double[11];
			double sum = 0;
			double mean;
			for(int i=0;i<11;i++) {
			    height[i]=sc.nextInt();
			}
			for(int i = 0 ; i<11 ;i++){
				sum = sum + height[i];
				
			}
			mean = sum/11;
			System.out.println(mean);
		}
	}
				
			
			