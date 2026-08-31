class Solution {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            int countS = 0;
            int countT = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    countS++;
                }
            }

            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == c) {
                    countT++;
                }
            }

            if (countT > countS) {
                return c;
            }
        }

        return ' ';
        
    }
}