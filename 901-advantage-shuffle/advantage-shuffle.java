class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        Arrays.sort(nums1);

        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Sort nums2 indices by nums2 values in descending order
        Arrays.sort(index, (a, b) -> Integer.compare(nums2[b], nums2[a]));

        int left = 0;
        int right = n - 1;

        for (int i : index) {
            if (nums1[right] > nums2[i]) {
                // Largest number can beat nums2[i]
                ans[i] = nums1[right];
                right--;
            } else {
                // Cannot beat it, so sacrifice the smallest
                ans[i] = nums1[left];
                left++;
            }
        }

        
        return ans;
    }
}