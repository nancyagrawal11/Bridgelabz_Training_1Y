class Solution {
    public int longestPalindrome(String s) {
      
       
        char[] a = s.toCharArray();

        int[] count = new int[128];

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        int length = 0;
        boolean odd = false;

        for (int i = 0; i < count.length; i++) {

            if (count[i] % 2 == 0) {
                length += count[i];
            } 
            else {
                length += count[i] - 1;
                odd = true;
            }
        }

        if (odd) {
            length++;
        }

        return length;

        
    }
}