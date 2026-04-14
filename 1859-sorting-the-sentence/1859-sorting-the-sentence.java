class Solution {
    public String sortSentence(String s) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                spaces++;
            }
        }

        String[] words = new String[spaces + 1];
        int start = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                index = s.charAt(i - 1) - '0';
                words[index - 1] = s.substring(start, i - 1);
                start = i + 1;
            }
        }
        index = s.charAt(s.length() - 1) - '0';
        words[index - 1] = s.substring(start, s.length() - 1);

        return String.join(" ", words);
    }
}