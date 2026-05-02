class Solution {
    public int reverse(int x) {
        boolean isPositive = x > 0 ? true : false;
        int length = getLengthNumber(x);

        int[] tempDigits = new int[length];
        int index = 0;
        if (isPositive) {
            while (x > 0) {
                tempDigits[index++] = x % 10;
                x /= 10;
            }
        } else {
            while (x < 0) {
                tempDigits[index++] = x % 10;
                x /= 10;
            }
        }

        int result = 0;
        for (int digit : tempDigits) {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            if (result == Integer.MAX_VALUE / 10 && Math.abs(digit) > 7) {
                return 0;
            } else if (result == Integer.MIN_VALUE / 10 && Math.abs(digit) > 8) {
                return 0;
            }
            
            result = result * 10 + digit;
        }

    return result;

    }

    private int getLengthNumber(int num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }

        while (num < 0) {
            num /= 10;
            length++;
        }

        return length;
    }
}