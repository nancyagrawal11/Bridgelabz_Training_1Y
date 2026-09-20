class Solution {
    public int findRadius(int[] houses, int[] heaters) {


        Arrays.sort(heaters);

        int answer = 0;

        for (int house : houses) {

            int index = Arrays.binarySearch(heaters, house);

            if (index < 0) {
                index = -index - 1;
            }

            int right = Integer.MAX_VALUE;
            int left = Integer.MAX_VALUE;

            // Heater on the right
            if (index < heaters.length) {
                right = heaters[index] - house;
            }

            // Heater on the left
            if (index > 0) {
                left = house - heaters[index - 1];
            }

            // Find closest heater
            int closest = Math.min(left, right);

            // Keep the biggest distance
            answer = Math.max(answer, closest);
        }

        return answer;
        
    }
}