package assignment13;

import java.util.Scanner;

public class Question8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            int letters = 0;
            int digits = 0;
            int special = 0;

            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (!Character.isWhitespace(ch)) {
                    special++;
                }
            }

            System.out.println(letters);
            System.out.println(digits);
            System.out.println(special);
        }
    }

