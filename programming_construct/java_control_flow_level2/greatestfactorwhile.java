import java.util.Scanner;
    class greatestFactorWhile{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int gf = 1;
		    if (n <=gf) {
            System.out.println("No factors exist for the given number.");
            } else {
				int counter = n/2;
                while(counter>=1) {
                    if (n % counter== 0) {
                        System.out.println("Greatest factor of " + n + " beside itself is: " +counter);
                        break;
                    }
				counter--;
                }
            }
        }
    }