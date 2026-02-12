import java.util.*;
    class arrayMultipleValue{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the integer");
			int n = sc.nextInt();
			int[]number = new int[n];
			int count = 0;
			while(count<10){
				int value = sc.nextInt();
			    if(value<=0){
					break;
				}
				number[count] = value;
				count++;
			}
			int sum = 0;
			for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
            sum += number[i];
			}
			System.out.println(sum);
		}
	}
	