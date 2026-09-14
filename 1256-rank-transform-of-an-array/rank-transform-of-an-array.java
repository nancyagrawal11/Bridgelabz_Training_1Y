class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] sort = arr.clone();
        Arrays.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = 0; i < sort.length; i++) {

            if (!map.containsKey(sort[i])) {
                map.put(sort[i], rank);
                rank++;
            }
        }

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}