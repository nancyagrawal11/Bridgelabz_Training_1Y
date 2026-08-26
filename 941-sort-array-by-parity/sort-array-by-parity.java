class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int l = 0 ;
        int r = nums.length -1;

        int arr[] =  new int[nums.length];

        for(int i =0  ; i<nums.length ;i++){
            if(nums[i] %2 ==0){
                arr[l] = nums[i];
                l++;
            }
          
            else if (nums[i] %2!=0){
                arr[r] = nums[i];
                r--;
            }
            else{
                arr[i] =0;
            }
        }        
        return arr;
    }
}