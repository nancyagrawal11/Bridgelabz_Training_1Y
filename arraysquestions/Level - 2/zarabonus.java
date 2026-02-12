import java.util.Scanner;
 class ZaraBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; 
        double[][] results = new double[10][2];      
        
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

 
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (sal < 0 || years < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--; 
            } else {
                employeeData[i][0] = sal;
                employeeData[i][1] = years;
            }
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double rate = (years > 5) ? 0.05 : 0.02;

            double bonus = salary * rate;
            double newSalary = salary + bonus;

            results[i][0] = bonus;
            results[i][1] = newSalary;

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println(" Zara Payout Summary ");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}