class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int nMin = Math.min(word1.length(), word2.length());

        for (int i = 0; i < nMin; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        for (int i = nMin; i < word1.length(); i++) {
            result.append(word1.charAt(i));
        }

        for (int i = nMin; i < word2.length(); i++) {
            result.append(word2.charAt(i));
        }

        return result.toString();
    }
}