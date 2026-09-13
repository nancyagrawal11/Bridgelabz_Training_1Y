class Solution {
    public void wiggleSort(int[] nums) {
        
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Make a copy
        int[] temp = nums.clone();

        int left = (n + 1) / 2 - 1;
        int right = n - 1;

        // Step 3: Fill small and large elements alternately
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                nums[i] = temp[left];
                left--;
            } else {
                nums[i] = temp[right];
                right--;
            }
        }
    }
}
