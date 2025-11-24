class Solution {
    public long removeZeros(long n) {
        long result = 0;
        long placeValue = 1;

        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                result += digit * placeValue;
                placeValue *= 10;
            }
            n = n / 10;
        }

        return result;
    }
}