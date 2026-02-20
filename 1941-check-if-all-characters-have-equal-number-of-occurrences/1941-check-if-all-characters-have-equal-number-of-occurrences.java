class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int benchmarkFreq = freq.get(s.charAt(0));
        for (Integer f : freq.values()) {
            if (f != benchmarkFreq) {
                return false;
            }
        }

        return true;
    }
}