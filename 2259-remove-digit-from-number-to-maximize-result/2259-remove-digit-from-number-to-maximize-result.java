class Solution {
    public String removeDigit(String number, char digit) {
        char[] digits = number.toCharArray();
        int n = digits.length;

        boolean replacedDigit = false;
        for (int i = 0; i < n; i++) {
            if (digits[i] == digit) {
                if (i < n - 1) {
                    if (digits[i + 1] > digits[i]) {
                        digits[i] = '0';
                        replacedDigit = true;
                        break;
                    }
                }
            }
        }

        if (!replacedDigit) {
            for (int i = n - 1; i >= 0 ; i--) {
                if (digits[i] == digit) {
                    digits[i] = '0';
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder(n - 1);
        for (int i = 0; i < n; i++) {
            if (digits[i] != '0') {
                sb.append(digits[i]);
            }
        }

        return sb.toString();
    }
}
