class Solution {
    private static final Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u');

    public int countVowelSubstrings(String word) {
        int needVowel = 5;
        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            int[] counts = new int[26];
            int uniq = 0;

            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);

                if (!vowel.contains(c)) {
                    break;
                }

                counts[c - 'a']++;
                if (counts[c - 'a'] < 2) {
                    uniq++;
                }

                if (uniq == needVowel) {
                    result++;
                }
            }
        }

        return result;
    }
}
