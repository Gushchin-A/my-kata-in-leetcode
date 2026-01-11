class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a'] += 1;
            letters[t.charAt(i) - 'a'] -= 1;
        }
        letters[t.charAt(t.length() - 1) - 'a'] -= 1;

        char c = t.charAt(0);
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return (char) (i + 'a');
            }
        }

        return c;
    }
}