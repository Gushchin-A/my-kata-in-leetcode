class Solution {
    public int maxProduct(int n) {
        int[] digits = getDigitsFromNumber(n);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }

        return max1 * max2;
    }

    private int[] getDigitsFromNumber(int n) {
        int size = 0;
        int copy = n;
        
        while (copy > 0) {
            size++;
            copy /= 10;
        }

        int[] result = new int[size];
        int indexRes = 0;
        while (n > 0) {
            result[indexRes++] = n % 10;
            n /= 10;
        }

        return result;
    }
}
