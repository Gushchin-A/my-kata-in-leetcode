class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        int indexLetterTwice = 0;
        for (int i = 0; i < s.length(); i++) {
            freq.merge(s.charAt(i), 1, Integer::sum);
            if (freq.get(s.charAt(i)) == 2) {
                indexLetterTwice = i;
                break;
            }
        }

        return s.charAt(indexLetterTwice);
    }
}
