import java.util.Scanner;

 class largestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        long number = scanner.nextLong();

        int maxDigit = 10; 
        int[] digitsArray = new int[maxDigit];
        int index = 0;
        long tempNumber = number; 

        while (tempNumber != 0) {
       
            int digit = (int) (tempNumber % 10);
            digitsArray[index] = digit;
            tempNumber /= 10;
            index++;
            if (index == maxDigit) {
                System.out.println("Note: Only the last 10 digits were processed as per the program constraints.");
                break;
            }
        }
        int[] actualDigits = Arrays.copyOf(digitsArray, index);

        if (actualDigits.length < 2) {
            if (actualDigits.length == 1) {
                System.out.println("Only one digit entered. Largest digit: " + actualDigits[0]);
            } else {
                System.out.println("No digits entered or number was zero.");
            }
            return;
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int digit : actualDigits) {
            if (digit > largest) {
                secondLargest = largest; 
                largest = digit;         
            } else if (digit > secondLargest && digit != largest) {
                
                secondLargest = digit;
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All digits were the same (" + largest + "). No distinct second largest found.");
        } else {
            System.out.println("The digits in the array are: " + Arrays.toString(actualDigits));
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }
    }
}
