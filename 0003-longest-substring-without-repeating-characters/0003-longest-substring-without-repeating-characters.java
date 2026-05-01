class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> uniq = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (!uniq.add(c)) {
                    break;
                }
            }
            maxLength = Math.max(uniq.size(), maxLength);
        }

        return maxLength;
    }
}