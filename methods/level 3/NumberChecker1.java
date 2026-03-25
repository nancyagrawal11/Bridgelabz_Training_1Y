import java.util.Scanner;
public class NumberChecker1NumberChecker1 {

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

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j++] = arr[i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = storeDigits(n);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12075;

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Digit count: " + count);

        System.out.print("Digits ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println( compareArrays(digits, reversed));
        System.out.println( isPalindrome(number));
        System.out.println( isDuckNumber(digits));
    }
}