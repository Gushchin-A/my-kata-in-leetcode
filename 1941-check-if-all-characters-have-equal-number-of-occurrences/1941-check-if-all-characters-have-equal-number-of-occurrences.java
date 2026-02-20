class Solution {
    public boolean areOccurrencesEqual(String s) {
        int maxLetters = 26;
        int[] freq = new int[maxLetters];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int benchmarkFreq = freq[s.charAt(0) - 'a'];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                if (freq[i] != benchmarkFreq) {
                    return false;
                }
            }
        }

        return true;
    }
}