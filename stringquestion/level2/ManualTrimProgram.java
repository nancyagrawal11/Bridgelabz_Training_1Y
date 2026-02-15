import java.util.Scanner;

public class ManualTrimProgram {

    public static int[] findTrimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

       
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    
    public static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

 
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        
        int[] indexes = findTrimIndexes(input);
        String manualTrim = "";

        if (indexes[0] <= indexes[1]) {
            manualTrim = createSubstring(input, indexes[0], indexes[1]);
        }

        String builtInTrim = input.trim();

       
        boolean isSame = compareStrings(manualTrim, builtInTrim);

        System.out.println("Manual Trim Result: "" + manualTrim + "\"");
        System.out.println("Built-in Trim Result: "" + builtInTrim + "\"");
        System.out.println("Are both results same? " + isSame);

	}
}
