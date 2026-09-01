class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;
        int l =0 ;
        int r = n-1;
        int result[] = new int[n];

       for(int i= 0 ;i<n ;i++){
            if(nums[i]%2==0){
                result[l] =  nums[i];
                l++;
            }
            else{
                result[r] = nums[i];
                r--;
            }
        }
        return result;
        
    }
}