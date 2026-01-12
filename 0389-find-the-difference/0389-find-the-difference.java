class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letters.merge(s.charAt(i), 1, (oldValue, newValue) -> oldValue + newValue);
        }
        for (int i = 0; i < t.length(); i++) {
            letters.merge(t.charAt(i), -1, (oldValue, newValue) -> oldValue + newValue);
        }

        for (Character key : letters.keySet()) {
            if (letters.get(key) < 0) {
                return key;
            }
        }

        return 0;
    }
}