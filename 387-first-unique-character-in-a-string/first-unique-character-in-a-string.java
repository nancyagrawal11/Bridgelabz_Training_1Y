class Solution {
    public int firstUniqChar(String s) {
    
      char[] ch = s.toCharArray();
      int[] count = new int[256];

     for (int i = 0; i < ch.length; i++) {
        count[ch[i]]++;
      }

     for (int i = 0; i < ch.length; i++) {
        if (count[ch[i]] == 1) {
        return i;
    }
     }

return -1;
    }
}