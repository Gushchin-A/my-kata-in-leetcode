class Solution {
    public int numberOfSpecialChars(String word) {
        int[] upper = new int[26];
        int[] lower = new int[26];

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a']++;
            } else {
                upper[Character.toLowerCase(ch) - 'a']++;
            }
        }

        int result = 0;
        for (int i  = 0; i < 26; i++) {
            if (upper[i] > 0 && lower[i] > 0) {
                result++;
            }
        }

        return result;
    }
}
