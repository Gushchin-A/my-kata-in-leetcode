class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String longestSubstring = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            if (n - i <= longestSubstring.length()) {
                break;
            }
            for (int j = i + 1; j < n; j++) {
                int currentLength = j - i + 1;
                if (currentLength <= longestSubstring.length()) {
                    continue;
                }
                if (isStringPalindrome(s, i, j)) {
                    longestSubstring = s.substring(i, j + 1);
                }
            }
        }

        return longestSubstring;
    }

    private boolean isStringPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}