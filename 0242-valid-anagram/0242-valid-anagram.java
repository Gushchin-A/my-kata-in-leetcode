class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            letters.put(charS, letters.getOrDefault(charS, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char charT = t.charAt(i);
            letters.put(charT, letters.getOrDefault(charT, 0) - 1);

            if (letters.get(charT) < 0) {
                return false;
            }

            if (letters.get(charT) == 0) {
                letters.remove(charT);
            }
        }

        return letters.size() == 0;
    }
}