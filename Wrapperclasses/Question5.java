package assignment13;

public class Question5 {

        public static void main(String[] args) {
            int intValue = Integer.parseInt("123");
            double doubleValue = Double.parseDouble("3.14");
            boolean booleanValue = Boolean.parseBoolean("true");
            String binaryValue = Integer.toBinaryString(10);
            boolean isDigit = Character.isDigit('5');
            char upperChar = Character.toUpperCase('a');

            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(binaryValue);
            System.out.println(isDigit);
            System.out.println(upperChar);
        }
    }

