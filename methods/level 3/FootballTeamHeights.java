import java.util.Scanner;
public class FootballTeamHeights {
  public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
	 public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of players:");
        for (int h : heights){
            System.out.print(h + " ");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}