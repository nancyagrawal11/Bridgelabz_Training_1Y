class Solution {
    public boolean isPalindrome(String s) {

StringBuilder clear = new StringBuilder();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (Character.isLetterOrDigit(ch)) {
        clear.append(Character.toLowerCase(ch));
    }
}

int l = 0;
int r = clear.length() - 1;

while (l < r) {
    if (clear.charAt(l) != clear.charAt(r)) {
        return false;
    }

    l++;
    r--;
}

return true;
    }        
}