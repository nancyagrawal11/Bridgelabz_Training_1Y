class Solution {
    public int findLucky(int[] arr) {

    int max = arr[0];

        // Find maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Count frequency
        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Find largest lucky integer
        for (int i = max; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
}

