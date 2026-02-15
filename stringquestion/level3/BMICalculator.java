import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;  
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
                String.format(heightCm),
                String.format(weight),
                String.format(bmi),
                status
        };
    }

   
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            String[] personData = calculateBMI(data[i][0], data[i][1]);
            result[i] = personData;
        }

        return result;
    }

    
    public static void displayResult(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
       
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "" +
                               result[i][1] + "" +
                               result[i][2] + "" +
                               result[i][3]);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];  


        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        
        String[][] result = processBMI(data);

        displayResult(result);

    }
}
