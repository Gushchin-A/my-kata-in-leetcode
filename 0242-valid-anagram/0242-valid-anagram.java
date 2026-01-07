class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int charS = s.charAt(i) - 'a';
            int charT = t.charAt(i) - 'a';

            letters[charS] += 1;
            letters[charT] -= 1;
        }

        for (int l : letters) {
            if (l != 0) {
                return false;
            }
        }

        return true;
    }
}