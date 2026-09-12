class Solution {
    public int findContentChildren(int[] g, int[] s) {

      
     Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int start = 0;

        for (int i = 0; i < g.length; i++) {

            int l = start;
            int r = s.length - 1;
            int index = -1;

            while (l <= r) {

                int mid = l + (r - l) / 2;

                if (s[mid] >= g[i]) {
                    index = mid;
                    r = mid - 1;       // look for smaller suitable cookie
                } 
                else {
                    l = mid + 1;
                }
            }

            if (index != -1) {
                count++;
                start = index + 1;
            } 
            else {
                break;
            }
        }

        return count;
    }
}