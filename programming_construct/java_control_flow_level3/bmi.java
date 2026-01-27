import java.util.Scanner;
    class bmi{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the weight");
			double weight = sc.nextDouble();
			System.out.println("enter the height");
			double heighCm  = sc.nextDouble();
			double heightM= heightCm/100;
			double bmi = weight/(heightM*heightM);
			if(bmi<=18.4){
				System.out.println(underweighte);
			}
			else if(bmi>=18.5 && bmi<=24.9){
				System.out.println(normal);
			}
			else if(bmi>=25&& bmi<=39.9){
				System.out.println(overweight);
			}
			else{
				System.out.println(obesed);
			}
		}
	}
			
			