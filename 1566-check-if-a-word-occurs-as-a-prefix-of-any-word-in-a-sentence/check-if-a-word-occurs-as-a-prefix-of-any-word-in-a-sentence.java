class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        
        // Iterate through the words using 1-based indexing
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }
        
        return -1; // Ret
        
    }
}