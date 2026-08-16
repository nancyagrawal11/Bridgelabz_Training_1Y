class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prefix[] = new int[nums.length ];
        int suffix[] = new int[nums.length ];

       int product = 1;
       
      

        for(int i = 0 ; i<nums.length ; i++){
        
            prefix[i] = product;
               product*=nums[i];
            
            
        }
        int pro = 1;
     
       for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = pro;
            pro*=nums[i];
        }

        int ans[] =  new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = prefix[i]*suffix[i];
        }



      

     return ans;

        
    }
}