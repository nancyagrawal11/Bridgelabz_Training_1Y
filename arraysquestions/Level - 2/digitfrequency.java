import java.util.Scanner;
 class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int  number = scanner.nextLong();
        
       int tempNumber = Math.abs(number);

        String numStr = String.valueOf(tempNumber);
        int digitCount = numStr.length();

        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        int[] frequency = new int[10];

        
        for (int digit : digits) {
            frequency[digit]++;
        }
        System.out.println("Frequency of each digit in the number " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        
    }
}