class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;

        // Only one element
        if (n == 1) {
            return 0;
        }

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0 && nums[i] > nums[i + 1]) {
                return i;
            }

            // Last element
            if (i == n - 1 && nums[i] > nums[i - 1]) {
                return i;
            }

            // Middle element
            if (i > 0 && i < n - 1 &&
                nums[i] > nums[i - 1] &&
                nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;

    }
}