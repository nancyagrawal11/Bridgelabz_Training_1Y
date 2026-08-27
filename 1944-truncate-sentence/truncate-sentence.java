class Solution {
    public String truncateSentence(String s, int k) {
        String[] word = s.split("\\s+");
        String[] a = new String[k];
        for(int i = 0 ; i<k ;i++){
            a[i] = word[i];
        }
        String n = String.join(" ",a);
       

        return n;
    }
}