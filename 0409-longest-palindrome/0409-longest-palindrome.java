class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char c : s.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        int longestPalindrome = 0;
        boolean extra = false;
        for (Character key : letters.keySet()) {
            if (letters.get(key) % 2 == 0) {
                longestPalindrome += letters.get(key);
            } else {
                longestPalindrome += letters.get(key) - 1;
                extra = true;
            }
        }

        return extra ? longestPalindrome + 1 : longestPalindrome;
    }
}