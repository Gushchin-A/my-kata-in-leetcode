class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            if (result == Integer.MAX_VALUE / 10 && Math.abs(digit) > 7) {
                return 0;
            } else if (result == Integer.MIN_VALUE / 10 && Math.abs(digit) > 8) {
                return 0;
            }

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }
}