class Solution {
    public int threeSumMulti(int[] arr, int target) {

         long MOD = 1_000_000_007L;

        long[] count = new long[101];

        for (int num : arr) {
            count[num]++;
        }

        long ans = 0;

        for (int a = 0; a <= 100; a++) {
            for (int b = a; b <= 100; b++) {
                int c = target - a - b;

                if (c < b || c > 100) {
                    continue;
                }

                if (a == b && b == c) {
                    // C(n, 3)
                    ans += count[a] * (count[a] - 1) * (count[a] - 2) / 6;
                } 
                else if (a == b) {
                    // C(count[a], 2) * count[c]
                    ans += count[a] * (count[a] - 1) / 2 * count[c];
                } 
                else if (b == c) {
                    // count[a] * C(count[b], 2)
                    ans += count[a] * count[b] * (count[b] - 1) / 2;
                } 
                else {
                    // count[a] * count[b] * count[c]
                    ans += count[a] * count[b] * count[c];
                }

                ans %= MOD;
            }
        }

         
        return (int) ans;
    }
}