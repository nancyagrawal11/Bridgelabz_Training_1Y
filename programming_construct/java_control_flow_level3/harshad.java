import java.util.Scanner;
        class harshad{
        public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
        int digit = number % 10; // Get last digit
        sum = sum + digit; // Add digit to sum
        number = number / 10; // Remove last digit
        }
        if (originalNumber % sum == 0) {
        System.out.println("Harshad Number");
        } else {
        System.out.println("Not a Harshad Number");
        }
    }
}