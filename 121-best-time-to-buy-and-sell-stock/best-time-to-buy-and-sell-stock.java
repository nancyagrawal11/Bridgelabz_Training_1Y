class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for(int i = 1 ; i<n ;i++){
          if(prices[i -1 ] < min){
            min = prices[i -1 ];
          }
          int profit =  prices[i] -  min;

          if(profit > max){
            max = profit;
          }
        }
            

            
        return max;
        
    }
}