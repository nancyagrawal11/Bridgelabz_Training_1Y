class Solution {
    public int findLucky(int[] arr) {

        
     int max = 0;

for (int num : arr) {
    max = Math.max(max, num);
}

int[] freq = new int[max + 1];

for (int num : arr) {
    freq[num]++;
}

int ans = -1;

for (int num : arr) {
    if (freq[num] == num) {
        ans = Math.max(ans, num);
    }
}

return ans;


























        
    }
}