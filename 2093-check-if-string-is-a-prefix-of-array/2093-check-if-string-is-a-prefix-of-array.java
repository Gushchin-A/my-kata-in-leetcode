class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder wordsStr = new StringBuilder();

        for (String w : words) {
            wordsStr.append(w);
            if (!s.startsWith(wordsStr.toString())) {
                return false; 
            }

            if (wordsStr.length() == s.length()) {
                break;
            }
        }

        return wordsStr.toString().equals(s);
    }
}