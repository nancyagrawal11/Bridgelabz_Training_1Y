import java.util.Scanner;
    class power{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		System.out.print("Enter the power: ");
        int power = sc.nextInt();
		int result = 1;
		if(num<0 || power<0){
			System.out.println("enter the positive number");
		}
		else{
			    int counter = num - 1;
				while(counter>1){
					if(num%counter==0){
						System.out.println(num);						
					}
				counter--;
				}
				
		    }
		}
	}
		