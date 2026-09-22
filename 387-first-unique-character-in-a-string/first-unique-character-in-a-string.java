class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> frequency = new HashMap<>();



        for (char ch : s.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
         for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;        
    }
}