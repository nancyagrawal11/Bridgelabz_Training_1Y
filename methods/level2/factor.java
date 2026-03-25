import java.util.Scanner;

 class Factor{
static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
	}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println(getSum(factors));
        System.out.println(getProduct(factors));
        System.out.println(getSumOfSquares(factors));
    }
}	