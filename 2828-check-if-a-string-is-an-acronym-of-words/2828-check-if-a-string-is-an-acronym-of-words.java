class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder charFromWords = new StringBuilder();

        for (String word : words) {
            charFromWords.append(word.charAt(0));
        }

        return charFromWords.toString().equals(s);
    }
}
