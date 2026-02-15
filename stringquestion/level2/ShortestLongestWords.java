Write import java.util.Scanner;

public class ShortestLongestWords {

    
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int length = getStringLength(text);

        
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        
        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                if (getStringLength(sb.toString()) > 0) {
                    words[index++] = sb.toString();
                    sb = new StringBuilder();
                }
            }
        }
        if (getStringLength(sb.toString()) > 0) {
            words[index] = sb.toString();
        }

        return words;
    }

   
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    
    public static int[] findShortestLongest(String[][] wordsWithLengths) {
        if (wordsWithLengths.length == 0) return new int[]{-1, -1};

        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = customSplit(input);

        
        String[][] wordsWithLengths = getWordsWithLengths(words);

        int[] indexes = findShortestLongest(wordsWithLengths);

        if (indexes[0] != -1) {
            
            for (int i = 0; i < wordsWithLengths.length; i++) {
                String word = wordsWithLengths[i][0];
                int length = Integer.parseInt(wordsWithLengths[i][1]);
                System.out.printf(" word, length);
            }

            System.out.println("Shortest word: " + wordsWithLengths[indexes[0]][0] +
                    " (Length: " + wordsWithLengths[indexes[0]][1] + ")");
            System.out.println("Longest word: " + wordsWithLengths[indexes[1]][0] +
                    " (Length: " + wordsWithLengths[indexes[1]][1] + ")");
        } else {
            System.out.println("No words found in the input.");
        }

        scanner.close();
    }
}
