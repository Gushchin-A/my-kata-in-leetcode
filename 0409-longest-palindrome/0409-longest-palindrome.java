class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char c : s.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        int longestPalindrome = 0;
        boolean takenWithoutPair = false;
        for (char c : s.toCharArray()) {
            if (letters.get(c) == null) {
                continue;
            }
            
            if (letters.get(c) % 2 == 0) {
                longestPalindrome += letters.get(c);
            } else if (letters.get(c) % 2 != 0 && !takenWithoutPair) {
                longestPalindrome += letters.get(c);
                takenWithoutPair = true;
            } else if (letters.get(c) % 2 != 0 && letters.get(c) != 1) {
                longestPalindrome += letters.get(c) - 1;
            }
            letters.remove(c);
        }

        return longestPalindrome;
    }
}