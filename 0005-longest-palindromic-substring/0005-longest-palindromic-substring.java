class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String longestSubstring = "";

        for (int i = 0; i < n; i++) {
            StringBuilder tempSubstring = new StringBuilder();
            tempSubstring.append(s.charAt(i));
            if (isStringPalindrome(tempSubstring.toString())) {
                if (tempSubstring.length() > longestSubstring.length()) {
                    longestSubstring = tempSubstring.toString();
                }
            }
            for (int j = i + 1; j < n; j++) {
                tempSubstring.append(s.charAt(j));
                if (isStringPalindrome(tempSubstring.toString())) {
                    if (tempSubstring.length() > longestSubstring.length()) {
                        longestSubstring = tempSubstring.toString();
                    }
                }
            }
        }

        return longestSubstring;
    }

    private boolean isStringPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

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