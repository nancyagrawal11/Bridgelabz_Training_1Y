class Solution {

    public int maximumWealth(int[][] accounts) {
        int maxWorth = 0;

        for (int[] customer : accounts) {
            int worth = 0;

            for (int balance : customer) {
                worth += balance;
            }

            if (worth > maxWorth) {
                maxWorth = worth;
            }
        }

        return maxWorth;
    }
}