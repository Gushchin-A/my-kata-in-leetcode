class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String longestSubstring = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longestSubstring.length()) {
                    longestSubstring = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longestSubstring.length()) {
                    longestSubstring = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return longestSubstring;
    }
}