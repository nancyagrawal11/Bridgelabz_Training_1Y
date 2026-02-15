import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

  
    public static int[] generateRandomAges(int n) {

        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + random.nextInt(90); 
        }

        return ages;
    }


    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";  
            } 
            else {
                result[i][1] = "false"; 
            }
        }

        return result;
    }

    
    public static void displayResult(String[][] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

       
        int[] ages = generateRandomAges(n);

       
        String[][] result = checkVotingEligibility(ages);

       
        displayResult(result);

        scanner.close();
    }
}
