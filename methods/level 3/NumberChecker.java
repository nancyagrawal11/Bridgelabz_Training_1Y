import java.util.Scanner;
public class NumberChecker {

    public static int countDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        int temp = n;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == n;
    }

    public static void largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    public static void smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }

    public static void main(String[] args) {
        int number = 153;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Digit count: " + digitCount);
        System.out.println("Duck number: " + isDuckNumber(digits));
        System.out.println("Armstrong number: " + isArmstrongNumber(number, digits));

        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);
    }
}