import java.util.Scanner;
public class ZaraBonus {

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] data, double[][] result) {
        double sumOld = 0;
        double sumNew = 0;
        double sumBonus = 0;

        System.out.println("EmpOldSalary,Years,Bonus,NewSalary");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][0];
            double newSalary = result[i][1];

            sumOld += oldSalary;
            sumNew += newSalary;
            sumBonus += bonus;

            System.out.println((i + 1) + " " + oldSalary + " " + years + " " + bonus + " "  + newSalary);
        }

        System.out.println("\nTotal Old Salary: " + sumOld);
        System.out.println("Total Bonus: " + sumBonus);
        System.out.println("Total New Salary: " + sumNew);
    }

    public static void main(String[] args) {
        int[][] data = generateEmployeeData(10);
        double[][] result = calculateBonusAndNewSalary(data);
        displaySummary(data, result);
    }
}