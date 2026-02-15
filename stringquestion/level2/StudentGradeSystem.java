import java.util.Scanner;

public class StudentGradeSystem {
// a. Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); 
            }
        }
        return scores;
    }
 b. Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; 
        

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

          
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    
    public static String[][] calculateGrades(double[][] results) {
        int students = results.length;
        String[][] grades = new String[students][1];

        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];

            if (percentage >= 90)
                grades[i][0] = "A+";
            else if (percentage >= 80)
                grades[i][0] = "A";
            else if (percentage >= 70)
                grades[i][0] = "B";
            else if (percentage >= 60)
                grades[i][0] = "C";
            else if (percentage >= 50)
                grades[i][0] = "D";
            else if (percentage >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "F";
        }
        return grades;
    }

    
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {

 
        for (int i = 0; i < scores.length; i++) {

                    "S" + (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][0]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);

       
    }
}
