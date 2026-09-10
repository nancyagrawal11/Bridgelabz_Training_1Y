class Solution {
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        

        int n = arr.length;

        for(int i = n - 1 ; i>= 0 ; i--){
            for(int j = 0 ; j<n ; j++){
                 
             
                  if( i!=j && arr[i] == 2*arr[j] ){
                    return true ;
                  }
                   
             
                
            
            }
        }
        return false;
        
    }
}