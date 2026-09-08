class Solution {
    public int minimumRecolors(String blocks, int k) {
        int  n = blocks.length();
        int[] prefix = new int[n + 1];

  
    for (int i = 0; i < n; i++) {
        prefix[i + 1] = prefix[i];

        if (blocks.charAt(i) == 'B') {
            prefix[i + 1]++;
        }
    }

    int minRecolors = Integer.MAX_VALUE;

    for (int i = 0; i <= n - k; i++) {

        int black = prefix[i + k] - prefix[i];

        int recolors = k - black;

        minRecolors = Math.min(minRecolors, recolors);
    }

    return minRecolors;

        
    }
}