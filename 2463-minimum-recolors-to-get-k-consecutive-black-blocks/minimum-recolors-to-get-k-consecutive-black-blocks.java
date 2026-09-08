class Solution {
    public int minimumRecolors(String blocks, int k) {
        int black = 0;
        int minRecolors = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {
            
            if (blocks.charAt(i) == 'B') {
                black++;
            }

            
            if (i >= k) {
                if (blocks.charAt(i - k) == 'B') {
                    black--;
                }
            }

            if (i >= k - 1) {
                int recolors = k - black;
                minRecolors = Math.min(minRecolors, recolors);
            }
        }

        return minRecolors;

        
    }
}