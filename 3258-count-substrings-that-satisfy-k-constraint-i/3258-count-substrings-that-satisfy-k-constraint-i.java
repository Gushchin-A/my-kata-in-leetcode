class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int zero = 0;
        int one = 0;
        int countSubstring = 0;

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (s.charAt(right) == '0') {
                zero++;
            } else {
                one++;
            }

            if (zero > k && one > k) {
                while (zero > k && one > k) {
                    if (s.charAt(left) == '0') {
                        zero--;
                    } else {
                        one--;
                    }
                    left++;
                }
            }

            countSubstring += right - left + 1;
            right++;
        }

        return countSubstring;
    }
}
