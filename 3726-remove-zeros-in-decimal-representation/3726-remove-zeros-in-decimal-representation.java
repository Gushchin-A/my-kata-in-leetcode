class Solution {
    public long removeZeros(long n) {
        if (n < 10) {
            return n;
        }

        StringBuilder temp = new StringBuilder();
        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                temp.append(digit);
            }
            n = n / 10;
        }

        return Long.parseLong(temp.reverse().toString());
    }
}