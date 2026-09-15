class Solution {
    public int thirdMax(int[] nums) {

         for (int i = 1; i < nums.length; i++) {

            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    
     

        int count = 1;
        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;
            }

            if (count == 3) {
                return nums[i];
            }
        }

        return max;
    }
}