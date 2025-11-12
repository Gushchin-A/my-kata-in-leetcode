class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String w : words) {
            if (w.length() > s.length()) {
                continue;
            }
            if (s.startsWith(w)) {
                count++;
            }
        }

        return count;
    }
}