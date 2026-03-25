import java.util.Scanner;

public class VoteChecker{

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        VoteChecker obj = new VoteChecker();

        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            boolean result = obj.canStudentVote(ages[i]);
            System.out.println(result);
        }
    }
}