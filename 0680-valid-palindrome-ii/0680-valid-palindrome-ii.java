class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (validPalindromeForIndex(s, left + 1, right)) {
                    return true;
                } else {
                    if (validPalindromeForIndex(s, left, right - 1)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean validPalindromeForIndex(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
