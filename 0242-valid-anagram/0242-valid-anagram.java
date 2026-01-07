class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            letters.put(charS, letters.getOrDefault(charS, 0) + 1);
            letters.put(charT, letters.getOrDefault(charT, 0) - 1);
        }

        for (Integer value : letters.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}