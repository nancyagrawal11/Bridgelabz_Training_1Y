class Solution {
    public int arrangeCoins(int n) {
   
    long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long coins = mid * (mid + 1) / 2;

            if (coins <= n) {
                // mid rows are possible.
                // Try to find more rows.
                left = mid + 1;
            } else {
                // mid rows require too many coins.
                right = mid - 1;
            }
        }

        return (int) right;



        
    }
}