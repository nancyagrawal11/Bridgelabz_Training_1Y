class Solution {
    public String capitalizeTitle(String title){ 

    String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 2) {
                words[i] = Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1).toLowerCase();
            } else {
                words[i] = words[i].toLowerCase();
            }
        }

        return String.join(" ", words);
    

}
    }