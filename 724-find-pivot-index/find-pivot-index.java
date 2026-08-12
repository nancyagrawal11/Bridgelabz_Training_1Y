class Solution {
    public int pivotIndex(int[] nums) {

        int st = 0;
        int end =  nums.length -1;

    for (int pivotidx = 0; pivotidx < nums.length; pivotidx++) {

    int l = 0;
    int r = 0;

    for (int i = 0; i < pivotidx; i++) {
        l += nums[i];
    }

    for (int i = pivotidx + 1; i < nums.length; i++) {
        r += nums[i];
    }

    if (l == r) {
        return pivotidx;
    }
}

return -1;
    }
}
