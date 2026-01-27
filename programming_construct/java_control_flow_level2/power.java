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
			    for(int i = 1;i<=power;i++){
				result = result*num;	
			    }
			System.out.println(result);
		    }
		}
	}
		