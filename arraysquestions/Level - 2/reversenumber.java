import java.util.Scanner;
import java.lang.Math;
class reverseNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int number = scanner.nextLong();
        int tempNumber = Math.abs(number);

        int digitCount = (tempNumber == 0) ? 1 : (int) Math.log10(tempNumber) + 1;

        int[] digitsArray = new int[digitCount];
        int currentNum = tempNumber;

        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int) (currentNum % 10);
            currentNum /= 10;
        }

        System.out.println("Original digits in array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        int[] reversedArray = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedArray[i] = digitsArray[digitCount - 1 - i];
        }
        System.out.println("Reversed digits in array:");
        if (number < 0) {
            System.out.print("-");
        }
        for (int digit : reversedArray) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
