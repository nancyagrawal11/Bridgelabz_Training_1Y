import java.util.*;
    class arrayMultiplication{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int number = sc.nextInt();
			int b[] = new int[4];
			int index = 0;
			for(int i = 6 ; i<=9 ; i++){
				b[index] = number*i;
				index++;
			}
			index=0;
			for (int i = 6; i <= 9; i++) {
            System.out.println(b[index]);
            index++;
            }
		}
	}

			
		