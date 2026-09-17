class Solution {
    public int threeSumMulti(int[] arr, int target) {

          long MOD = 1_000_000_007L;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {

                int required = target - arr[i] - arr[j];

                if (map.containsKey(required)) {
                    ans += map.get(required);
                    ans %= MOD;
                }

                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
        }

        return (int) ans;


         
      
    }
}