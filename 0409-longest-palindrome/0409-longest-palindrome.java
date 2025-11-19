class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char c : s.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        int longestPalindrome = 0;
        int unnecessary = 0;
        for (char c : s.toCharArray()) {
            if (letters.get(c) == null) {
                continue;
            }

            if (letters.get(c) % 2 == 0) {
                longestPalindrome += letters.get(c);
            } else {
                longestPalindrome += letters.get(c) - 1;
                unnecessary++;
            }
    
            letters.remove(c);
        }

        return unnecessary > 0 ? longestPalindrome + 1 : longestPalindrome;
    }
}