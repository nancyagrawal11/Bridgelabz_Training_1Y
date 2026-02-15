import java.util.Scanner;

public class WordsWithLengths {

    
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
        // Add last word
        if (getStringLength(sb.toString()) > 0) {
            words[index] = sb.toString();
        }

        return words;
    }


    public static String[][] getWordsWithLengths(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        
        String[] words = customSplit(input);

        
        String[][] wordsWithLengths = getWordsWithLengths(words);


        for (int i = 0; i < wordsWithLengths.length; i++) {
            String word = wordsWithLengths[i][0];
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.printf( word, length);
        }

        
    }
}
