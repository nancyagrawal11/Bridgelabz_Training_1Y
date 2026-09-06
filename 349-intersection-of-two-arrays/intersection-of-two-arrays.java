class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean duplicate = false;

                    for (int x = 0; x < k; x++) {
                        if (temp[x] == nums1[i]) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (!duplicate) {
                        temp[k++] = nums1[i];
                    }

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