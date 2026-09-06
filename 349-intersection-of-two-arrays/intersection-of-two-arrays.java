class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            // Check if nums1[i] is already added
            boolean already = false;
            for (int j = 0; j < k; j++) {
                if (temp[j] == nums1[i]) {
                    already = true;
                    break;
                }
            }

            if (already) continue;

            // Linear search in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    break;
                }
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }

        return ans;
        
    }
}