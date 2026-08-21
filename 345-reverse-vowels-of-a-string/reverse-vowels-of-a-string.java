class Solution {
    public String reverseVowels(String s) {
       
     int n = s.length() - 1;
        int st = 0;
        int end = n;
        char ch[] = s.toCharArray();

        while (st < end) {

            if ((ch[st] == 'a' || ch[st] == 'e' || ch[st] == 'i' ||
                 ch[st] == 'o' || ch[st] == 'u' ||
                 ch[st] == 'A' || ch[st] == 'E' || ch[st] == 'I' ||
                 ch[st] == 'O' || ch[st] == 'U') &&
                (ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' ||
                 ch[end] == 'o' || ch[end] == 'u' ||
                 ch[end] == 'A' || ch[end] == 'E' || ch[end] == 'I' ||
                 ch[end] == 'O' || ch[end] == 'U')) {

                char temp = ch[st];
                ch[st] = ch[end];
                ch[end] = temp;

                st++;
                end--;
            }
            else if (ch[st] == 'a' || ch[st] == 'e' || ch[st] == 'i' ||
                     ch[st] == 'o' || ch[st] == 'u' ||
                     ch[st] == 'A' || ch[st] == 'E' || ch[st] == 'I' ||
                     ch[st] == 'O' || ch[st] == 'U') {

                end--;
            }
            else {
                st++;
            }
        }

        return new String(ch);
    }
}
