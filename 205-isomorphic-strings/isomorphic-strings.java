class Solution {
    public boolean isIsomorphic(String s, String t) {

      if (s.length() != t.length()) {
            return false;
        }

        char[] mapS = new char[256];
        char[] mapT = new char[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

           
            if (mapS[a] != 0 && mapS[a] != b) {
                return false;
            }

            if (mapT[b] != 0 && mapT[b] != a) {
                return false;
            }

          
            mapS[a] = b;
            mapT[b] = a;
        }

        return true;
    }
}